# LAB 05 / LINUX · 계정·권한·ACL

Rocky Linux 관리 서버에서 **4개 그룹·7명 사용자**를 구성하고, 팀 공용·개인·팀장 전용 공간의 접근 정책을 명령과 검증 절차로 정리했습니다.

**현재 상태는 과제 설계·절차 정리입니다. 적용·SSH 검증 완료 기록은 없습니다.**

[Notion 상세 설정과 과제 구성도](https://app.notion.com/p/3edddb1a637781feb0bbffdf27cc62fe)

## 구성과 정책

| 구분 | 기준 |
|---|---|
| Manage | Rocky Linux 9.7, VMnet2, 192.169.9.22/24 |
| 게이트웨이 / DNS | 192.169.9.1 / 192.168.9.53 |
| 외부 접속 | Windows 10 → 10.9.0.22:22 → VyOS DNAT → Manage |
| 주소 충돌 방지 | DHCP에서 192.169.9.22 제외 |
| 계정 | infra 1명, backend 3명, frontend 2명, dba 1명 |
| 로그인 정책 | 공통 초기 비밀번호 지정 후 최초 로그인에서 변경 |

과제에 혼재한 VMnet1 표기보다 본사 내부망 VMnet2 조건과 192.169.9.0/24 구성을 기준으로 절차를 정리했습니다. 실제 장비에 적용되었는지는 미확인입니다.

| 공간 | 허용 대상 | 설정 원리 |
|---|---|---|
| 팀 공용 | 같은 팀 읽기·쓰기·접근, 타 팀 읽기·접근 | 소유 그룹, 3775, 기본 ACL |
| 개인 | 본인 | 소유자, 700, 본인 전용 기본 ACL |
| leaders | shkang, jskim, mjchoi, hjnam | Named User ACL과 Default ACL |

## 설정 파일과 목적

| 목적 | 원문에서 분리한 코드 | 의미 |
|---|---|---|
| 외부 SSH 전달 | [기존 규칙 확인](configs/01-vyos-rule-check.commands), [DNAT](configs/02-vyos-ssh-dnat.commands) | 외부 전용 주소의 22번을 Manage로 전달 |
| 사용자·그룹 생성 | [계정 생성](configs/05-groups-users.commands) | 팀을 primary group으로 지정하고 홈 디렉터리 생성 |
| 최초 비밀번호 변경 | [초기 비밀번호 정책](configs/06-initial-password.commands.example) | 초기값 지정 후 chage -d 0으로 만료 |
| 팀 공용 작업 | [공용 공간](configs/07-team-workspace.commands) | Setgid로 그룹 상속, Sticky bit로 타인 소유 항목 삭제 제한 |
| 개인 작업 | [개인 공간](configs/08-private-workspace.commands) | 소유자만 접근하고 새 항목도 개인 권한으로 생성 |
| 팀장 협업 | [팀장 ACL](configs/09-leaders-acl.commands) | 별도 그룹 없이 네 사용자와 새 항목의 접근 범위 지정 |
| 서비스 적용 | [서비스](configs/10-services.commands) | SSH·방화벽 실행과 부팅 후 실행 등록 |

[configs](configs/)에는 14개 원문 코드 블록을 실행 위치별로 보관했습니다. `.commands`는 절차 참고용이며 자동 배포 스크립트가 아닙니다. 상대 경로 명령은 원문과 같이 `/data/workspace`에서 실행하는 단계입니다.

## 왜 확인하는가 → 명령 → 기대 결과

| 확인 목적 | 실행 사용자·명령 | 기대 결과 | 실제 결과 |
|---|---|---|---|
| 외부 연결과 로그인 정책 | Windows에서 `ssh dhlee@10.9.0.22` | 최초 비밀번호 변경 요구 | 미확보 |
| 다른 팀 쓰기 거부 | dhlee로 frontend에 `touch` | Permission denied | 미확보 |
| 개인·공용 권한 차이 | dhlee로 파일 생성 후 `ls -l` | 개인 600, 공용 664, 그룹 backend | 미확보 |
| 개인 공간 보호 | jskim으로 dhlee 디렉터리 `cd` | Permission denied | 미확보 |
| 타인 파일 삭제 제한 | jskim으로 dhlee 소유 shared.txt `rm` | Sticky bit에 의해 거부 | 미확보 |
| 팀장 권한 상속 | jskim으로 새 경로 생성 후 `getfacl` | 네 팀장과 ACL mask 확인 | 미확보 |

검증 명령은 [dhlee 테스트](configs/12-dhlee-test.commands), [jskim 테스트](configs/14-jskim-test.commands)에 있습니다. 허용과 거부가 모두 확인되어야 정책 검증이 됩니다. root로 실행한 결과는 일반 사용자의 권한 검증을 대신하지 않습니다.

## 문제 해결 기록 방식

아직 실제 장애와 해결 결과가 기록된 사례는 없습니다. 향후 결과를 다음 순서로 추가합니다.

1. **현상:** 실행 사용자, 대상 경로, 명령, 실제 오류 메시지.
2. **확인:** 접속 문제는 가상망·주소 → DNAT·방화벽 → SSH 인증. 권한 문제는 상위 경로 접근 → 소유자·그룹 → ACL·mask.
3. **원인:** 실제 출력으로 확인한 항목만 확정.
4. **수정:** 변경 명령과 적용 대상 기록.
5. **재검증:** 동일 사용자·명령에서 재확인하고 허용·거부 결과를 함께 보관.

## 재사용 조건

- 공개 코드의 초기 비밀번호는 `CHANGE_ME_INITIAL_PASSWORD`로 치환했습니다. 자신의 실습값으로 바꿔야 합니다. 기존 계정에 해당 루프를 반복 실행하면 비밀번호가 재설정됩니다.
- DNAT 규칙 22는 미사용 번호일 때만 사용하는 원문 조건을 유지합니다. 기존 전달 방화벽 정책은 확인되지 않아 새로운 정책을 지어 넣지 않았습니다.
- `firewall-cmd` 단계는 firewalld가 실행 중인 환경을 전제로 합니다. 이 전제가 실제 장비에서 확인되었다는 기록은 없습니다.
- Sticky bit는 설정한 디렉터리 바로 아래 항목의 삭제·이름 변경에 작용하며 새 하위 디렉터리로 자동 상속되지 않습니다.
- 기본 ACL의 결과는 파일을 만드는 프로그램의 요청 mode에도 영향을 받습니다. 일반 파일에 실행 권한이 자동으로 생기는 것은 아닙니다.
- `leaders`에 ACL을 설정한 뒤 `chmod 700 leaders`를 다시 실행하면 mask가 제한될 수 있으므로 설정 순서를 유지합니다.

## 출처

[SOURCE_MANIFEST.json](SOURCE_MANIFEST.json)에 원문 토글, 코드 블록 번호, 추출 기준과 초기 비밀번호 치환 내역을 기록했습니다. 실제 출력·구성 완료·장애 원인은 만들어 넣지 않았습니다.

- [Linux ACL](https://man7.org/linux/man-pages/man5/acl.5.html)
- [디렉터리 생성과 Setgid 상속](https://man7.org/linux/man-pages/man2/mkdir.2.html)

# 유용수 · Infrastructure & Network Lab

Linux Server와 Network를 구성하며 **주소 설정 → 경로 연결 → Service 실행 → 접속 확인**의 흐름을 학습하고 있습니다. 설정의 역할과 장비 사이의 연결을 설명하고, 문제가 생기면 확인한 사실을 기준으로 원인을 좁히는 데 집중합니다.

인프라·클라우드·네트워크 분야를 준비하는 개인 실습 기록입니다. 현재 학습 주제는 Kubernetes입니다.

[Notion 인프라 포트폴리오](https://app.notion.com/p/3e2ddb1a637780dcb8fdf5fb65c7328e) · [자료 점검과 보완 범위](docs/portfolio-audit.md)

## Featured Labs

| 실습 | 실제 확인한 범위 | 자료 |
|---|---|---|
| 03 · Domain & Server Recovery | DNS 응답·FastAPI 기동 확인, WAS 파일 누락과 DB 주소 불일치 추적 | [GitHub](labs/03-domain/) · [Notion](https://app.notion.com/p/3e3ddb1a637781af9665f2df397232d6) |
| 07 · iSCSI Storage Connection | ESXi Host 2대 등록, TrueNAS Target–Extent 설정과 두 번째 Host의 Disk 연결 확인 | [GitHub](labs/07-vsphere/) · [Notion](https://app.notion.com/p/3efddb1a637781ebac8dfd2ad3efa622) |
| 08 · Pod Deployment & Diagnosis | 개인 v1 Image Build·Pod 실행·삭제 확인, hostPath Mount 장애 추적 | [GitHub](labs/08-kubernetes/) · [Notion](https://app.notion.com/p/3efddb1a637781e081c6f06d07a75d5a) |

## Portfolio Labs

개인 실행 화면과 설정·문제 추적 기록을 함께 확인할 수 있는 항목입니다. 각 결과의 확인 범위와 미해결 항목을 구분합니다.

| 실습 | 수록 자료 | 확인 범위 |
|---|---|---|
| [03 · Domain](labs/03-domain/) | DNS·계층 분리 설정, 서비스 파일 기록, 복구 화면, 본사·지사 후속 기록 | DNS 응답·서비스 기동·DB 주소 복구의 실제 화면 확보. 최종 로그인·저장·재조회 성공은 원문 서술 |
| [06 · Docker](labs/06-containers/) | Bridge·PostgreSQL 수업 명령, 개인 실행·오류 기록 | 패키지 설치와 hello-world 정상 종료 확인. Bridge 통신·DB 조회·영구 저장은 미확인 |
| [07 · vSphere](labs/07-vsphere/) | 수업 절차와 개인 Host·TrueNAS 연결 화면 | 두 ESXi Host 등록, 두 번째 Host의 iSCSI Disk 연결 확인. vMotion·DRS 완료는 미확인 |
| [08 · Kubernetes](labs/08-kubernetes/) | Manifest 9개·Dockerfile 원문과 개인 실행·장애 기록 | Pod 실행·삭제와 개인 v1 Build 확인. Push 권한·hostPath 장애의 최종 해결 및 Service HTTP 응답은 미확인 |

## Study Notes

[Notion Study Notes](https://app.notion.com/p/3efddb1a6377816e9629d29cbc8d92cb)

설정·과제 원문과 재실습 참고 자료입니다. 직접 수행한 결과의 근거가 추가되기 전에는 대표 실습에 포함하지 않습니다. 기존 명령과 파일은 보존합니다.

| 자료 | 보존한 내용 | 현재 확인 범위 |
|---|---|---|
| [01 · Packet Tracer](labs/01-packet-tracer/) | 8개 장비의 설정 222개와 출처 | 노트 전사. 실제 Routing·VLAN·ping 출력 미첨부 |
| [02 · Web·DB](labs/02-three-tier/) | NAT·Apache·MariaDB 설정, 회수한 과제 프로그램과 SQL | 초기 실습의 HTTP·DB 저장·재부팅 결과 미확보. 후속 Domain 화면과 구분 |
| [05 · Linux ACL](labs/05-linux-acl/) | 사용자·그룹·공용·개인·팀장 공간의 권한 정책 | 과제 절차. 실제 허용·거부 및 SSH 검증 미확인 |

## Archive / Draft

[Notion Archive / Draft](https://app.notion.com/p/3efddb1a637781db92e8ceccbf31751a)

| 자료 | 보존한 기록 | 진행 상태 |
|---|---|---|
| [04 · VPN](labs/04-vpn/) | Sophos UTM 주소·GUI 절차, Remote Gateway 생성 화면, Gateway 도달 실패 보고 | 저장 전 입력 화면 확인. 실제 터널 상태·협상 로그·양방향 ping 미확보 |

### 구성 단계의 구분

| 구분 | 02. 기본 구성 자료 | 03. Domain 확장 기록 |
|---|---|---|
| 사용자 접속 | VyOS 외부 주소의 TCP 80 | 자체 DNS를 사용하는 Domain 접속 |
| Web·App | 같은 VM의 Apache → FastAPI | 별도 Web VM → WAS VM의 FastAPI |
| DB | 별도 MariaDB VM | 별도 MariaDB VM, Domain으로 연결 |
| 검증 대상 | HTTP 전달·App 실행·데이터 저장 | DNS 응답·계층별 연결·DB 인증 |

주소와 Interface는 각 실습 폴더의 구성표를 기준으로 합니다. 초기 구성, 9월 25일 Domain 복구, 9월 27일 이후 본사·지사 확장 기록을 구분합니다.

설정 원문, 재실습 보완, 실제 결과는 각 폴더에서 구분합니다. 2026년 10월 4일 과거 첨부 파일과 당시 인계문을 추가 회수했으며, 각 출처에 원본 날짜와 확인 범위를 남겼습니다. 정상 출력 예시를 실행 결과로 표시하지 않았으며, 이번 문서 정리에서 장비를 다시 실행하지 않았습니다.

## Verification & Troubleshooting

1. **연결·주소:** 가상 NIC 연결, Interface 상태, IP·Subnet·Gateway 확인.
2. **경로·DNS:** Routing Table과 이름 조회 응답 확인.
3. **Service:** 프로세스 상태, 설정 문법, Listen 주소·Port 확인.
4. **접근·기능:** 방화벽·계정 권한 확인 후 HTTP 응답과 DB 저장·재조회를 분리해 확인.

Domain 확장 기록에서는 DB의 실제 주소와 App 설정 불일치, VyOS eth3 주소 누락, DB 인증 거부, Host 가상 어댑터와 Gateway 주소 충돌, WAS 프로그램 파일 누락을 다룹니다. [문제·확인·조치·검증의 연결](https://github.com/cod9736-source/github-practice/tree/main/labs/03-domain)을 실제 중간 출력과 대조할 수 있습니다. DNS 응답·서비스 기동과 최종 사용자 기능 성공을 구분했으며, 9월 25일 성공 서술을 후속 본사·지사 환경의 성공으로 옮기지 않았습니다.

## 학습한 점

- 가상 NIC 연결 문제와 IP·Routing 설정 문제를 나누어 확인합니다.
- SNAT와 DNAT가 적용되는 방향과 대상을 구분합니다.
- DNS 조회 성공, 네트워크 도달, DB 인증 성공은 서로 다른 확인 항목입니다.
- HTTP 200뿐 아니라 응답 본문의 App 오류와 데이터 저장 결과도 확인합니다.
- 설정 예제, 적용 기록, 실제 출력의 출처를 구분해 남깁니다.

## 개발 경험

[EduPOP](https://github.com/Seo-Yeon-Choi/EduPOP)은 팀 교육 Service 프로젝트입니다. 제 계정의 실제 Commit으로 확인한 기여는 다음과 같습니다.

- [독서감상문 요청 처리·Service·Mapper·학생 화면 변경](https://github.com/Seo-Yeon-Choi/EduPOP/commit/df1f22423f2501cb4805a7b205cc12a566e490bd)
- [EXP Service·Mapper와 독서 기능 연결 변경](https://github.com/Seo-Yeon-Choi/EduPOP/commit/f1b3a8e1012a1b158f941fb880d566f3e864c1e8)

Web 요청이 DB 저장으로 이어지는 흐름을 이해하는 보조 경험입니다. 팀 전체 구현과 개인 기여를 구분하며, 이 소스만으로 인프라 운영 배포가 완료됐다고 표시하지 않습니다.

## Documentation

- 각 Lab의 README와 출처 기록에서 설정 범위·검증 방법·미확인 항목을 확인할 수 있습니다.
- 실제 비밀번호와 Key는 대체값으로 처리합니다. 설정 조각은 환경을 확인한 뒤 사용해야 합니다.
- Notion의 비로그인 공개 열람은 아직 확인하지 않았습니다.
- 기존 Git 연습 파일 `f1.txt`, `f2.txt`와 저장소 이름 `github-practice`는 유지합니다.
- [GitHub Profile](https://github.com/cod9736-source)에서 대표 실습과 문서로 이동할 수 있습니다.


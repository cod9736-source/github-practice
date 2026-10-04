# 유용수 · Infrastructure & Network Lab

Linux Server와 Network를 구성하며 **주소 설정 → 경로 연결 → Service 실행 → 접속 확인**의 흐름을 학습하고 있습니다. 설정의 역할과 장비 사이의 연결을 설명하고, 문제가 생기면 확인한 사실을 기준으로 원인을 좁히는 데 집중합니다.

인프라·클라우드·네트워크 분야를 준비하는 개인 실습 기록입니다. 현재 학습 주제는 Kubernetes입니다.

[Notion 인프라 포트폴리오](https://app.notion.com/p/3e2ddb1a637780dcb8fdf5fb65c7328e) · [자료 점검과 보완 범위](docs/portfolio-audit.md)

## 대표 실습

| 실습 | 목적과 주요 설정 | 자료 |
|---|---|---|
| 01 · VLAN과 Routing | VLAN 10·20, Access·Trunk, SVI, Routing Port, RIP v2로 단말망과 경로 연결 | [GitHub](https://github.com/cod9736-source/github-practice/tree/main/labs/01-packet-tracer) · [Notion](https://app.notion.com/p/3e3ddb1a6377814098b1f6f3d4f9ad96) |
| 02 · Web·DB 연동 | VyOS SNAT·DNAT, Apache ProxyPass, FastAPI와 MariaDB 연결 | [GitHub](https://github.com/cod9736-source/github-practice/tree/main/labs/02-three-tier) · [Notion](https://app.notion.com/p/3e3ddb1a6377810f8416ec6ce8471c71) |
| 03 · Domain과 역할 분리 | DNS Zone, Web·WAS·DB 분리, Domain 연결과 접속 오류 점검 | [GitHub](https://github.com/cod9736-source/github-practice/tree/main/labs/03-domain) · [Notion](https://app.notion.com/p/3e3ddb1a637781af9665f2df397232d6) |

### Architecture와 환경

| 구분 | 02. 기본 구성 | 03. Domain 확장 |
|---|---|---|
| 사용자 접속 | VyOS 외부 주소의 TCP 80 | 자체 DNS를 사용하는 Domain 접속 |
| Web·App | 같은 VM의 Apache → FastAPI | 별도 Web VM → WAS VM의 FastAPI |
| DB | 별도 MariaDB VM | 별도 MariaDB VM, Domain으로 연결 |
| 핵심 확인 | HTTP 전달·App 실행·데이터 저장 | DNS 응답·계층별 연결·DB 인증 |

VMware 가상망과 Linux 환경의 설정 기록을 장비별로 분리했습니다. VyOS 명령 문법과 실제 설치 버전 확인은 구분하며, 주소와 인터페이스는 **각 실습 폴더의 구성표**를 기준으로 합니다. 기본 실습의 주소를 확장 실습에 그대로 적용하지 않습니다.

## 전체 실습과 증거 상태

| 실습 | 수록 자료 | 확인 범위 |
|---|---|---|
| [01 · Packet Tracer](https://github.com/cod9736-source/github-practice/tree/main/labs/01-packet-tracer) | 8개 장비의 설정 222개와 출처 | 노트 전사. 실제 Routing·VLAN·ping 출력은 미첨부 |
| [02 · Web·DB](https://github.com/cod9736-source/github-practice/tree/main/labs/02-three-tier) | NAT·Apache·MariaDB 설정과 실행 절차 | 설정 원문 확보. HTTP·DB 저장·재부팅 결과는 미확보 |
| [03 · Domain](https://github.com/cod9736-source/github-practice/tree/main/labs/03-domain) | DNS·계층 분리 설정과 오류 복구 기록 | 원문에 로그인·목록·작성 후 재조회 성공 서술. 대응하는 원시 출력은 미첨부 |
| [04 · VPN](https://github.com/cod9736-source/github-practice/tree/main/labs/04-vpn) | Sophos UTM Site-to-Site IPsec 주소·GUI 설정 절차 | 실제 터널 상태·협상 로그·양방향 ping은 미첨부 |
| [05 · Linux ACL](https://github.com/cod9736-source/github-practice/tree/main/labs/05-linux-acl) | 사용자·그룹·공용·개인·팀장 공간의 권한 정책 | 과제 절차. 실제 허용·거부 및 SSH 검증은 미확인 |
| [06 · Docker](https://github.com/cod9736-source/github-practice/tree/main/labs/06-containers) | Bridge Network·Container·PostgreSQL 명령 | 학습 예제와 재실습 보완 명령. 실행·영구 저장 증빙과 구분 |
| [07 · vSphere](https://github.com/cod9736-source/github-practice/tree/main/labs/07-vsphere) | ESXi·vCenter·공유 Storage·vMotion·DRS 수업 절차 | 개인 Host Export·작업 이력은 미확보 |
| [08 · Kubernetes](https://github.com/cod9736-source/github-practice/tree/main/labs/08-kubernetes) | Pod·Deployment·DaemonSet Manifest 4개 | 학습 예제. 개인 Cluster 실행 결과와 대조 전 |

설정 원문, 재실습 보완, 실제 결과는 각 폴더에서 구분합니다. 정상 출력 예시를 실행 결과로 표시하지 않았으며, 이번 문서 정리에서 장비를 다시 실행하지 않았습니다.

## Verification & Troubleshooting

1. **연결·주소:** 가상 NIC 연결, Interface 상태, IP·Subnet·Gateway 확인.
2. **경로·DNS:** Routing Table과 이름 조회 응답 확인.
3. **Service:** 프로세스 상태, 설정 문법, Listen 주소·Port 확인.
4. **접근·기능:** 방화벽·계정 권한 확인 후 HTTP 응답과 DB 저장·재조회를 분리해 확인.

Domain 확장 기록에서는 DB의 실제 주소와 App 설정 불일치, VyOS eth3 주소 누락, DB 인증 거부, Host 가상 어댑터와 Gateway 주소 충돌을 다룹니다. [문제·확인·조치·검증의 연결](https://github.com/cod9736-source/github-practice/tree/main/labs/03-domain)을 읽을 수 있으며, 성공 여부는 원문 서술과 원시 출력 확보 여부를 구분했습니다.

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

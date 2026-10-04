# 본사·지사 확장 — 회수한 설정과 검증 기록

2026년 9월 25일의 단일 Domain·서버 분리 실습 다음 단계입니다. 본사에 DNS·DHCP를 두고, 지사에 iptables·DNS·WEB·WAS·DB를 나누는 과제의 실제 캡처를 회수했습니다.

**지사 DNS 응답과 서비스 기동은 확인했습니다. WEB→WAS 연결 실패와 DB 인증 오류도 확인했으며, 지사 전체 기능의 최종 성공을 뜻하지 않습니다.**

## 역할과 주소

| 구간 | 회수한 값 | 증거 범위 |
|---|---|---|
| 지사 외부 | ens33: 10.9.1.1/8, 10.9.1.53/8, 10.9.1.80/8 | 주소 출력 |
| 지사 내부 | ens34: 172.16.9.1/16, ens35: 172.17.9.1/16 | 해당 시점 주소 출력. 후속 프로필 미연결 상태도 존재 |
| DNS DNAT | 10.9.1.53:53 → 172.16.9.53:53 | UDP 47 packets / 3386 bytes |
| WEB DNAT | 10.9.1.80:80 → 172.17.9.80:80 | 규칙 존재. 해당 캡처 카운터 0 |
| WEB → WAS | WEB 172.18.9.1 → 172.18.9.2:8000 | 직접 요청과 Apache backend 연결 실패 |
| WAS → DB | DB 목적지 172.19.9.2:3306, WebTest, yongsu | 설정 화면 + 인증 오류. 최종 정상 연결 미확인 |

`/16`은 실제 화면의 값입니다. 최종 주소 계획 전체가 검증됐다는 뜻은 아닙니다. 이전 192.168·169·170 대역의 9월 25일 설정과 시점을 구분합니다.

## 실제 확인 결과

| 확인 항목 | 결과 | 파일 |
|---|---|---|
| 지사 DNS 조회 | www.yys.ke → 10.9.1.80 | [DNS 응답](branch-dns-success-20260928.png) |
| NAT 규칙 도달 | DNS UDP만 해당 시점 카운터 증가 | [NAT 카운터](branch-nat-counters-20260928.png) |
| FastAPI 기동 | startup complete, Uvicorn 0.0.0.0:8000 | [서비스 로그](branch-fastapi-log-20261001.png) |
| WEB → WAS | 직접 IP 요청과 backend 연결 모두 No route to host | [장애 출력](branch-web-backend-error-20261001.png) |
| DB 인증 | 1045, yongsu@_gateway 인증 거부 | [DB 오류](branch-db-auth-error-20261001.png) |
| 본사 DHCP | 역할 설치됨. 회수한 Client는 192.168.70.130 사용 | [관찰 기록](recorded-observations.txt) |

## 문제를 구분한 기준

- DNS 응답 성공, NAT 카운터 증가, 서비스 기동을 각각의 확인 범위로 구분.
- WEB의 로컬 `/api` 요청과 WAS IP 직접 요청을 비교하여 backend 구간 확인.
- 후속 주소 캡처의 172.18.9.1 중복 표기와 방화벽 허용 규칙을 대조할 단서로 보존. 최종 원인과 수정 결과는 미확보.
- DB 1045를 네트워크 도달 실패와 구분. `_gateway`를 특정 IP로 임의 치환하지 않음.

[실제 입력 명령](recorded-commands.txt) · [관찰 결과](recorded-observations.txt) · [DB 설정 일부](database-settings.fragment.py) · [출처와 한계](PROVENANCE.md)

[Notion 상세 구성·판단·문제 해결 기록](https://app.notion.com/p/3e3ddb1a637781af9665f2df397232d6)


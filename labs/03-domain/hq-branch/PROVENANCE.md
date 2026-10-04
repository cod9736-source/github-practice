# 출처와 공개 범위

2026년 10월 4일, 과거 대화에 첨부하여 보관한 원본 캡처를 회수하고 픽셀을 대조했습니다. 이 폴더는 9월 27일~10월 1일 본사·지사 후속 과제의 일부 기록이며 완성된 장비 설정 백업이 아닙니다.

## 게시한 원본 이미지

| 공개 파일 | 원본 이름 | 보관된 원본 ID |
|---|---|---|
| branch-nat-counters-20260928.png | image(8).png · 9월 28일 | libfile_2f65902ed31c8191963c7d45e2c3f603 |
| branch-dns-success-20260928.png | image(9).png · 9월 28일 | libfile_140bc243504c8191b131aa87945d8ee1 |
| branch-web-backend-error-20261001.png | image(20260930-151826).png | libfile_d828bea812d081919088eaed092814a1 |
| branch-fastapi-log-20261001.png | image(20260930-151051).png | libfile_f51b6965efe8819182cc035566fe1539 |
| branch-db-auth-error-20261001.png | image(20261001-111938).png | libfile_63662f79deec8191ad6480f485337cd8 |

원본 파일명의 시각은 UTC 저장 기준입니다. 공개 파일명은 한국 시간의 날짜로 맞췄습니다. 픽셀 변경 없이 파일명만 정리했습니다.

## 추가 대조 원본

- 과제 구성도: image(20260927-013639).png — libfile_095edf879be48191a4ec565b9b22826c. x는 과제의 자리표시자.
- iptables 장비 주소·서비스: image(20260927-082024).png — libfile_a6ce500b0e988191840ef8c3ab25c7cc.
- 후속 프로필 미연결 상태: 9월 28일 image(5).png — libfile_b2309042f3048191b2dea188ac8f6934.
- DNS zone 편집 중 화면: image(20260927-120719).png — libfile_ceb64bd06a5081919a1829d5f7d29464. 불필요한 토큰이 남아 있어 정상 zone 파일로 변환하지 않음.
- zone 로드 출력: image(20260927-121330).png — libfile_301baccbf8748191aa3b785accf240f4.
- DHCP 역할 상태: image(20260927-150910).png — libfile_0939e6e2641881918cd218f950ae0dc5.
- DHCP Client 출력: image(20260927-161852).png — libfile_4d4940cc6d8081919b469b8a37c52054.
- WEB 주소: image(20260930-152002).png — libfile_4f456e2739888191bac2ad40dcf2f62e.
- 후속 주소: image(20260930-152103).png — libfile_007692f365f0819194faa0281ae5ba35.
- 후속 firewalld: image(20260930-152135).png — libfile_ada67ba118e48191a5cbfcc7ced4d315.
- 로컬 WEB 연결 거부: image(20260930-151312).png — libfile_3a1f5b47bcb88191872b23b18b910815.
- 로컬 WEB 503: image(20260930-151653).png — libfile_cbc45c0fc6488191b57e215ea8eb5913.
- DB 직접 조회: image(20260930-150554).png — libfile_3f379e6eb07081919e709d9bcfc09ace.
- DB 연결 설정: image(20261001-112545).png — libfile_3a147a8bafa881919ade0a1c88be5755. 비밀번호가 있어 원본 이미지는 공개하지 않고 설정 일부만 치환하여 기록.

## 적용하지 않은 추정

- 실제 /16 마스크를 임의로 /24로 변경하지 않음.
- 원본의 pung 오타를 ping 통신 실패·명령 미설치로 해석하지 않음.
- NAT 규칙·카운터·서비스 기동을 최종 사용자 기능 성공으로 과장하지 않음.
- _gateway를 검증되지 않은 출발지 IP로 치환하지 않음.
- No route to host의 원인을 가상 NIC·라우팅·방화벽 중 하나로 단정하지 않음.
- 기존 9월 25일 사용자 성공 서술을 후속 지사 구성에 옮겨 쓰지 않음.
- 최종 iptables-save, 전체 systemd unit, 수정 후 전체 zone 파일은 확보하지 못해 만들어 넣지 않음.

[상세 실습 기록](https://app.notion.com/p/3e3ddb1a637781af9665f2df397232d6)


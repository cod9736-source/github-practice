# 2026-09-25 Domain WAS 복구: 원본 회수

2026-10-04에 과거 대화 첨부 파일과 동시기 인계문을 다시 찾아 보완한 기록이다. 현재 서버에서 새로 실행한 결과는 아니다.

## 과제 프로그램과 SQL

- 실제 첨부: `fastapi_3tier_v3(2).zip`, 2026-09-22 업로드, 13,175 bytes.
- 원본 ZIP SHA-256: `5e862d80e6ac3a69cc36b060bd137dfcaeca54f565c44196197d40c4c6478cf8`.
- [공개용 과제 프로그램](fastapi-3tier-training-template-sanitized.zip): 원본의 파일 15개 보존. `database.py`의 비밀값을 `CHANGE_ME_DB_PASSWORD`로 교체하고 비밀값 포함 접속 문자열 출력만 제거했다.
- [webtest_DB.sql](webtest_DB.sql): 원본 그대로 회수. `WebTest`와 `member`, `board` 생성문이며 실제 회원·게시글 데이터는 포함하지 않는다.
- 프로그램은 제공된 실습 자료다. 사용자의 애플리케이션 개발 기여나 최종 서버 전체 Export로 제시하지 않는다. 원본 `database.py`의 `localhost`·`kedu`는 템플릿 기본값이며, Domain 실습의 실제 `db.yys.ke`·`yongsu` 설정과 구분한다.
- 기존 DB의 데이터를 유지한 복구였으므로 SQL을 다시 입력한 작업으로 기록하지 않는다. 이 SQL에는 중복 실행 방지 구문이 없으며 초기 구조를 설명하는 원본이다.

## 재확보한 서비스와 복구 명령

[fastapi.service.recorded](fastapi.service.recorded)는 9월 25일 인계문 6-4절의 서비스 전체 기록이다. 기존 문서의 ExecStart 한 줄을 보완한다. 서비스의 `User=root`는 당시 실습값이다. 운영환경의 권장 구성으로 제시하지 않는다.

[domain-recovery-recorded.commands](domain-recovery-recorded.commands)는 장비와 실행 위치별 복구 기록이다. VyOS NAT rule 7은 WAS 복구 시 실제 추가한 변경분이며, 설계 문서의 rule 100·110·120이나 전체 장비 설정을 대신하지 않는다. Windows·VyOS·WAS 명령이 함께 있으므로 자동 실행 파일이 아니다.

## 실제 화면으로 확인한 범위

| 근거 | 확인되는 사실 | 확대 해석하지 않는 범위 |
|---|---|---|
| [main 모듈 오류](domain-fastapi-import-error.png), [누락 파일](domain-app-files-missing.png) | 서비스 재시작 반복, `main` import 실패, 실행 경로에 `database.py`만 존재 | 모든 ASGI 오류가 동일 원인이라는 일반화 |
| [서비스 시작](domain-fastapi-started.png) | Application startup complete, Uvicorn `0.0.0.0:8000` | DB 연결·웹 기능 전체 성공 |
| [Gateway 이웃 정보](domain-gateway-neighbor.png), [호스트 주소 변경](domain-vmnet2-address-fix.png) | `.1`이 Windows VMnet2 MAC에 대응, 호스트 주소를 `.99`로 변경 | ping 성공만으로 올바른 Gateway라고 판정 |
| [DNS와 HTTP 본문](domain-dns-http-failure.png) | `db.yys.ke` → `192.170.9.36` 조회 성공, HTTP 200이나 `status=fail` | 최종 게시글 조회 성공 화면으로 사용 |
| [DB 변경 전](domain-db-address-before.png), [변경 후](domain-db-address-after.png) | OS 주소와 MariaDB 대기 주소 불일치, OS 주소를 `192.170.9.36/24`로 복구 | 계정 인증과 저장·재조회 완료까지 단정 |
| [VyOS eth3](domain-vyos-eth3-no-ipv4.png) | NIC는 UP이지만 DB Gateway의 IPv4 주소 없음 | 케이블 연결만으로 경로 준비 완료 판단 |

로그인·목록·글 작성·재조회 최종 성공은 9월 25일 원문 및 인계문에 기록돼 있다. 최종 성공 화면은 이번 회수본에서도 확보하지 못했다. 재부팅 후 유지, 금지 출발지 차단, 모든 서버의 외부 통신 전수 확인도 별도 미확인 항목이다.

[RECOVERY_SOURCE_MAP.json](RECOVERY_SOURCE_MAP.json)에 원본 파일 식별자·업로드 날짜·공개 변환·파일 해시를 기록했다. 자격증명 노출 화면은 공개 이미지에서 제외했다.

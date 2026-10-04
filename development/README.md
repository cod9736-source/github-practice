# Development Portfolio & Study

개발 코드·설명·학습 자료의 통합 인덱스입니다. 팀 전체 소스, 개인 기여와 수업 자료를 구분해 확인할 수 있습니다.

[저장소 홈](../) · [Notion 인프라 포트폴리오](https://app.notion.com/p/3e2ddb1a637780dcb8fdf5fb65c7328e)

## EduPOP

[개인 프로젝트 저장소](https://github.com/cod9736-source/EduPOP) · [팀 원본](https://github.com/Seo-Yeon-Choi/EduPOP)

학원 운영·시험·독서·학습 성장을 연결하는 팀 웹 프로젝트입니다. 개인 저장소는 팀 프로젝트의 Fork이며, 전체 팀 구현을 개인 단독 성과로 표시하지 않습니다.

### 개인 기여

| 영역 | 역할 | 코드 | 변경 근거 |
|---|---|---|---|
| 독서 | 도서·감상문·Feedback 요청과 데이터 처리 연결 | [Controller](https://github.com/cod9736-source/EduPOP/blob/main/EduPOP/src/main/java/com/example/EduPOP/controller/reading/ReadingController.java) · [Service](https://github.com/cod9736-source/EduPOP/blob/main/EduPOP/src/main/java/com/example/EduPOP/service/reading/ReadingService.java) · [Mapper XML](https://github.com/cod9736-source/EduPOP/blob/main/EduPOP/src/main/resources/mapper/reading/ReadingMapper.xml) | [독서 변경](https://github.com/Seo-Yeon-Choi/EduPOP/commit/df1f22423f2501cb4805a7b205cc12a566e490bd) |
| EXP | 활동별 경험치 처리와 독서 기능 연동 | [Controller](https://github.com/cod9736-source/EduPOP/blob/main/EduPOP/src/main/java/com/example/EduPOP/controller/exp/ExpController.java) · [Service](https://github.com/cod9736-source/EduPOP/blob/main/EduPOP/src/main/java/com/example/EduPOP/service/exp/ExpService.java) · [Mapper XML](https://github.com/cod9736-source/EduPOP/blob/main/EduPOP/src/main/resources/mapper/exp/ExpMapper.xml) | [EXP 연동](https://github.com/Seo-Yeon-Choi/EduPOP/commit/f1b3a8e1012a1b158f941fb880d566f3e864c1e8) · [EXP 흐름](https://github.com/Seo-Yeon-Choi/EduPOP/commit/a7e899d541fafdd05e444ce47eca4beccc4a01f7) |
| 캐릭터·학생 메인 | EXP 조회 결과로 성장 단계와 캐릭터·배경 표시 | [exp.js](https://github.com/cod9736-source/EduPOP/blob/main/EduPOP/src/main/resources/static/js/exp.js) · [exp.css](https://github.com/cod9736-source/EduPOP/blob/main/EduPOP/src/main/resources/static/css/exp.css) · [학생 메인](https://github.com/cod9736-source/EduPOP/blob/main/EduPOP/src/main/resources/templates/student_main/main.html) | [화면·자산](https://github.com/Seo-Yeon-Choi/EduPOP/commit/26ec31744d996e46e7ef31f5e30b194669789d09) · [단계별 화면](https://github.com/Seo-Yeon-Choi/EduPOP/commit/ddf26b67f03edebef026ad3fce5cfc23e48c09cf) |

### 코드에서 확인할 흐름

- 독서: 학생 요청 → ReadingController → ReadingService → ReadingMapper → DB → 결과 화면.
- EXP: 활동 처리 → ExpService → 경험치 기록 → 조회 결과 반환.
- 캐릭터: `/api/exp/me` 조회 → 성장 단계 확인 → 단계별 이미지·배경과 표시 정보 반영.
- 데이터 변경 작업: ReadingService·ExpService의 Transaction 경계와 Mapper 처리를 함께 확인.

Java 17, Spring Boot 4.1.0, MyBatis와 화면 코드가 현재 저장소에서 확인됩니다. 실행 조건·DB 준비와 외부 연동은 [프로젝트 README](https://github.com/cod9736-source/EduPOP#readme)를 기준으로 확인합니다. 이번 자료 정리에서 애플리케이션을 새로 실행한 것은 아닙니다.

## Development Study

[개발 학습 전체 기록](notes/README.md)

코드·본문·이미지·출처를 함께 확인하기 위한 개발 학습 인덱스입니다. 개념 학습, 수업 예제와 프로젝트 실행 결과를 같은 성과로 합치지 않습니다.

## Git Practice

- [f1.txt](../f1.txt)
- [f2.txt](../f2.txt)

## Infrastructure

Network, Linux, Server, 가상화와 Container 실습의 상세 기록은 [Notion 인프라 포트폴리오](https://app.notion.com/p/3e2ddb1a637780dcb8fdf5fb65c7328e)에 정리합니다.


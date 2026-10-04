# LAB 06 / CONTAINER · Container Execution

Docker 패키지 설치와 `hello-world` Container 정상 종료를 실제 화면으로 확인한 기록입니다. Image 삭제 참조 충돌과 Docker Socket 접근 권한 오류를 실행 단계별로 구분했습니다.

[Notion 상세 Lab](https://app.notion.com/p/3efddb1a63778109a3a9e8db85b8cd39) · [개인 실행·오류 근거](recovered-evidence.md)

Bridge·PostgreSQL은 아래에 보존한 학습 범위입니다. 통신·조회·영구 저장 성공은 아직 확인되지 않았습니다.

## 학습 설정 원문

[Study Notes 원문](https://app.notion.com/p/3e3ddb1a63778197bd03da0ffc701872)에 있는 명령 블록을 역할별로 추출했다. 설치 Script나 Dockerfile로 꾸며 만들지 않았다. 원문 자체에 재실습용 보완 명령이 포함되어 있으며 실행 결과와 동일한 자료는 아니다.

## 기본 Bridge와 사용자 정의 Bridge

목적은 IP 통신과 Container 이름 해석의 차이를 구분하는 것이다. 기본 Bridge에서는 주소로 통신하고, 사용자 정의 `my-bridge`에 연결한 Container는 이름으로 통신하는 흐름이다. 원문 주소는 예시이며 실제 `inspect` 결과가 우선한다.

```bash
docker network create --driver bridge my-bridge   # 사용자 정의 Bridge 생성
docker run -dit --name uc3 --network my-bridge ubuntu /bin/bash
docker run -dit --name uc4 --network my-bridge ubuntu /bin/bash
docker exec -it uc3 /bin/bash                     # uc3 내부 접속
```

```bash
docker network connect my-bridge uc1   # 기존 uc1에 사용자 정의 Network 추가
docker exec -it uc1 /bin/bash          # uc1 내부로 재접속
```

```bash
docker network ls                 # Docker Network 목록 확인
docker network inspect my-bridge  # 연결된 Container와 실제 주소 확인
```

```sql
CREATE USER user01 WITH PASSWORD '사용자_비밀번호'; -- Database 사용자 생성
ALTER USER user01 WITH SUPERUSER;                  -- 원문 실습의 최고 권한 부여
CREATE DATABASE test01 OWNER user01;              -- 소유자가 user01인 Database 생성
```

```sql
CREATE TABLE table01 (
    id INTEGER PRIMARY KEY,  -- 중복을 허용하지 않는 숫자 기본키
    name VARCHAR(20)         -- 최대 20글자의 이름
);
```

```sql
SELECT * FROM table01;                             -- 입력 전 빈 Table 확인
INSERT INTO table01 (id, name) VALUES (1, 'abc');  -- 첫 번째 데이터 저장
SELECT * FROM table01;                             -- 저장한 데이터 조회
```

```bash
docker stop uc1 uc2 uc3 uc4    # 실습 Container 중지
docker rm uc1 uc2 uc3 uc4      # 중지한 실습 Container 삭제
docker network rm my-bridge   # 연결 대상이 없는 사용자 정의 Network 삭제
docker ps -a                  # 남아 있는 Container 확인
docker network ls             # Network 삭제 확인
```

## 검증 기준

명령이 적혀 있다는 사실과 실행 성공은 다르다. 네트워크는 연결 대상·실제 주소·응답을, PostgreSQL은 Table 생성과 조회 결과를 각각 남겨야 한다. `1 | abc`는 기대 출력이며 이번 정리 과정에서 실행하거나 관측한 결과가 아니다.

기존 `myimg:v1`의 전체 Dockerfile, 고정 Image Digest, 업로드 결과와 영구 Volume의 데이터 보존 결과는 미확보 상태다. 2026-10-04 추가 회수한 [실제 설치·실행 및 오류 기록](recovered-evidence.md)에서 Docker 패키지 설치와 hello-world 정상 종료를 확인했다. 별도 Kubernetes 연계 실습의 Dockerfile·개인 v1 Build는 [Kubernetes 기록](../08-kubernetes/recovered-evidence.md)에서 구분한다.

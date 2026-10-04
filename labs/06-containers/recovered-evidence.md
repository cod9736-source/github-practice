# 회수한 Docker 실행 기록

기존 Notion 수업 명령과 별도로 2026-08-07~08-11 첨부 파일을 회수했다. 날짜는 첨부 시점이며 이번 정리에서 새로 실행한 결과가 아니다.

| 자료 | 회수한 근거 | 확인 가능한 범위 |
| --- | --- | --- |
| `c007c95e-1e07-49f4-805c-180534f27bef.png` | `dpkg -l \| grep docker`, 주요 Docker 패키지 `ii` | 패키지 설치 이력 |
| `0a2f81c3-468c-4a60-bed4-bd24359f5830.png` | `docker ps -a`, `hello-world`, `Exited (0)` | Container 정상 종료 이력 |
| `1b33ffc8-1b36-4657-9cec-f68b4b48590d.png` | Container Shell 종료 후 Host `/etc/os-release` 조회 | Host·Container 실행 환경 구분 실습 |
| `b07f649d-870d-49b4-b989-0c513c7eb884.png` | Image 삭제 시 stopped container 참조 충돌 | 실제 오류 발생. 최종 삭제 성공 출력 미확보 |
| `a7031772-30dd-4f45-92b3-7ce05bc79939.png` | Docker Socket `permission denied` | daemon 접근 권한 오류. FTP Build 성공은 미확보 |

## 실제 조회 명령

```bash
dpkg -l | grep docker  # Docker 패키지 설치 상태 조회
docker ps -a           # 중지된 Container까지 조회
docker search ubuntu   # Ubuntu Image 검색
cat /etc/os-release   # 현재 Shell의 OS 확인
```

Bridge 통신, PostgreSQL 데이터 조회, Docker Hub Push, 영구 Volume의 재생성 후 데이터 보존 여부는 위 자료만으로 확인되지 않는다. 확인된 실행 이력을 추가하되 다른 실습의 성공 범위를 함께 확대하지 않았다.

# 회수한 Kubernetes 개인 실습과 원문 설정

2026-09-28~10-02 첨부 자료에서 실제 Pod 실행·삭제와 Image Build 기록을 회수했다. 기존 수업 예제와 개인 결과를 구분한다.

| 날짜 KST | 실제 증거 | 판단 |
| --- | --- | --- |
| 09-28 | `nginx-pod`의 ContainerCreating 이후 Running, IP `172.16.205.197`, Node `work01` | Pod 실행 확인 |
| 09-28 | `kubectl delete pod yys-web` 후 `deleted`, 재조회 `NotFound` | 삭제 확인 |
| 10-01 | `hostpath-pod`의 FailedMount, `/data/k8s` 및 변경 후 `/data/k7s` 디렉터리 검사 실패 | Volume 단계 장애 확인; 복구 완료 미확인 |
| 10-02 14:23 | Build Context 누락으로 `requires exactly 1 argument` | Build 입력 오류 |
| 10-02 14:28 | `yooyongsoo/k8s-web:v1`, Image ID `a809b6a5534d`, 62.9MB, Build 내보내기 완료 | 개인 Image Build 확인 |
| 10-02 14:36 | 동일 Image Push에서 `requested access to the resource is denied` | Registry 접근 거부; 해결 과정 미확보 |
| 10-02 15:00 | `docker-web-65cc766464-qzmsf` 1/1 Running, `172.16.205.228`, `work01`; Pod 두 개의 v1 Image 참조 | v1 Pod 실행 확인; 두 Pod 모두 Ready라고 확대하지 않음 |

## 복원 설정의 구분

- Dockerfile과 Docker 연계 Deployment·Service는 수업 화면 원문을 전사한 자료. 개인 Pod에서 동일 Image 경로를 사용하는 것은 확인했지만 전체 Spec을 Export한 파일은 아님.
- 다음 Git 연계 과제의 Namespace·Deployment·Service는 2026-10-02 첨부된 텍스트 파일의 완전한 YAML 코드 블록. 개인 실행 성공으로 표시하지 않음.
- `index.html` 전체 원본, 개인 Cluster 최종 Export, v2 Push·Rollout·Rollback의 원시 결과, hostPath 복구·데이터 보존 결과는 추가 확인 대상.

## 원인 추적에서 구분한 단계

- Build Context 오류 → 이후 Image 목록으로 Build 진행 확인.
- Image 생성 성공 → Registry Push 권한 성공과 별도.
- Pod 생성·적용 응답 → Ready와 Service HTTP 응답은 별도.
- hostPath 경로 → Pod가 배치된 Node 기준으로 판단. Master에서 디렉터리를 만든 사실만으로 Worker Mount 성공을 주장하지 않음.
- 기존 Pod의 Volume 경로 변경 거부 → 삭제·재생성 이후에도 FailedMount가 남은 기록 보존.

주요 원본: `image(20261002-052355).png`, `image(20261002-052816).png`, `image(20261002-053658).png`, `image(20261002-060050).png`, `image(20261001-061714).png`, `image(20260928-115254).png`, `붙여넣은 텍스트(1).txt`.

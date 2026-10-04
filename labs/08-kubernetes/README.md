# Kubernetes 학습 설정과 검증 기준

[원문](https://app.notion.com/p/098ddb1a63778206966701fc28c7fcfb)의 실제 코드 블록에서 Manifest 4개를 추출했다. 아래 4개는 운영 Cluster에서 Export한 파일이나 개인 실행 성공 증거로 표시하지 않는다. 2026-10-04 추가 회수한 [개인 실행 증거](recovered-evidence.md)에는 nginx Pod 실행·삭제, 개인 v1 Image Build와 Pod 실행, hostPath 장애 기록이 있다. 이미지·복제본·Label은 원문대로 유지했으며 다중 Container 예시의 비밀번호만 치환했다.

| 파일 | 목적 | 확인할 결과 | 현재 근거의 한계 |
| --- | --- | --- | --- |
| `examples-from-notes/nginx-pod.yaml` | 단일 Nginx Pod 선언 | 해당 Pod 상태·IP·실행 Node | 실행 원시 출력과 연결 미확인 |
| `examples-from-notes/1pod-2con.redacted.yaml` | 한 Pod에 Nginx·MySQL 배치 | 두 Container의 준비 상태 | 비밀번호는 자리표시자. 영구 저장·서비스 공개 없음 |
| `examples-from-notes/nginx-deployment.yaml` | ReplicaSet을 통해 Pod 3개 유지 | Deployment·ReplicaSet·Pod의 대응 관계 | 무중단 배포 성공을 입증하는 요청 기록 없음 |
| `examples-from-notes/node-exporter.learning.yaml` | DaemonSet의 배치 원리 학습 | 대상 Node와 실제 Pod 배치 | Host Monitoring 구성 완성본이 아님 |

## 설정과 결과를 확인하는 순서

1. `kubectl apply -f <FILE>`로 선언을 적용한다.
2. `kubectl get pods -o wide`로 Pod 상태·Node를 확인한다.
3. `kubectl describe pod <POD>`로 Events와 실패 사유를 확인한다.
4. Deployment는 `kubectl get deployment,replicaset,pods`로 각 계층을 함께 확인한다.
5. 변경 전후 출력과 실행 시각을 남겨 선언한 설정이 적용되었는지 비교한다.

위 명령은 확인 절차이며 실행 결과를 생성해 넣지 않았다. 선택 Namespace가 있다면 모든 조회·변경 명령에서 동일하게 지정해야 한다. 위 기존 수업 Manifest 4개에는 Namespace가 없어 특정 개인 Namespace를 임의로 넣지 않았다.

## Troubleshooting 검토

- **NotReady**: Worker 미가입만으로 원인을 단정하지 않고 Node Conditions, kubelet, Runtime, CNI Events를 확인한다.
- **Calico Image Import**: containerd 사용 환경은 kubelet이 연결한 socket의 `k8s.io` namespace를 확인해야 한다. Docker Image 저장소에 Import한 사실만으로 CNI에서 사용할 수 있다고 단정하지 않는다.
- **DaemonSet**: Pod 실행과 Host Metric 수집은 서로 다른 확인 항목이다. 원문에는 Host 접근·수집 검증이 없다.

공식 근거: [Cluster 진단](https://kubernetes.io/docs/tasks/debug/debug-cluster/), [containerd의 Image Import](https://github.com/containerd/containerd/blob/main/docs/cri/crictl.md), [node_exporter](https://github.com/prometheus/node_exporter).

## 추가 회수 자료

[recovery-20261004](recovery-20261004/)에 Dockerfile, Docker 연계 수업 Manifest 2개, 다음 Git 연계 과제 Manifest 3개를 출처와 함께 보존했다. 수업 원문과 실제 출력의 확인 범위는 [회수 기록](recovered-evidence.md)에 구분했다. 완전한 웹 소스와 최종 Cluster Export가 없어 한 번에 재현되는 완성 프로젝트로 표시하지 않는다.

# Source provenance

- Dockerfile: `image(20261002-052117).png`, `libfile_04372c3fdc808191acd4b0812234cd39`, 2026-10-02 14:21 KST. 원본 이미지 대조 완료. 주석 및 두 Dockerfile 명령 전사.
- Deployment: `image(20261002-054502).png`, `libfile_11bccae0bfa881919c0011a27f520f8b`, 2026-10-02 14:45 KST. 원본 이미지 대조 완료. 의미 없는 화면용 주석 간격 제거; 모든 설정 키·값 유지; 출처 안내 주석 추가.
- Service: `image(20261002-060721).png`, `libfile_6dbbfe8938788191b4ca3eca61164ab9`, 2026-10-02 15:07 KST. 원본 이미지 대조 완료. 모든 설정 키·값 유지; 출처 안내 주석 추가.
- 개인 실행 자료: `image(20261002-052816).png`에 Build 완료와 `yooyongsoo/k8s-web:v1` Image 목록 존재. `image(20261002-060050).png`에 Pod 두 개가 해당 Image를 참조하며 한 행은 1/1 Running.
- `image` 필드의 원문 자리표시자는 보존. 실제 Pod 출력에서 사용한 경로와 문서의 원문을 혼동하지 않도록 직접 치환하지 않음.
- `index.html` 전체 파일은 이 폴더에 없음. 원문 편집 화면의 끝부분이 불완전하여 완성한 파일처럼 재구성하지 않음. 이 Dockerfile만으로 동일한 웹 페이지를 재생성할 수 있다고 주장하지 않음.
- 서비스 HTTP 응답, v2 Push·Rollout·Rollback 결과는 현재 이미지 묶음에서 미확보.

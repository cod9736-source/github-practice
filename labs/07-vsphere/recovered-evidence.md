# 회수한 vSphere 개인 실행 화면

2026-09-21 첨부 원본을 대조하여 수업 절차와 개인 결과를 분리했다.

| 확인 대상 | 실제 화면에서 확인한 값 | 확인 범위 |
| --- | --- | --- |
| 관리 대상 | vCenter `10.9.0.9`, ESXi `10.128.0.183`·`10.128.0.207` | Datacenter 내 Host 등록 |
| TrueNAS Portal | `10.9.0.19:3260`, Portal Group 1 | iSCSI 접속 지점 설정 |
| Target 연결 | `testshara1`·`test-share1`, 각각 LUN ID 0 및 같은 이름 Extent | Target–Extent 연결 항목 존재 |
| ESXi Adapter | `10.128.0.207` / `vmhba65` / 온라인 / Target·Device·Path 각 1 | 두 번째 Host의 iSCSI Device 인식 |
| Device | TrueNAS iSCSI Disk / LUN 0 / 250.00 GB / 연결됨 | Block Storage 연결. Datastore 열은 `Test-Data...`로 일부만 표시 |

새 Datastore 생성 화면에서 후보 Disk가 비었던 기록과 이후 Device 연결 화면은 함께 회수했지만, 그 사이의 정확한 조치와 원인을 연결할 증거는 없다. Storage 연결 자체를 vMotion·DRS·무중단 운영 완료로 확대하지 않는다.

원본: `96498f7f-3872-475e-9cb9-c7f9dce55a96.png`, `9d8acf11-b077-469d-9e25-b0903ee4128e.png`, `75b4a0a3-1d56-4529-93cc-0a9c82745d28.png`, `b730188f-ed8e-4ab2-aa69-58920f2d5732.png`.

# LAB 07 / VIRTUALIZATION · iSCSI Storage Connection

vCenter에 ESXi Host 2대 등록, TrueNAS의 Target–Extent 연결, 두 번째 ESXi Host에서 iSCSI Disk 인식을 실제 화면으로 확인했습니다. vMotion·DRS의 완료 및 무중단 서비스 검증은 확인되지 않았습니다.

[Notion 상세 Lab](https://app.notion.com/p/3efddb1a637781ebac8dfd2ad3efa622) · [개인 연결 근거](recovered-evidence.md)

## 구성 절차와 확인 범위

[Study Notes 원문](https://app.notion.com/p/3e3ddb1a637781399820f7a6ad46639e)의 수업 구성값과 확인 기준이다. 실제 Host에서 Export한 설정 파일은 아니다. 2026-10-04 회수한 [개인 실행 화면](recovered-evidence.md)에서는 두 ESXi Host의 등록과 두 번째 Host의 TrueNAS iSCSI Disk 연결을 확인했다.

| 단계 | 원문 설정 | 이유 | 확인 기준 |
| --- | --- | --- | --- |
| ESXi 2대 | 6.7 설치 Image, Memory 4096MB, SCSI 40GB | VM 실행 Host 구성 | 각 Host 관리 화면 연결 |
| 중앙 관리 | Windows Server 2016, vCenter 6.7 | 두 Host와 VM 관리 통합 | Datacenter에 두 Host 등록 |
| 공유 저장소 | TrueNAS 13.0-U6, 200GB Disk 3개, TestPool1, RAIDZ1, Test-zvol 250GiB | 두 Host가 같은 VM 파일에 접근 | Pool·zvol·iSCSI 상태 |
| Datastore | Test-Datastore1, VMFS 6 | 공유 Disk 위 VM 파일 저장 | 두 Host가 같은 Datastore 인식 |
| Cluster | Test-Cluster1 | Host 자원 관리 단위 구성 | 두 Host의 소속 확인 |
| VM·복제 | Web(CentOS7), Web2(CentOS7) | 동일 환경 복제 | 각 Guest 실제 주소와 중복 여부 |
| vMotion | 양쪽 VMkernel의 vMotion 활성화 | 실행 Host 이동 | 호환성 검사·작업 완료·전후 Host |
| DRS | 완전 자동화 | 초기 배치와 필요한 이동 판단 | 설정·실제 이벤트·배치 결과 |

Windows의 iSCSI 초기화 실습은 VMFS용 Volume과 분리해야 한다. vCenter는 설정을 관리하며 Storage의 실제 Initiator는 ESXi 또는 별도 Windows 시스템이다.

## Troubleshooting 학습

원문은 이동용 Interface가 없는 상태에서 vMotion 호환성 오류를 만난 사례를 설명한다. 양쪽 VMkernel 설정 확인 → 이동용 Interface 구성 → 호환성 재검사 → 실행 Host 변경 확인 순서로 정리했다. 개인 해결 완료 이력이나 무중단 서비스 검증 자료는 현재 페이지에 없다.

Guest에서 MAC 주소만 보일 때 사용하는 확인 명령:

```bash
ip addr
ip -4 addr show
nmcli device status
nmcli connection show
```

MAC 주소, 실제 IPv4 할당, 관리 화면의 Guest 정보 보고를 구분한다. 복제로 Guest의 고정 주소까지 자동 변경된다고 가정하지 않는다.

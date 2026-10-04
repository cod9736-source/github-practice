-- 해당 Database에 조회·추가·수정·삭제 권한 부여
GRANT SELECT, INSERT, UPDATE, DELETE ON WebTest.* TO 'kedu'@'192.168.9.80';
-- Table 목록 확인
USE WebTest;
SHOW TABLES;
-- Linux Terminal로 돌아가기
EXIT;

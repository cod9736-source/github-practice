-- Source: .기초수업 > 3Tier Web DNS추가 > DB재설정 > 6
-- Recorded recovery SQL with original password redacted. Not run by this audit.
-- Replace the placeholder locally before applying to the matching lab only.
CREATE USER IF NOT EXISTS 'yongsu'@'192.169.9.80' IDENTIFIED BY '<SET_LOCAL_SECRET>';
ALTER USER 'yongsu'@'192.169.9.80' IDENTIFIED BY '<SET_LOCAL_SECRET>';
GRANT SELECT, INSERT, UPDATE, DELETE ON `WebTest`.* TO 'yongsu'@'192.169.9.80';
SHOW GRANTS FOR 'yongsu'@'192.169.9.80';
EXIT;

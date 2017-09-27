drop database test;
create database test;
-- auto-generated definition
use test;
CREATE TABLE tb_user
(
  ID       INT         NULL PRIMARY KEY AUTO_INCREMENT,
  NAME     VARCHAR(20) NULL,
  GENDER   VARCHAR(2)  NULL,
  AGE      VARCHAR(4)  NULL,
  PASSWORD VARCHAR(50) NULL
);

CREATE INDEX tb_user_ID_index
  ON tb_user (ID);

INSERT INTO test.tb_user (ID, NAME, GENDER, AGE, PASSWORD) VALUES (1, 'Tom', '1', '18', '123456');
INSERT INTO test.tb_user (ID, NAME, GENDER, AGE, PASSWORD) VALUES (2, 'Jerry', '0', '15', '564588');
commit;
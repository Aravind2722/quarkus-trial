CREATE TABLE Employee
(
    id         BIGINT AUTO_INCREMENT NOT NULL,
    name       VARCHAR(255) NULL,
    department VARCHAR(255) NULL,
    CONSTRAINT pk_employee PRIMARY KEY (id)
);
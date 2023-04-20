CREATE DATABASE HUMANRESOURCE;
USE HUMANRESOURCE;
DROP TABLE HUMANRESOURCE;

CREATE TABLE Department (
  department_code VARCHAR(10) PRIMARY KEY,
  department_name VARCHAR(30) NOT NULL,
  department_tel_number VARCHAR(20) NOT NULL UNIQUE,
  department_address VARCHAR(100) NOT NULL,
  head_employee_number VARCHAR(10)
);

CREATE TABLE Posit (
  position_code VARCHAR(10) PRIMARY KEY,
  position_name VARCHAR(20) NOT NULL
);

CREATE TABLE Employee (
  employee_number VARCHAR(10) PRIMARY KEY,
  employee_name VARCHAR(50) NOT NULL,
  employee_birth_date DATE NOT NULL,
  employee_tel_number VARCHAR(20) NOT NULL UNIQUE,
  employee_address VARCHAR(100) NOT NULL,
  department_code VARCHAR(10),
  position_code VARCHAR(10),
  FOREIGN KEY (department_code) REFERENCES Department(department_code),
  FOREIGN KEY (position_code) REFERENCES Posit(position_code)
);

CREATE TABLE Annual_Income (
  department_code VARCHAR(10),
  position_code VARCHAR(10),
  annual_income_amount INT NOT NULL,
  PRIMARY KEY (department_code, position_code),
  FOREIGN KEY (department_code) REFERENCES Department(department_code),
  FOREIGN KEY (position_code) REFERENCES Posit(position_code)
);

ALTER TABLE Department ADD CONSTRAINT head_employee_number_FK FOREIGN KEY (head_employee_number) REFERENCES Employee(employee_number);

INSERT INTO Annual_Income VALUES ('DEV', 'PO1', 38000000);

INSERT INTO Department (department_code, department_name, department_tel_number, department_address, head_employee_number) VALUES ('DEV', '개발부', '051-240-1155', '부산광역시 부산진구', '2023010101');
INSERT INTO Posit (position_code, position_name) VALUES ('PO1', '사원');
INSERT INTO Employee (employee_number, employee_name, employee_birth_date, employee_tel_number, employee_address, department_code, position_code) VALUES ('2023010101', 'John Doe', '1980-11-12', '010-9184-6574', '부산광역시 부산진구', 'DEV', 'PO1');

SELECT department_code, department_name, employee_name, employee_phone 
FROM department 
JOIN employee ON department.department_code = employee.department_code 
WHERE department.department_code = 'DEV';

INSERT INTO employee (employee_number, employee_name, employee_birth_date, employee_tel_number, employee_address, department_code, position_code) 
VALUES ('2023010102', 'raynor seo', '1993-06-02', '010-4736-1346', '부산광역시 서구', 'DEV', 'PO1');
COMMIT;

ALTER TABLE EMPLOYEE 
ADD INDEX index_department_code (department_code), 
ADD INDEX index_position_code (position_code);

CREATE VIEW view_humanresource AS 
SELECT department_code, department_name, employee_name, employee_tel_number 
FROM department 
JOIN employee ON department.department_code = employee.department_code;



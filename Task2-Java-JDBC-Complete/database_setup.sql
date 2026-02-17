CREATE DATABASE companydb;

USE companydb;

CREATE TABLE employees (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    department VARCHAR(50),
    salary DOUBLE
);

INSERT INTO employees (name, department, salary) VALUES
('Sharanu', 'IT', 50000),
('Ravi', 'HR', 40000),
('Anjali', 'Finance', 60000);

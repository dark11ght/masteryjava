
CREATE TABLE employee
(
    employee_id serial NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    department_id INTEGER NOT NULL,
    job_title VARCHAR(50) NOT NULL,
    gender VARCHAR(10) NOT NULL,
    date_of_birth DATE NOT NULL
);
CREATE UNIQUE INDEX employee_empoyee_id_uindex ON public.employee (empolyee_id);


INSERT INTO employee (
 "first_name",
 "last_name",
 "department_id",
 "job_title",
 "gender",
 "date_of_birth")
 VALUES ( 'Vasya', 'Petrov', 2, 'manager', 'male', '1987-03-12');

INSERT INTO employee (
 "first_name",
 "last_name",
 "department_id",
 "job_title",
 "gender",
 "date_of_birth")
 VALUES ( 'Ivan', 'Sidorov', 1, 'batmann', 'male', '1997-06-02');

INSERT INTO employee (
 "first_name",
 "last_name",
 "department_id",
 "job_title",
 "gender",
 "date_of_birth")
 VALUES ( 'Dmitry', 'Ivanov', 3, 'manager', 'male', '2001-11-21');
-- Practical No : 04
-- Topic        : Data Extraction and Score Analysis from Web Table
-- File name    : student_marks.sql

-- Database for the dynamic table (data = the same 8 students as student.html)
CREATE DATABASE IF NOT EXISTS student_marks;
USE student_marks;

CREATE TABLE IF NOT EXISTS students (
    name        VARCHAR(50),
    English     INT,
    Maths       INT,
    Physics     INT,
    Chemistry   INT,
    `CS & IT`   INT
);

INSERT INTO students (name, English, Maths, Physics, Chemistry, `CS & IT`) VALUES
('Sakshi',   60, 65, 58, 62, 70),
('Tanish',   90, 85, 88, 80, 92),
('Simran',   75, 60, 72, 68, 85),
('Prachi',   70, 78, 74, 69, 80),
('Pavan',    81, 91, 83, 79, 90),
('Nitya',    55, 70, 65, 60, 72),
('Utkarsha', 40, 50, 58, 54, 61),
('Poonam',   80, 90, 85, 82, 93);

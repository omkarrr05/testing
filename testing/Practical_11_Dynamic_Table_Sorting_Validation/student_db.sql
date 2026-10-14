-- Practical No : 11
-- Topic        : Dynamic Web Table Handling and Sorting Validation
-- File name    : student_db.sql

-- Database for Practical 11 (records copied from the phpMyAdmin screenshot)
CREATE DATABASE IF NOT EXISTS student_db;
USE student_db;

CREATE TABLE IF NOT EXISTS students (
    id       INT PRIMARY KEY,
    name     VARCHAR(50),
    english  INT,
    maths    INT,
    science  INT,
    computer INT
);

INSERT INTO students (id, name, english, maths, science, computer) VALUES
(101, 'Aarav',  78, 85, 69, 82),
(102, 'Diya',   65, 72, 80, 74),
(103, 'Rohan',  35, 32, 38, 34),
(104, 'Sneha',  92, 88, 95, 90),
(105, 'Aditya', 44, 52, 46, 58),
(106, 'Priya',  70, 66, 75, 81),
(107, 'Rahul',  25, 38, 31, 29),
(108, 'Ananya', 83, 79, 88, 85),
(109, 'Karan',  30, 36, 28, 35),
(110, 'Meera',  28, 33, 35, 30);

-- Practical No : 03
-- Topic        : Login Automation and Validation
-- File name    : database.sql

-- Create the database / table used by register.php  (run in phpMyAdmin -> SQL tab)
CREATE DATABASE IF NOT EXISTS registration_db;
USE registration_db;

CREATE TABLE IF NOT EXISTS users (
    id       INT AUTO_INCREMENT PRIMARY KEY,
    fullname VARCHAR(100),
    email    VARCHAR(100),
    username VARCHAR(50),
    password VARCHAR(50)
);

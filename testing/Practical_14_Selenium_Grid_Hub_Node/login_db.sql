-- Practical No : 14
-- Topic        : Selenium Server (Grid) Configuration and Remote Execution
-- File name    : login_db.sql

-- Database used by login.php / database.php of the Selenium Grid practicals
-- (a DIFFERENT table layout from the registration_db used in Practicals 2 and 3)
CREATE DATABASE IF NOT EXISTS login_db;
USE login_db;

CREATE TABLE IF NOT EXISTS users (
    id       INT AUTO_INCREMENT PRIMARY KEY,
    name     VARCHAR(50),
    password VARCHAR(50)
);

INSERT INTO users (name, password) VALUES
('admin',  '12345'),
('Joseph', '794561');

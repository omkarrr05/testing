PRACTICAL No. 04 - Data Extraction and Score Analysis from Web Table
======================================================================

TOOLS USED
----------
  * Selenium WebDriver (Java)
  * Selenium JAR + ChromeDriver
  * NetBeans 8.2 + JDK 1.8
  * XAMPP (Apache, MySQL, PHP) + phpMyAdmin (dynamic table)

REQUIREMENTS
------------
  * HTML form : YES - student.html (static table) and student.php (dynamic table from MySQL)
  * Excel data : NOT needed (data lives in HTML / MySQL)
  * Java code  : YES - WebTableHandling.java (static) and CountStudents.java (dynamic)
  * Database   : YES - student_marks.students (student_marks.sql)

FILES IN THIS PRACTICAL
-----------------------
  - student.html
  - student.php
  - student_marks.sql
  - WebTableHandling.java
  - CountStudents.java

STEPS / HOW TO RUN
------------------
PART 1 - static table
1. Put student.html in C:\xampp\htdocs\project4\
2. Run WebTableHandling.java: prints the header row and all 8 student rows with printf("%-11s").
PART 2 - dynamic table
3. phpMyAdmin -> run student_marks.sql (creates database student_marks, table students, 8 rows).
4. Put student.php in C:\xampp\htdocs\project4\ ; the PHP connects on port 3308 -> change to 3306 if your MySQL uses the default.
5. Run CountStudents.java (page: http://localhost:8080/project4/student.php).
   It prints: total students, students scoring above 60 in at least one subject, pass / fail count and percentages
   (fail = any subject mark below 40).
Edit chromedriver.exe paths and the Apache port in the Java files for your machine.

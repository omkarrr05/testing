PRACTICAL No. 11 - Dynamic Web Table Handling and Sorting Validation
======================================================================

TOOLS USED
----------
  * Selenium WebDriver (Java) + JXL (jxl.jar) for writing the Excel result
  * ChromeDriver
  * NetBeans + JDK 1.8
  * XAMPP (Apache, MySQL, PHP) + phpMyAdmin

REQUIREMENTS
------------
  * HTML form : YES - student.php (table #studentTable generated from MySQL)
  * Excel data : produced as OUTPUT - StudentSortedOutput.xls with sheets All Students / Ascending / Descending (no input Excel)
  * Java code  : YES - DynamicStudentTable.java (package Practical1)
  * Database   : YES - student_db.students (student_db.sql, 10 rows taken from the phpMyAdmin screenshot)

FILES IN THIS PRACTICAL
-----------------------
  - student_db.sql
  - student.php
  - DynamicStudentTable.java

STEPS / HOW TO RUN
------------------
1. phpMyAdmin -> run student_db.sql (database student_db, table students, 10 records: ids 101-110).
2. Copy student.php to C:\xampp\htdocs\Selenium\Practical_11\studentproject\ ; check http://localhost/Selenium/Practical_11/studentproject/student.php
3. Add Selenium JAR + jxl.jar to the NetBeans project; edit chromedriver.exe path.
4. Run DynamicStudentTable: reads the 9-column table rows, sorts by Total ascending and descending (Comparator),
   validates both orders (prints true/false) and writes StudentSortedOutput.xls into the studentproject folder (3 sheets).

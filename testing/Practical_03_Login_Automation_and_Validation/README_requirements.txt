PRACTICAL No. 03 - Login Automation and Validation
======================================================================

TOOLS USED
----------
  * Selenium WebDriver (Java)
  * Selenium JAR (selenium-server-standalone-3.13.0.jar used in the screenshots)
  * ChromeDriver (matching your Chrome version)  /  GeckoDriver for Firefox
  * NetBeans IDE 8.2 + JDK 1.8
  * XAMPP (Apache + MySQL + PHP), phpMyAdmin

REQUIREMENTS
------------
  * HTML form : YES - login.html, register.html (+ login.php, success.php, register.php)
  * Excel data : NOT needed
  * Java code  : YES - Project3.java (login) and register.java (registration)
  * Database   : YES - registration_db.users (database.sql)

FILES IN THIS PRACTICAL
-----------------------
  - login.html
  - login.php
  - success.php
  - register.html
  - register.php
  - database.sql
  - Project3.java
  - register.java

STEPS / HOW TO RUN
------------------
1. Copy login.html/php and register.html/php into  C:\xampp\htdocs\login\  (register files in ...\login\register\ ) and start Apache + MySQL.
   Java URLs used:  http://localhost:8080/login/login.html   and   http://localhost:8080/login/register/register.html
   (port 8080 = Apache port in the screenshots; change to 80 if your XAMPP uses the default).
2. Run database.sql in phpMyAdmin.
3. Download the Selenium Java JAR and ChromeDriver (and GeckoDriver for Firefox).
4. NetBeans: New Java Project -> right-click Libraries -> Add JAR/Folder -> select the Selenium JAR.
5. Create Project3.java and register.java, edit the chromedriver.exe path in both files.
6. Run Project3.java: browser opens, fills admin/12345, clicks Login, prints  "Page Title: Success"  then "Success".
7. Run register.java: fills fullname/email/username/password and clicks Register.
NOTE: register.php in the original document was incomplete (no $conn / $sql); the full version is supplied here.

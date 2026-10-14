PRACTICAL No. 02 - Cross-Website Functional Testing Using Selenium IDE
======================================================================

TOOLS USED
----------
  * Selenium IDE (browser extension)
  * XAMPP (Apache + MySQL + PHP)
  * phpMyAdmin
  * Google Chrome / Edge

REQUIREMENTS
------------
  * HTML form : YES - login.html, register.html (+ PHP back-end login.php, success.php, register.php)
  * Excel data : NOT needed
  * Java code  : NOT needed (tests are recorded in Selenium IDE)
  * Database   : YES - registration_db.users (database.sql)

FILES IN THIS PRACTICAL
-----------------------
  - login.html
  - login.php
  - success.php
  - register.html
  - register.php
  - database.sql

STEPS / HOW TO RUN
------------------
1. Install XAMPP, start Apache and MySQL.
2. Copy this folder's html/php files into C:\xampp\htdocs\SoftwareTesting\Practical_2\
3. phpMyAdmin -> SQL -> run database.sql (creates registration_db and users).
4. Browse http://localhost/SoftwareTesting/Practical_2/login.html  (valid login: admin / 12345 -> success.php).
5. Browse register.html and register a user -> "Registration Successful!".
6. In Selenium IDE record:  (a) open login.html, type username/password, click Login, assert success page text;
                           (b) open register.html, fill the 4 fields, click Register, assert "Registration Successful!".
7. Add both tests to a suite, run it, then run the same suite in a second browser (Chrome/Edge) = cross-website / cross-browser check.

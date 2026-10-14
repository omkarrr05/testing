PRACTICAL No. 15 - Cross-Browser Testing Using Selenium Grid
======================================================================

TOOLS USED
----------
  * Selenium Grid 4.50.0 (hub + node)
  * Remote WebDriver (Java)
  * Command Prompt x2
  * NetBeans + JDK 11+
  * Chrome, Firefox, Microsoft Edge
  * XAMPP (Apache) - page under test

REQUIREMENTS
------------
  * HTML form : YES - login.html (same page as Practical 14; login.php / database.php / login_db.sql included for completeness)
  * Excel data : NOT needed
  * Java code  : YES - AllBrowserTest.java (runs Chrome, Firefox, Edge in one program and prints the execution time of each)
  * Database   : only if you submit the login form (login_db.sql)

FILES IN THIS PRACTICAL
-----------------------
  - login.html
  - login.php
  - database.php
  - login_db.sql
  - grid_commands.txt
  - AllBrowserTest.java

STEPS / HOW TO RUN
------------------
1. Same set-up as Practical 14: login page in C:\xampp\htdocs\user_login\, hub on port 4444, node registered (see grid_commands.txt).
2. Run AllBrowserTest.java in NetBeans. For chrome, firefox and MicrosoftEdge it creates a RemoteWebDriver session on the Grid,
   opens the login page and prints: Browser, Page Title, Current URL, Execution Time (ms) measured with System.currentTimeMillis().
3. Open the Grid UI and check the sessions created and the concurrency.
4. Compare the three execution times and any compatibility differences (title / URL / rendering) in your write-up.
Tip: the original code never calls driver.quit(), so the sessions stay open on the Grid until it times out - add driver.quit() at the end of runTest() to free the slots.

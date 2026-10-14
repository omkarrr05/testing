PRACTICAL No. 14 - Selenium Server (Grid) Configuration and Remote Execution
======================================================================

TOOLS USED
----------
  * Selenium Server / Grid 4.50.0 (selenium-server-4.50.0.jar) - Hub and Node
  * Remote WebDriver (Java) + DesiredCapabilities
  * Command Prompt x2 (hub, node)
  * NetBeans + JDK 11+ (Selenium 4 needs Java 11 or newer)
  * Chrome, Firefox, Microsoft Edge
  * XAMPP (Apache, MySQL, PHP) + phpMyAdmin

REQUIREMENTS
------------
  * HTML form : YES - login.html (+ login.php, database.php) in C:\xampp\htdocs\user_login\
  * Excel data : NOT needed
  * Java code  : YES - chrome.java, Selenium_grid.java (Firefox), edge.java  (package selenium_grid)
  * Database   : YES - login_db.users (login_db.sql)

FILES IN THIS PRACTICAL
-----------------------
  - login.html
  - login.php
  - database.php
  - login_db.sql
  - grid_commands.txt
  - chrome.java
  - Selenium_grid.java
  - edge.java

STEPS / HOW TO RUN
------------------
1. Download Selenium Server 4.50.0 (selenium-server-4.50.0.jar) and add the two jar files to the NetBeans project libraries.
2. Put login.html, login.php, database.php in C:\xampp\htdocs\user_login\ ; run login_db.sql in phpMyAdmin.
3. Start the hub, start the node, check the Grid UI - exact commands are in grid_commands.txt.
4. Run chrome.java -> Chrome opens through the Grid; console prints Browser / Page Title / Current URL.
5. Refresh the Grid UI -> a session is created (check concurrency).
6. Repeat for Firefox (Selenium_grid.java) and Edge (edge.java), compare the cross-browser results.

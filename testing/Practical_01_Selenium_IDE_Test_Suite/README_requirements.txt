PRACTICAL No. 01 - Creation of Test Suite using Selenium IDE
======================================================================

TOOLS USED
----------
  * Selenium IDE (Chrome / Edge browser extension)
  * Google Chrome or Microsoft Edge
  * (optional) Java JDK 8+, NetBeans, Selenium Java JAR + ChromeDriver to run the exported WebDriver script

REQUIREMENTS
------------
  * HTML form : NOT needed (the recording is done on https://www.google.com)
  * Excel data : NOT needed
  * Java code  : only the *exported* WebDriver script (GoogleW3SchoolTest.java is an equivalent)

FILES IN THIS PRACTICAL
-----------------------
  - google_w3school.side
  - GoogleW3SchoolTest.java

STEPS / HOW TO RUN
------------------
1. Install Selenium IDE from the Chrome Web Store / Edge Add-ons ("Add extension").
2. Open Selenium IDE from the browser toolbar -> "Record a new test in a new project".
3. Project name: project 1, base URL: https://www.google.com
4. Recorded commands (see google_w3school.side):
     open /                        | set window size 1325x816
     click id=APjFqb               | type id=APjFqb  value = w3 school
     click id=APjFqb               | mouse over / mouse out linkText=W3.CSS
     click linkText=PHP            | click linkText=HOW TO | click linkText=EXCEL
5. Stop recording. Create a Test Suite (Test Suites tab -> + ) and add the test to it.
6. Run the suite (Run all tests) and verify every command is green.
7. Right-click the test -> Export -> Java JUnit (WebDriver script) = the "Generated WebDriver Automation Script".
   To import the supplied project: Selenium IDE -> Open an existing project -> google_w3school.side
Note: the id APjFqb is Google's auto-generated box id and can change; if the replay fails, change the target to name=q.

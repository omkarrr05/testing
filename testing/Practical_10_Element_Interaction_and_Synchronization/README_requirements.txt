PRACTICAL No. 10 - Web Element Interaction and Synchronization Handling
======================================================================

TOOLS USED
----------
  * Selenium WebDriver (Java) - implicit wait, WebDriverWait / ExpectedConditions, Alert, frame switching
  * Selenium 3.x JAR (code uses 'new WebDriverWait(driver, 10)' and TimeUnit - Selenium 3 API)
  * ChromeDriver
  * NetBeans + JDK 1.8
  * XAMPP htdocs (page opened with file:///)

REQUIREMENTS
------------
  * HTML form : YES - login.html (name, gender radios, hobby checkboxes, city dropdown, Submit with JS alert, iframe)
  * Excel data : NOT needed
  * Java code  : YES - WebElementInteraction.java (package Practical10)

FILES IN THIS PRACTICAL
-----------------------
  - login.html
  - WebElementInteraction.java

STEPS / HOW TO RUN
------------------
1. Save login.html as C:\xampp\htdocs\Selenium\Practical_10\login.html
2. NetBeans: package Practical10, class WebElementInteraction; add Selenium 3.x JAR; set the chromedriver.exe path.
3. Run. Flow: implicit wait 10 s -> open page -> explicit waits -> type name -> select Male -> tick 4 hobbies -> choose city Kudal ->
   clear name and Submit (alert 'Name should be mandatory!') -> accept -> re-enter name -> Submit (alert 'Login successful!') -> accept
   -> switch into the iframe, print the table of contents -> back to main page -> driver.quit().
   On Selenium 4 replace  new WebDriverWait(driver, 10)  with  new WebDriverWait(driver, Duration.ofSeconds(10)).

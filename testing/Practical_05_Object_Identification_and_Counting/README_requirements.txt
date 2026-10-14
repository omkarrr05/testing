PRACTICAL No. 05 - Object Identification and Counting on Web Page
======================================================================

TOOLS USED
----------
  * Selenium WebDriver (Java)
  * Selenium JAR + ChromeDriver
  * NetBeans 8.2 + JDK 1.8
  * XAMPP (Apache)

REQUIREMENTS
------------
  * HTML form : YES - registration.html (inputs, radio, checkboxes, dropdown, image, button)
  * Excel data : NOT needed
  * Java code  : YES - CountingWebElements.java
  * Image file : doraemon.png placeholder (any picture works - it only has to be an <img>)

FILES IN THIS PRACTICAL
-----------------------
  - registration.html
  - CountingWebElements.java
  - doraemon.png

STEPS / HOW TO RUN
------------------
1. Put registration.html + doraemon.png into C:\xampp\htdocs\SoftwareTesting\Practical_5\ and start Apache.
2. NetBeans: new project, add Selenium JAR, create class CountingWebElements (package softwaretesting).
3. Edit the chromedriver.exe path, run it. Expected console output (from the screenshot):
     Total input tags are : 9      (name, address, email, 2 x gender, 3 x hobby, submit button)
     Total anchor tags are : 0
     Total images are : 1
     Total dropdowns are : 1
     Total options are : 5
     Total Web Elements Counted : 10   (inputs + anchors + images)
NOTE: registration.html is rebuilt from your screenshot (the original document only had a picture of the page).

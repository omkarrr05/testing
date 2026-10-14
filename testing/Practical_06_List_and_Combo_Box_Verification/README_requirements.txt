PRACTICAL No. 06 - List and Combo Box Item Verification
======================================================================

TOOLS USED
----------
  * Selenium WebDriver (Java) - org.openqa.selenium.support.ui.Select class
  * Selenium JAR + ChromeDriver
  * NetBeans 8.2 + JDK 1.8
  * XAMPP (htdocs folder; page is opened with file:///)

REQUIREMENTS
------------
  * HTML form : YES - listbox.html (text, email, radio, multi-select list, 3 dropdowns, Register button with alert)
  * Excel data : NOT needed
  * Java code  : YES - ListVerification.java

FILES IN THIS PRACTICAL
-----------------------
  - listbox.html
  - ListVerification.java

STEPS / HOW TO RUN
------------------
1. Save listbox.html as C:\xampp\htdocs\project6\listbox.html
   (the document calls the page 'list.html' but the Java code opens 'listbox.html' - the file here is named to match the Java).
2. Create package ListVerification / class ListVerification in NetBeans (Selenium JAR on the classpath).
3. Edit the chromedriver.exe path, run. The program: types name+email, clicks the Female radio, lists all Languages / Countries,
   prints default + selected option, selects Python / India / Maharashtra / Sindhudurg, clicks Register and accepts the alert.

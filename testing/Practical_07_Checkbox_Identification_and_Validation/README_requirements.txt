PRACTICAL No. 07 - Checkbox Identification and Validation
======================================================================

TOOLS USED
----------
  * Selenium WebDriver (Java)
  * Selenium JAR + ChromeDriver
  * NetBeans 8.2 + JDK 1.8
  * XAMPP htdocs (page opened with file:///)

REQUIREMENTS
------------
  * HTML form : YES - Student_form.html (text, address, radio, 5 hobby checkboxes, submit)
  * Excel data : NOT needed
  * Java code  : YES - CheckboxIdentification.java (the middle part was only visible as screenshots; rebuilt from them)

FILES IN THIS PRACTICAL
-----------------------
  - Student_form.html
  - CheckboxIdentification.java

STEPS / HOW TO RUN
------------------
1. Save Student_form.html as C:\xampp\htdocs\project7\Student_form.html
2. Create package CheckboxIdentification / class CheckboxIdentification (Selenium JAR on classpath).
3. Edit the chromedriver.exe path and run. The program fills name/address, clicks Female + Singing + Sports + Dancing,
   counts checked vs unchecked hobby checkboxes, clicks every unchecked one (Java 8 stream), counts again (all 5 checked) and submits.
NOTE: Student_form.html had a stray '</textarea>' tag on the address field in the document - removed here.

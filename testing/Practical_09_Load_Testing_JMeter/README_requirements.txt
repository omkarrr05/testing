PRACTICAL No. 09 - Load Testing Using Apache JMeter
======================================================================

TOOLS USED
----------
  * Apache JMeter 5.6.3 (screenshots) / 5.4.1 (library folder in NetBeans) - needs Java 8+
  * XAMPP Apache (web server on localhost:80)
  * Listeners: View Results Tree, Summary Report

REQUIREMENTS
------------
  * HTML form : YES - 5 pages to load-test: login.html (P2), Marks_table.html, registration.html (P5), Student_form.html (P7), ecommerce_demo.html
  * Excel data : NOT needed
  * Java code  : NOT needed (GUI tool)  -  HTTP_Request.jmx test plan supplied (generated, see note)

FILES IN THIS PRACTICAL
-----------------------
  - HTTP_Request.jmx
  - Marks_table.html
  - ecommerce_demo.html

STEPS / HOW TO RUN
------------------
Test plan 'Test 1' has FIVE thread groups (the screenshots show five; the text of the document mentions four):
   login page | Marks table page | Object Identification page | Student_form | E-Commerce Webpage
Settings used in every group (from the screenshot): Threads = 2, Ramp-up = 1 s, Loop count = 2,
   'Same user on each iteration' ticked, action after sampler error = Continue.
Each group has one HTTP Request sampler:  Protocol http | Server localhost | Port 80 | Method GET | Path = page URL
   e.g. /SoftwareTesting/Practical_2/login.html     and under it the listeners  Summary Report + View Results Tree.
Steps
 1. Copy the html files to C:\xampp\htdocs\SoftwareTesting\Practical_9\ (login.html in ...\Practical_2\), start Apache.
 2. Start JMeter (bin\jmeter.bat) -> File -> Open -> HTTP_Request.jmx   (or build it by hand: Test Plan -> Add -> Threads -> Thread Group ->
    Add -> Sampler -> HTTP Request -> Add -> Listener -> View Results Tree / Summary Report).
 3. Click Run (green arrow). Check View Results Tree (all green = HTTP 200) and Summary Report (#Samples = 4 per group, Error % = 0).
NOTE: HTTP_Request.jmx is generated from the settings visible in your screenshots (the original .jmx was not attached) -
      open it once in JMeter to confirm. Marks_table.html and ecommerce_demo.html were not in the document; simple versions are supplied.

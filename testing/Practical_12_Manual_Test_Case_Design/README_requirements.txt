PRACTICAL No. 12 - Manual Test Case Design and Execution
======================================================================

TOOLS USED
----------
  * Microsoft Excel (test plan / scenarios / test data / test cases / execution report / defect report)
  * Google Chrome (Windows 11)
  * XAMPP htdocs to host the login page under test
  * Screenshots of every test case (Snipping Tool)

REQUIREMENTS
------------
  * HTML form : YES - login.html + success.html (application under test; rebuilt, the document only shows screenshots)
  * Excel data : YES - Practical12_Test_Documents.xlsx (6 sheets, content copied from the document images)
  * Java code  : NOT needed (manual testing)

FILES IN THIS PRACTICAL
-----------------------
  - login.html
  - success.html
  - Practical12_Test_Documents.xlsx

STEPS / HOW TO RUN
------------------
STLC followed: Requirement Analysis -> Test Planning -> Test Case Design -> Test Environment Setup -> Test Execution -> Defect Reporting -> Test Closure
 1. Copy login.html and success.html to C:\xampp\htdocs\SoftwareTesting\Practical_12\ and open login.html in Chrome.
 2. Open Practical12_Test_Documents.xlsx - sheets: Test Plan | Test Scenarios | Test Data | Test Cases | Execution Report | Defect Report.
 3. Execute TC_001 ... TC_008 by hand with the test data TD_001 ... TD_007, take a screenshot of each result and fill Actual Result / Status.
 4. Record failures as defects (BUG_001 sample provided in the Defect Report sheet).
NOTE: the document's defect report refers to TC_09 / 'invalid email format' which is not among TC_001-TC_008; it is copied as-is, status Closed / No Defect.

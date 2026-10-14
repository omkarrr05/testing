PRACTICAL No. 08 - Data-Driven Testing Using Excel Integration
======================================================================

TOOLS USED
----------
  * Java + JXL library (jxl.jar - used in the code; the practical title says Apache POI but the supplied code uses JXL)
  * Selenium WebDriver (listed as the practical tool; not actually called in the three programs)
  * NetBeans 8.2 + JDK 1.8
  * Microsoft Excel (.xls files)

REQUIREMENTS
------------
  * HTML form : NOT needed
  * Excel data : YES - student_records.xls (10 students: Sr No, Name, OS, Java, WebTech, Total) in C:\Excel\
  * Java code  : YES - ExceldataReading.java, PassStudents.java, StudentPercentage.java (package exceldatareading)

FILES IN THIS PRACTICAL
-----------------------
  - ExceldataReading.java
  - PassStudents.java
  - StudentPercentage.java
  - student_records.xls

STEPS / HOW TO RUN
------------------
1. Download jxl.jar (JExcelApi) and add it to the NetBeans project (Libraries -> Add JAR/Folder). JXL reads/writes .xls only.
2. Create folder C:\Excel\ and put student_records.xls (supplied) in it.
3. Run the programs in this order:
     ExceldataReading  -> creates student_records1.xls   (copy + 'Result' column: fail if any subject < 40, else pass)
     PassStudents      -> reads student_records1.xls, creates passstudents.xls (only pass rows)
     StudentPercentage -> reads student_records1.xls, creates studentpercentage.xls (adds Total + Percentage = total/3)
4. Open the generated .xls files in Excel and compare with the screenshots.
Excel layout used by the code: column 0 Sr No, 1 Name, 2 OS, 3 Java, 4 WebTech, 5 Total (the 'Result' column is added by program 1).
Expected results: Tanmay (OS 39), Lochan (OS 34) and Yash (OS 31) = fail; the other 7 = pass.
To use Apache POI instead, replace the jxl.* classes with org.apache.poi.* (HSSFWorkbook / XSSFWorkbook).

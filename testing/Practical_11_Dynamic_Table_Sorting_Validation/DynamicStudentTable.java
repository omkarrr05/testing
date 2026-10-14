/*
 * Practical No : 11
 * Topic        : Dynamic Web Table Handling and Sorting Validation
 * File name    : DynamicStudentTable.java
 */
package Practical1;

import java.io.File;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class DynamicStudentTable {

    static class Student {
        int id, english, maths, science, computer, total;
        String name, result;
        double percentage;

        Student(int id, String name, int english, int maths, int science, int computer, int total, double percentage, String result) {
            this.id = id;
            this.name = name;
            this.english = english;
            this.maths = maths;
            this.science = science;
            this.computer = computer;
            this.total = total;
            this.percentage = percentage;
            this.result = result;
        }
    }

    static void writeSheet(WritableSheet sheet, List<Student> list) throws Exception {

        String[] h = {"ID", "Student Name", "English", "Maths", "Science", "Computer", "Total", "Percentage", "Result"};

        for (int i = 0; i < h.length; i++)
            sheet.addCell(new Label(i, 0, h[i]));

        for (int i = 0; i < list.size(); i++) {

            Student s = list.get(i);
            int r = i + 1;

            sheet.addCell(new Label(0, r, String.valueOf(s.id)));
            sheet.addCell(new Label(1, r, s.name));
            sheet.addCell(new Label(2, r, String.valueOf(s.english)));
            sheet.addCell(new Label(3, r, String.valueOf(s.maths)));
            sheet.addCell(new Label(4, r, String.valueOf(s.science)));
            sheet.addCell(new Label(5, r, String.valueOf(s.computer)));
            sheet.addCell(new Label(6, r, String.valueOf(s.total)));
            sheet.addCell(new Label(7, r, String.valueOf(s.percentage)));
            sheet.addCell(new Label(8, r, s.result));
        }
    }

    static boolean validate(List<Student> list, boolean asc) {

        for (int i = 1; i < list.size(); i++) {

            if (asc && list.get(i - 1).total > list.get(i).total)
                return false;

            if (!asc && list.get(i - 1).total < list.get(i).total)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        WebDriver driver = null;

        try {

            System.setProperty("webdriver.chrome.driver",
                    "D:\\PNT Prac\\JavaApplication1\\src\\driver\\chromedriver.exe");

            driver = new ChromeDriver();

            driver.get("http://localhost/Selenium/Practical_11/studentproject/student.php");

            Thread.sleep(3000);

            List<WebElement> rows = driver.findElements(
                    By.xpath("//table[@id='studentTable']//tr"));

            System.out.println("Rows found: " + rows.size());

            ArrayList<Student> students = new ArrayList<Student>();

            for (WebElement row : rows) {

                List<WebElement> c = row.findElements(By.xpath("./td"));

                if (c.size() != 9)
                    continue;

                students.add(new Student(
                        Integer.parseInt(c.get(0).getText().trim()),
                        c.get(1).getText().trim(),
                        Integer.parseInt(c.get(2).getText().trim()),
                        Integer.parseInt(c.get(3).getText().trim()),
                        Integer.parseInt(c.get(4).getText().trim()),
                        Integer.parseInt(c.get(5).getText().trim()),
                        Integer.parseInt(c.get(6).getText().trim()),
                        Double.parseDouble(c.get(7).getText().trim()),
                        c.get(8).getText().trim()
                ));
            }

            System.out.println("Students found: " + students.size());

            if (students.size() == 0) {
                System.out.println("No student data found!");
                return;
            }

            ArrayList<Student> original = new ArrayList<Student>(students);

            ArrayList<Student> ascending = new ArrayList<Student>(students);

            Collections.sort(ascending, new Comparator<Student>() {
                public int compare(Student a, Student b) {
                    return a.total - b.total;
                }
            });

            ArrayList<Student> descending = new ArrayList<Student>(students);

            Collections.sort(descending, new Comparator<Student>() {
                public int compare(Student a, Student b) {
                    return b.total - a.total;
                }
            });

            System.out.println("Ascending Validation: " + validate(ascending, true));
            System.out.println("Descending Validation: " + validate(descending, false));

            String path = "C:\\xampp\\htdocs\\Selenium\\Practical_11\\studentproject\\StudentSortedOutput.xls";

            System.out.println("Creating Excel: " + path);

            File file = new File(path);

            if (file.exists())
                file.delete();

            WritableWorkbook workbook = Workbook.createWorkbook(file);

            WritableSheet sheet1 = workbook.createSheet("All Students", 0);
            WritableSheet sheet2 = workbook.createSheet("Ascending", 1);
            WritableSheet sheet3 = workbook.createSheet("Descending", 2);

            writeSheet(sheet1, original);
            writeSheet(sheet2, ascending);
            writeSheet(sheet3, descending);

            workbook.write();
            workbook.close();

            System.out.println("Excel file created successfully!");
            System.out.println("Sheet 1: All Students");
            System.out.println("Sheet 2: Ascending");
            System.out.println("Sheet 3: Descending");

        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            if (driver != null)
                driver.quit();
        }
    }
}

/*
 * Practical No : 04
 * Topic        : Data Extraction and Score Analysis from Web Table
 * File name    : CountStudents.java
 */
package CountingStudents;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountStudents {

    public static void main(String[] args) {

        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\Sakshi\\Documents\\NetBeansProjects\\project4\\src\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("http://localhost:8080/project4/student.php");

            List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));

            int totalStudents = rows.size() - 1;
            int matchingStudentCount = 0;
            int passCount = 0;
            int failCount = 0;

            for (int i = 1; i < rows.size(); i++) {

                WebElement row = rows.get(i);
                List<WebElement> cells = row.findElements(By.tagName("td"));

                boolean scoredAbove60 = false;
                boolean pass = true;

                for (WebElement cell : cells) {

                    String cellText = cell.getText().trim();

                    if (!cellText.isEmpty()) {
                        try {
                            int mark = Integer.parseInt(cellText);

                            // Student scored above 60 in at least one subject
                            if (mark > 60) {
                                scoredAbove60 = true;
                            }

                            // Student fails if any subject is below 40
                            if (mark < 40) {
                                pass = false;
                            }
                        } catch (NumberFormatException e) {
                            // Ignore non-numeric cells (the student name)
                        }
                    }
                }

                if (scoredAbove60) {
                    matchingStudentCount++;
                }

                if (pass) {
                    passCount++;
                } else {
                    failCount++;
                }
            }

            double percentage = 0.0;
            if (totalStudents > 0) {
                percentage = ((double) matchingStudentCount / totalStudents) * 100;
            }

            double passPercentage = 0.0;
            if (totalStudents > 0) {
                passPercentage = ((double) passCount / totalStudents) * 100;
            }

            System.out.println("Total Students Processed : " + totalStudents);
            System.out.println("Students Scoring Above 60 in At Least One Subject : " + matchingStudentCount);
            System.out.printf("Percentage Above 60 : %.2f%%%n", percentage);
            System.out.println("Pass Students : " + passCount);
            System.out.println("Fail Students : " + failCount);
            System.out.printf("Pass Percentage : %.2f%%%n", passPercentage);

        } finally {
        }
    }
}

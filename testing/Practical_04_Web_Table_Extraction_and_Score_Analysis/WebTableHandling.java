/*
 * Practical No : 04
 * Topic        : Data Extraction and Score Analysis from Web Table
 * File name    : WebTableHandling.java
 */
package Project4;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Sakshi\\Documents\\NetBeansProjects\\project4\\src\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("file:///C:/xampp/htdocs/project4/student.html");

        WebElement table = driver.findElement(By.tagName("table"));

        List<WebElement> rows = table.findElements(By.tagName("tr"));

        for (WebElement row : rows) {

            List<WebElement> cells = row.findElements(By.tagName("th"));

            if (cells.isEmpty()) {
                cells = row.findElements(By.tagName("td"));
            }

            for (WebElement cell : cells) {
                System.out.printf("%-11s", cell.getText());
            }

            System.out.println();
        }
    }
}

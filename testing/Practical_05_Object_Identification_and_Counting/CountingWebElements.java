/*
 * Practical No : 05
 * Topic        : Object Identification and Counting on Web Page
 * File name    : CountingWebElements.java
 */
package softwaretesting;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingWebElements {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\SoftwareTesting\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost/SoftwareTesting/Practical_5/registration.html");

        int counter = 0;
        int i;

        // Counting Input Tags
        List<WebElement> inputs = driver.findElements(By.tagName("input"));
        System.out.println("Total input tags are : " + inputs.size());

        for (i = 0; i < inputs.size(); i++) {
            System.out.println("Input " + (i + 1)+ " name is "+ inputs.get(i).getAttribute("name")+ " and its type is " + inputs.get(i).getAttribute("type"));

            counter++;
        }

        // Counting Anchor Tags
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("\nTotal anchor tags are : " + links.size());

        for (i = 0; i < links.size(); i++) {
            System.out.println(" and its target page is "+ "Link " + (i + 1)+ " text is "+ links.get(i).getText() + links.get(i).getAttribute("href"));

            counter++;
        }

        // Counting Image Tags
        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("\nTotal images are : " + images.size());

        for (i = 0; i < images.size(); i++) {
            counter++;
        }

        //Counting Select Tags
        List<WebElement> dropdown = driver.findElements(By.tagName("select"));
        System.out.println("\nTotal dropdowns are : " + dropdown.size());

        // Counting Option Tags
        List<WebElement> options = driver.findElements(By.tagName("option"));
        System.out.println("Total options are : " + options.size());

        // Total Count
        System.out.println("\nTotal Web Elements Counted : " + counter);

    }
}

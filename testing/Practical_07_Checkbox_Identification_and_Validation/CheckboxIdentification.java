/*
 * Practical No : 07
 * Topic        : Checkbox Identification and Validation
 * File name    : CheckboxIdentification.java
 */
package CheckboxIdentification;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxIdentification {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Sakshi\\Documents\\NetBeansProjects\\project3\\src\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("file:///C:/xampp/htdocs/project7/Student_form.html");
        driver.manage().window().maximize();

        driver.findElement(By.name("name"))
                .sendKeys("Sakshi Ramkrishna Mestry");
        System.out.println("Name : Sakshi Ramkrishna Mestry");
        Thread.sleep(2000);

        driver.findElement(By.name("address"))
                .sendKeys("Vengurla, Sindhudurg");
        System.out.println("Address : Vengurla, Sindhudurg");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Female']")).click();
        System.out.println("Gender : Female");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@value='Singing']")).click();
        System.out.println("Hobby : Singing");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@value='Sports']")).click();
        System.out.println("Hobby : Sports");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@value='Dancing']")).click();
        System.out.println("Hobby : Dancing");
        Thread.sleep(1000);
        Thread.sleep(2000);
        // Find checkboxes
        List<WebElement> hobbyList = driver.findElements(By.name("hobby"));

        int checked = 0;
        int unchecked = 0;

        // Before Dynamic Selection
        System.out.println("\n===== Before Dynamic Selection =====");

        for (WebElement hobby : hobbyList) {
            if (hobby.isSelected()) {
                checked++;
                System.out.println(hobby.getAttribute("value") + " : Checked");
            } else {
                unchecked++;
                System.out.println(hobby.getAttribute("value") + " : Unchecked");
            }
        }
        System.out.println("------------------------------------");
        System.out.println("Total Checkboxes     : " + hobbyList.size());
        System.out.println("Checked Checkboxes   : " + checked);
        System.out.println("Unchecked Checkboxes : " + unchecked);

        // Dynamic Selection
        hobbyList.stream().filter((hobby) -> (!hobby.isSelected())).forEachOrdered((hobby) -> {
            hobby.click();
        });

        // Validation
        checked = 0;
        unchecked = 0;

        System.out.println("\n===== After Dynamic Selection =====");

        for (WebElement hobby : hobbyList) {
            if (hobby.isSelected()) {
                checked++;
                System.out.println(hobby.getAttribute("value") + " : Checked");
            } else {
                unchecked++;
                System.out.println(hobby.getAttribute("value") + " : Unchecked");
            }
        }
        Thread.sleep(1000);
        System.out.println("------------------------------------");
        System.out.println("Total Checkboxes     : " + hobbyList.size());
        System.out.println("Checked Checkboxes   : " + checked);
        System.out.println("Unchecked Checkboxes : " + unchecked);

        // Submit Form
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        System.out.println("\nForm Submitted Successfully");

    }
}

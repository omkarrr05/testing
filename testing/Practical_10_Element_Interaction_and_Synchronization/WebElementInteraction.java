/*
 * Practical No : 10
 * Topic        : Web Element Interaction and Synchronization Handling
 * File name    : WebElementInteraction.java
 */
package Practical10;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementInteraction {

    public static void wait2Seconds() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        System.setProperty(
                "webdriver.chrome.driver",
                "D:\\PNT Prac\\JavaApplication1\\src\\driver\\chromedriver.exe"
        );

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        System.out.println("WEB ELEMENT INTERACTION AND SYNCHRONIZATION");
        wait2Seconds();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        System.out.println("\n[1] IMPLICIT WAIT");
        System.out.println("Implicit wait set to 10 seconds.");
        wait2Seconds();

        String htmlFile = "file:///C:/xampp/htdocs/Selenium/Practical_10/login.html";

        driver.get(htmlFile);

        System.out.println("\n[2] PAGE OPENED");
        System.out.println("Login page opened successfully.");
        wait2Seconds();

        WebDriverWait wait = new WebDriverWait(driver, 10);

        System.out.println("\n[3] EXPLICIT WAIT");
        System.out.println("Explicit wait set to 10 seconds.");
        wait2Seconds();

        WebElement name = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("name"))
        );

        name.sendKeys("Tanish Sane");

        System.out.println("\n[4] TEXTBOX");
        System.out.println("Name entered : " + name.getAttribute("value"));
        wait2Seconds();

        WebElement female = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("male"))
        );

        female.click();

        System.out.println("\n[5] RADIO BUTTON");
        System.out.println("Gender selected : Male");
        wait2Seconds();

        WebElement reading = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("reading"))
        );
        reading.click();

        System.out.println("\n[6] CHECKBOXES");
        System.out.println("Reading : Selected");
        wait2Seconds();

        WebElement music = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("music"))
        );
        music.click();

        System.out.println("Music : Selected");
        wait2Seconds();

        WebElement cricket = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("cricket"))
        );
        cricket.click();

        System.out.println("Cricket : Selected");
        wait2Seconds();

        WebElement travelling = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("travelling"))
        );
        travelling.click();

        System.out.println("Travelling : Selected");
        wait2Seconds();

        System.out.println("\n[7] DROPDOWN");

        WebElement cityElement = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("city"))
        );

        Select city = new Select(cityElement);
        city.selectByVisibleText("Kudal");

        System.out.println(
                "Selected city : "
                + city.getFirstSelectedOption().getText()
        );
        wait2Seconds();

        System.out.println("\n[8] ALERT HANDLING");

        name.clear();

        System.out.println("Name textbox cleared.");
        wait2Seconds();

        WebElement submit = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("submitButton"))
        );

        submit.click();

        System.out.println("Submit button clicked.");
        wait2Seconds();

        Alert alert = wait.until(
                ExpectedConditions.alertIsPresent()
        );

        System.out.println("Alert message : " + alert.getText());
        wait2Seconds();

        alert.accept();

        System.out.println("Alert accepted successfully.");
        wait2Seconds();

        name.sendKeys("Tanish Sane");

        System.out.println("\n[9] NAME VALIDATION");
        System.out.println(
                "Name entered again : "
                + name.getAttribute("value")
        );
        wait2Seconds();

        submit.click();

        System.out.println("Submit button clicked with valid name.");
        wait2Seconds();

        alert = wait.until(
                ExpectedConditions.alertIsPresent()
        );

        System.out.println("Alert message : " + alert.getText());
        wait2Seconds();

        alert.accept();

        System.out.println("Success alert accepted.");
        wait2Seconds();

        System.out.println("\n[10] FRAME HANDLING");

        wait.until(
                ExpectedConditions.frameToBeAvailableAndSwitchToIt(
                        By.id("contentFrame")
                )
        );

        System.out.println("Switched to frame successfully.");
        wait2Seconds();

        WebElement frameHeading = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.tagName("h3")
                )
        );

        System.out.println(
                "Frame heading : "
                + frameHeading.getText()
        );
        wait2Seconds();

        List<WebElement> listItems = driver.findElements(By.tagName("li"));

        System.out.println("\nTable of Contents:");

        for (WebElement item : listItems) {
            System.out.println(" - " + item.getText());
            wait2Seconds();
        }

        driver.switchTo().defaultContent();

        System.out.println("\nSwitched back to main page.");
        wait2Seconds();

        System.out.println("\nTEST EXECUTION COMPLETED");

        System.out.println("Implicit Wait : PASSED");
        System.out.println("Explicit Wait : PASSED");
        System.out.println("Textbox : PASSED");
        System.out.println("Radio Button : PASSED");
        System.out.println("Checkbox : PASSED");
        System.out.println("Dropdown : PASSED");
        System.out.println("Alert : PASSED");
        System.out.println("Frame : PASSED");
        System.out.println("Synchronization : PASSED");

        wait2Seconds();

        driver.quit();

        System.out.println("Browser closed successfully.");
    }
}

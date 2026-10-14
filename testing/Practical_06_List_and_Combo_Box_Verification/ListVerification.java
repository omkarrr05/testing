/*
 * Practical No : 06
 * Topic        : List and Combo Box Item Verification
 * File name    : ListVerification.java
 */
package ListVerification;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListVerification {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi\\Documents\\NetBeansProjects\\project3\\src\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("file:///C:/xampp/htdocs/project6/listbox.html");

        driver.manage().window().maximize();

        // Enter Name
        driver.findElement(By.name("name")).sendKeys("Sakshi Mestry");
        Thread.sleep(2000);

        // Enter Email
        driver.findElement(By.name("email")).sendKeys("sakshi@gmail.com");
        Thread.sleep(2000);

        // Select Female (the original comment said "Select Male")
        driver.findElement(By.id("female")).click();
        Thread.sleep(2000);

        // ================= Language List =================
        Select languageList = new Select(driver.findElement(By.id("languageList")));

        List<WebElement> languages = languageList.getOptions();

        System.out.println("Total Languages: " + languages.size());

        System.out.println("\nLanguages Available:");
        for (WebElement language : languages) {
            System.out.println(language.getText());
        }

        System.out.println("\nDefault Selected Language:");
        for (WebElement language : languageList.getAllSelectedOptions()) {
            System.out.println(language.getText());
        }

        // Select Python
        languageList.selectByVisibleText("Python");

        System.out.println("\nSelected Language:");
        for (WebElement language : languageList.getAllSelectedOptions()) {
            System.out.println(language.getText());
        }
        Thread.sleep(2000);

        // ================= Country =================
        Select country = new Select(driver.findElement(By.id("country")));

        List<WebElement> countries = country.getOptions();

        System.out.println("\nTotal Countries: " + countries.size());

        System.out.println("\nCountry List:");
        for (WebElement c : countries) {
            System.out.println(c.getText());
        }

        System.out.println("\nDefault Country:");
        System.out.println(country.getFirstSelectedOption().getText());

        country.selectByVisibleText("India");

        System.out.println("\nSelected Country:");
        System.out.println(country.getFirstSelectedOption().getText());
        Thread.sleep(2000);

        // ================= State =================
        Select state = new Select(driver.findElement(By.id("state")));

        System.out.println("\nTotal States: " + state.getOptions().size());

        state.selectByVisibleText("Maharashtra");

        System.out.println("Selected State:");
        System.out.println(state.getFirstSelectedOption().getText());
        Thread.sleep(2000);

        // ================= District =================
        Select district = new Select(driver.findElement(By.id("district")));

        System.out.println("\nTotal Districts: " + district.getOptions().size());

        district.selectByVisibleText("Sindhudurg");

        System.out.println("Selected District:");
        System.out.println(district.getFirstSelectedOption().getText());
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@value='Register']")).click();
        Thread.sleep(1000);

        driver.switchTo().alert().accept();

        System.out.println("Registration Successful!");
    }
}

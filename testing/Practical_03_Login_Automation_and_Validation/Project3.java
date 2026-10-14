/*
 * Practical No : 03
 * Topic        : Login Automation and Validation
 * File name    : Project3.java
 */
package project3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project3 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi\\Documents\\NetBeansProjects\\project3\\src\\driver\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();

        driver.get("http://localhost:8080/login/login.html");

        driver.findElement(By.name("username")).sendKeys("admin");

        driver.findElement(By.name("password")).sendKeys("12345");

        driver.findElement(By.cssSelector("input[type='submit']")).click();
        //driver.findElement(By.name("login")).click();

        Thread.sleep(2000);

        String title = driver.getTitle();

        System.out.println("Page Title: " + title);

        if (title.equalsIgnoreCase("Success")) {
            System.out.println("Success");
        } else {
            System.out.println("Login failed");
        }
    }
}

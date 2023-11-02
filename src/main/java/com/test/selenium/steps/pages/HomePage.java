package com.test.selenium.steps.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomePage {

    public WebDriver driver;

    public void launchBrowser ()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Chrome Browser is launched");
    }

    public void closeBrowser ()
    {
        driver.quit();
    }

    public void navigateToHomePage ()
    {
        System.out.println("Navigated to OrangeHRM Home page");
        driver.get("https://www.orangehrm.com/");
        driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
    }

    public void validateLogo ()
    {
        boolean logostatus = driver.findElement(By.xpath("//img[contains(@src,'images/OrangeHRM_Logo')]")).isDisplayed();
        System.out.println("Logo is displayed: " + logostatus);
        driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
    }

    public void validateEmailAddress()
    {
        WebElement emailaddress = driver.findElement(By.xpath("//input[@type='email']"));
        boolean emailfieldstatus = driver.findElement(By.xpath("//input[@type='email']")).isDisplayed();
        System.out.println("email address field is displayed: " + emailfieldstatus);
        emailaddress.sendKeys("prasanna.kandregula.lpk@gmail.com");
    }






}

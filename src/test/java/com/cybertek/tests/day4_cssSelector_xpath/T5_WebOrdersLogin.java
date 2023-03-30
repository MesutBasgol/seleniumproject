package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_WebOrdersLogin {
    public static void main(String[] args) {
        //WebDriverManager.edgedriver().setup();
        //WebDriver driver = new EdgeDriver();
        WebDriver driver = WebDriverFactory.getDriver("edge");
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        String expectedTitle = "Web Orders Login";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Title verification PASSED");
        }else {
            System.out.println("Title verification FAILED");
        }
        WebElement inputUsername = driver.findElement(By.className("txt"));
        inputUsername.sendKeys("Tester");
        WebElement inputPassword = driver.findElement(By.id("ctl00_MainContent_password"));
        inputPassword.sendKeys("test");
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

        String expectedTitle2 = "Web Orders";
        String actualTitle2 = driver.getTitle();
        if (expectedTitle2.equals(actualTitle2)) {
            System.out.println("Title verification PASSED");
        }else {
            System.out.println("Title verification FAILED");
        }
    }
}

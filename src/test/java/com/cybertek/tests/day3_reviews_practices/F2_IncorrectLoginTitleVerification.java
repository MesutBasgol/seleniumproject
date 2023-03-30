package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class F2_IncorrectLoginTitleVerification {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        WebElement inputUsername = driver.findElement(By.id("email"));
        inputUsername.sendKeys("abc123@gmail.com");

        WebElement inputPassword = driver.findElement(By.id("pass"));
        inputPassword.sendKeys("abc123", Keys.ENTER);

        String expectedTitle = "Facebook'a Giriş Yap";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title verification FAILED!");
        }
    }
}

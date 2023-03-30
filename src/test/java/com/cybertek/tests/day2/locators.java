package com.cybertek.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class locators {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.etsy.com");
        driver.findElement(By.id("global-enhancements-search-query"))
                .sendKeys("wooden spoon" + Keys.ENTER);

        String expectedTitle = "Wooden";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        if (actualTitle.startsWith(expectedTitle)){
            System.out.println("Title Verification PASSED!");
        }else{
            System.out.println("Title Verification FAILED!");
        }

    }
}

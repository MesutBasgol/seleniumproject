package com.cybertek.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class P6_CybertekTitleVerification {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/inputs");
        driver.findElement(By.className("nav-link")).click();
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title Verification PASSED!");
        }else {
            System.out.println("Title Verification FAILED!");
        }

    }
}

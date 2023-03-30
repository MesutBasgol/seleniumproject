package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class F1_TitleVerification {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");
        String expectedTitle = "Facebook - Giriş Yap veya Kaydol";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title Verification PASSED!");
        }else {
            System.out.println("Title Verification FAILED!");
        }
    }
}

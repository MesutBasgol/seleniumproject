package com.cybertek.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class T2_ZeroBankAttribute {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");
        WebElement zeroBankLink = driver.findElement(By.className("brand"));
        String expectedLinkText = "Zero Bank";
        String actualLinkText = zeroBankLink.getText();

        if (actualLinkText.equals(expectedLinkText)){
            System.out.println("Link text verification PASSED!");
        } else {
            System.out.println("Link text verification FAILED");
        }
        String expectedInHrefValue = "index.html";
        String actualHrefValue = zeroBankLink.getAttribute("href");
        System.out.println("actualHrefValue = " + actualHrefValue);
        if (actualHrefValue.contains(expectedInHrefValue)){
            System.out.println("Href attribute value verification PASSED!");
        } else {
            System.out.println("Href attribute value verification PASSED!");
        }
    }
}

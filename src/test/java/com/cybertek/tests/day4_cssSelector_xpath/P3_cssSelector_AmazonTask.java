package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_cssSelector_AmazonTask {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("edge");
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        WebElement amazonSearch = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        amazonSearch.sendKeys("wooden spoon", Keys.ENTER);
        String expectedTitle = "wooden spoon";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title Verification PASSED!");
        }else {
            System.out.println("Title Verification FAILED!");
        }
    }
}

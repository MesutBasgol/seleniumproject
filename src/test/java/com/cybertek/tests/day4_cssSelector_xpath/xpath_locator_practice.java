package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class xpath_locator_practice {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("edge");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        //locating using onclick attribute
        WebElement button1 = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        //locating using text
        //WebElement button1 = driver.findElement(By.xpath("//button[.='Button 1']"));
        button1.click();
        String expectedResult = "Clicked on button one!";
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));
        String actualResult = resultText.getText();
        if (actualResult.equals(expectedResult)) {
            System.out.println("Text Verification PASSED!");
        }else {
            System.out.println("Text Verification FAILED!!!");
        }
    }
}

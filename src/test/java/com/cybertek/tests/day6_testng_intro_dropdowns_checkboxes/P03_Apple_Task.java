package com.cybertek.tests.day6_testng_intro_dropdowns_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P03_Apple_Task {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.apple.com/");
        List<WebElement> headerLinks = driver.findElements(By.xpath("//ul[@class='globalnav-submenu-trigger-group']/li/a"));
        for (int i=1; i<headerLinks.size()-1; i++){
            headerLinks.get(i).click();
            Thread.sleep(1000);
            headerLinks = driver.findElements(By.xpath("//ul[@class='globalnav-submenu-trigger-group']/li/a"));

            System.out.println("current title in the page: " + driver.getTitle());

            List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));
            System.out.println("Total link numbers in the current page: " + allLinks.size());

            int linksWithNoText = 0;
            int linksWithText = 0;

            for (WebElement each : allLinks) {
                if (each.getText().isEmpty()){
                    linksWithNoText++;
                }else {
                    linksWithText++;
                    }
            }
            System.out.println("Links with no text in the page: " + linksWithNoText);
            System.out.println("Links with text in the page: " + linksWithText);
        }

    }
}

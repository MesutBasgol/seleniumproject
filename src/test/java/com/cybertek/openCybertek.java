package com.cybertek;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class openCybertek {
    public static void main(String[] args) {
       WebDriver driver = WebDriverFactory.getDriver("firefox");
       driver.manage().window().maximize();
       driver.get("https://access.cydeo.com/login?state=hKFo2SBFV1N5ZUNxVEpZZjlDOEd0S3I5QjNJOGRTYm9takxPMqFupWxvZ2luo3RpZNkgNElBNmxFRGZkaDc1LS1lakU5SmZibGcwQlo2ZEZpUHSjY2lk2SByS3M5R0FmbzhReWQybHlDQldPWXRkaEVxcFBGZmFKZw&client=rKs9GAfo8Qyd2lyCBWOYtdhEqpPFfaJg&protocol=oauth2&redirect_uri=https%3A%2F%2Fmy.cydeo.com&audience=https%3A%2F%2Fcydeo-learning-api%2F&scope=openid%20profile%20email%20offline_access&response_type=code&response_mode=query&nonce=RWNhMFZxTkhyTnFGM19wZmRIY2tSLVktTGdQNDNvdUVLemJ1UWpGcUE0Zg%3D%3D&code_challenge=Wr8RHZWWM-TuJZpcabpPwBs8vqd_DTgnR6ZqAGH6UNM&code_challenge_method=S256&auth0Client=eyJuYW1lIjoiQGF1dGgwL2F1dGgwLWFuZ3VsYXIiLCJ2ZXJzaW9uIjoiMS4xMC4xIiwiZW52Ijp7ImFuZ3VsYXIvY29yZSI6IjkuMS4wIn19");
        WebElement cydeo = driver.findElement(By.cssSelector("input[class='sc-bqiRlB hzNxjw']"));
        cydeo.sendKeys("emrahgulum@hotmail.com", Keys.ENTER);
    }
}

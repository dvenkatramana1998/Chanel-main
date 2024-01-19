package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChanelHome {
    public void HomePage() throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.chanel.com/in/");
        WebElement button = driver.findElement(By.xpath("//button[@id=\"onetrust-accept-btn-handler\"]"));
        button.click();
        Thread.sleep(3000);
        driver.close();

    }

}

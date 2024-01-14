package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {
    public static void main(String[] args) {
        ChromeDriver driver =new ChromeDriver();
        driver.get("https://www.chanel.com/in/");
        WebElement button = driver.findElement(By.xpath("//button[@id=\"onetrust-accept-btn-handler\"]"));
        button.click();
        WebElement button2 = driver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/ul[2]/li[1]/button"));
        //WebElement button2 = driver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/ul[2]/li[2]/a"));
        button2.click();
        String a = driver.findElement(By.cssSelector(".button.search-close")).getText();
        System.out.print(a);
}
}

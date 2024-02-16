package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class screenshoot {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.chanel.com/in/login/");

        try {
            Thread.sleep(2000);
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotFile, new File("E:\\sc\\screenshot.png"));
            System.out.println("Screenshot saved successfully.");
        } catch (Exception e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        }
        driver.quit();
    }
}

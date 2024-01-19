package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class Registration {
    public void RegistrationPage() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        //WebDriver driver= new EdgeDriver();
        driver.get("https://www.chanel.com/in/login");
        Thread.sleep(6000);
        WebElement button = driver.findElement(By.xpath("//button[@id=\"onetrust-accept-btn-handler\"]"));
        button.click();
        Thread.sleep(5000);
        Duration timeout = Duration.ofSeconds(1000);
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        WebElement Email = driver.findElement(By.name("email"));
        Thread.sleep(5000);
        Email.sendKeys("dhammalapativenkataramana5790@gmail.com");
        Select title = new Select(driver.findElement(By.name("data.title")));
        title.selectByIndex(1);
        WebElement firstName = driver.findElement(By.name("profile.firstName"));
        firstName.sendKeys("eeeee");
        WebElement lastname = driver.findElement(By.name("profile.lastName"));
        lastname.sendKeys("yyyyyyy");
        //DOB
        Select birthDay = new Select(driver.findElement(By.name("birthDay")));
        birthDay.selectByValue("5");
        Select birthMonth = new Select(driver.findElement(By.name("birthMonth")));
        birthMonth.selectByValue("5");
        Select birthYear = new Select(driver.findElement(By.name("birthYear")));
        birthYear.selectByValue("2005");
        WebElement password = driver.findElement(By.name("password"));
        Thread.sleep(5000);
        password.sendKeys("16RC1a0570");
        WebElement checkbox1 =driver.findElement(By.xpath("//*[@id=\"gigya-register-form\"]/div/div[10]/span/label"));
        checkbox1.click();
        WebElement checkbox =driver.findElement(By.xpath("//*[@id=\'gigya-register-form\']/div/div[12]/div/span/label"));
        checkbox.click();
        WebElement submit =driver.findElement(By.xpath("//*[@id=\'gigya-register-form\']/div/div[13]/div/button"));
        submit.click();
        Thread.sleep(5000);
        driver.close();

    }

}

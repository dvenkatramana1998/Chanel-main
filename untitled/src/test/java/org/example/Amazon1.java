package org.example;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import java.util.Scanner;

public class Amazon1 {
    public static void main(String[] arg){
        ChromeDriver driver = new ChromeDriver();
            try {
                driver.get("https://www.amazon.in/");
                driver.manage().window().maximize();
                Thread.sleep(1000);
                WebElement button = driver.findElement(By.id("twotabsearchtextbox"));
                button.sendKeys("mobile smartphones under 30000");
                driver.findElement(By.xpath("//*[@value='Go']")).click();
                Thread.sleep(1000);
                WebElement text= driver.findElement(By.xpath("//*[@id='search']/span[2]/div/h1/div/div[1]/div/div"));
                String a=text.getText();
                System.out.println(a);
                driver.findElement(By.id("a-autoid-0-announce")).click();
                driver.findElement(By.xpath("//a[contains(text(),'Newest Arrivals')]")).click();
                Thread.sleep(1000);
                WebElement newArrivals=driver.findElement(By.xpath("//*[@id='a-autoid-2-announce']/span[2]"));
                System.out.println(newArrivals.getText());
            }catch(Exception e) {
                System.out.print(e);
            }
            finally {
                driver.quit();
            }
        }
    }


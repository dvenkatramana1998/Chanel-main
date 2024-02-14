package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.Set;

public class Switchingwin {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Windows.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id='Tabbed']/a/button")).click();
        try {
            Set<String> s = driver.getWindowHandles();
            for (String i : s) {
                String t = driver.switchTo().window(i).getTitle();
                String title = driver.getTitle();
                if (title.equalsIgnoreCase("Frames & windows")) {
                    WebElement text = driver.findElement(By.xpath("//*[@id='Tabbed']/p"));
                    System.out.println("Text=="+text.getText());
                    driver.close();
                } else if (title.equalsIgnoreCase("Selenium")) {
                    WebElement text67 = driver.findElement(By.xpath("/html/body/div/main/section[1]/div/div/div/h1"));
                    System.out.println("ddddddd:"+text67.getText());
                    WebElement text0 = driver.findElement(By.xpath("/html/body/div/footer/div/div/div[3]/small"));
                    //WebElement text0 = driver.findElement(By.xpath("/html/body/div/main/div[1]/div/h2"));
                    System.out.println("Text0=="+text0.getText());
                    driver.findElement(By.xpath("//*[@id='main_navbar']/ul/li[2]/a/span")).click();
                    WebElement text1= driver.findElement(By.xpath("/html/body/div/main/div[2]/div/div/p[1]"));
                    System.out.println("Text1=="+text1.getText());
                    WebElement hreflink = driver.findElement(By.xpath("/html/body/div/main/div[2]/div/div/p[2]"));
                    WebElement linktext=hreflink.findElement(By.linkText("other languages exist"));
                    System.out.println(linktext);
                    if(linktext.getText().equalsIgnoreCase("other languages exist")) {
                        linktext.click();
                        String titlelinktext = driver.getTitle();
                        System.out.println(titlelinktext);
                        Select navbarDropdown= new Select(driver.findElement(By.id("navbarDropdown")));
                        navbarDropdown.selectByValue("History");
                    }

                   }
                }


        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
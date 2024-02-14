package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        try {
            //1
            driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
            driver.manage().window().maximize();
            WebElement table = driver.findElement(By.id("customers"));
            //2
            /*List<WebElement> TableRowHd = table.findElements(By.tagName("th"));
            int TH = TableRowHd.size();
            System.out.println("No of Row Heads In Table:" + TH);
            //3
            List<WebElement> TableRows = table.findElements(By.tagName("tr"));
            int n = TableRows.size();
            System.out.println("No of Rows In Table:" + n);
            //4
            List<WebElement> TablesColumns = table.findElements(By.tagName("td"));
            int TC = TablesColumns.size();
            System.out.println("No of Columns In Table:" + TC);

            // 5 row etc
            String ValueofR2of2 = TableRows.get(2).getText();
            System.out.println(ValueofR2of2);
            System.out.println(ValueofR2of2.length());
            //6
            //String ValueofC2of2 = TablesColumns.get(2).getText();
            //System.out.println("ValueofC2of2  "+ValueofC2of2);
            //System.out.println("ValueofC2of2.length  ++"+ValueofC2of2.length());*/
            List<WebElement> TableRows = table.findElements(By.tagName("tr"));
            int n = TableRows.size();
            for (int i = 1; i < n; i++) {
                List<WebElement> TablesColumnsi = TableRows.get(i).findElements(By.tagName("td"));
                for (int j=0;j<TablesColumnsi.size();j++) {
                    System.out.print("    "+ TablesColumnsi.get(j).getText());
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                Thread.sleep(3000);
                driver.quit();

            }
        }
    }
}
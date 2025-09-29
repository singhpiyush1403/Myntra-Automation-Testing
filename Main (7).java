
package com.piyush;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

public static void main(String args[]) throws InterruptedException{
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    
    driver.get("https://www.myntra.com/");
    Thread.sleep(3000);

    
    WebElement searchBox = driver.findElement(By.className("desktop-searchBar"));
    searchBox.sendKeys("Peter England Shirt For Men", Keys.ENTER);
    Thread.sleep(3000);
    
    WebElement bundles = driver.findElement(By.xpath("//span[contains(@class,'atsa-downArrow')]"));
    bundles.click();
    Thread.sleep(2000);
    
    WebElement singleStyle = driver.findElement(By.className("common-checkboxIndicator"));
    singleStyle.click();
    Thread.sleep(2000);
    
    WebElement product = driver.findElement(By.className("product-productMetaInfo"));
    product.click();
    Thread.sleep(3000);

    for (String handle : driver.getWindowHandles()) {
        driver.switchTo().window(handle);
    }

    WebElement Home = driver.findElement(By.className("destop-main"));
    Home.click();
  
  
    System.out.println(" Product added to bag successfully!");

    driver.quit();
}
}

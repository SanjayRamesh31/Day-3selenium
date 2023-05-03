package com.example.demo.project2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class two {
	 public static void main( String[] args ) throws InterruptedException
	    {
	    	WebDriverManager.edgedriver().setup();
	    	WebDriver driver=new EdgeDriver();
	        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
	        driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Ananyaa");
	        driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("V R");
	        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("727721euai003@skcet.ac.in");
	        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Ananyaa-06");
	        Thread.sleep(5000); 
	        driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
	        driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
	        driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
	        Thread.sleep(1000);
	    }

}
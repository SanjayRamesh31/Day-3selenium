package com.example.demo.project2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class one {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
    	WebDriver driver=new EdgeDriver();
    	driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
    	driver.findElement(By.xpath("//*[@id=\"account-register\"]/ul/li[3]/a")).click();
    	
    	driver.quit();
		
	}

}
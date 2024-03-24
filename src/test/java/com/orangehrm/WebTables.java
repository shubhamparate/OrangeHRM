package com.orangehrm;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class WebTables {
	WebDriver driver;
	@Test
	public void f() {
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr"));
		int rowcount = rows.size();
		System.out.println("Size of rows is: "+rowcount);
		
		String beforexpathString = "//*[@id=\"customers\"]/tbody/tr[";
		String afterxpathcompany = "]/td[1]";
		String afterxpathname = "]/td[2]";
		String afterxpathcntry = "]/td[3]";
		
		for(int i=2;i<=rowcount;i++) {
			String actualxpath1 = beforexpathString+i+afterxpathcompany;
			WebElement element1 = driver.findElement(By.xpath(actualxpath1));
			System.out.println(element1.getText());
			if(element1.getText().equals("Laughing Bacchus Winecellars")) {
				System.out.println("Company name "+element1.getText()+" is found");
				break;
			}
		}
		
		for(int i=2;i<=rowcount;i++) {
			String actualxpath = beforexpathString+i+afterxpathname;
			WebElement element2 = driver.findElement(By.xpath(actualxpath));
			System.out.println(element2.getText());
			
		}
		
		for(int i=2;i<=rowcount;i++) {
			String actualexpath = beforexpathString+i+afterxpathcntry;
			WebElement element3 = driver.findElement(By.xpath(actualexpath));
			System.out.println(element3.getText());
		}
		
	}
	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}

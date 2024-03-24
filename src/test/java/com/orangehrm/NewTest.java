package com.orangehrm;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class NewTest {
	public static void main(String[] args) {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='customers']/tbody/tr[2]/td[1]")));
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		int rowCount = rows.size();
		System.out.println("Row size is : "+rowCount);
		
		
		String beforexpath = "//*[@id='customers']/tbody/tr[";
		String afterxpath = "]/td[1]";
		for(int i=2;i<=rowCount;i++) {
			String actualxpathString = beforexpath+i+afterxpath;
			WebElement element1 = driver.findElement(By.xpath(actualxpathString));
			System.out.println(element1.getText());
			if(element1.getText().equals("Ernst Handel")) {
				System.out.println("Company name "+element1.getText()+"is found");
				break;
			}
		}
		String afterxpathcontact = "]/td[2]";
		for(int i=2;i<=7;i++) {
			String actualxpathString = beforexpath+i+afterxpathcontact;
			WebElement element1 = driver.findElement(By.xpath(actualxpathString));
			System.out.println(element1.getText());
			
		}
		String afterxpathcountry = "]/td[3]";
		for(int i=2;i<=7;i++) {
			String actualxpathString = beforexpath+i+afterxpathcountry;
			WebElement element1 = driver.findElement(By.xpath(actualxpathString));
			System.out.println(element1.getText());
			
		}
	}
}

package TC;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class TC07 {
	WebDriver driver;
	@Test
	public void f() {
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		int rowsize = rows.size();
		System.out.println("Row size is "+rowsize);
		
		
		
		for(int i=2;i<=rowsize;i++) {
			String beforeXpath = "//*[@id='customers']/tbody/tr[";
			String afterXpath = "]/td[1]";
			
			String actualxpath = beforeXpath+i+afterXpath;
			WebElement elementString = driver.findElement(By.xpath(actualxpath));
			System.out.println(elementString.getText());
			
		}
		for(int i=2;i<=rowsize;i++) {
			String beforeXpath = "//*[@id='customers']/tbody/tr[";
			String afterXpath = "]/td[2]";
			
			String actualxpath = beforeXpath+i+afterXpath;
			WebElement elementString = driver.findElement(By.xpath(actualxpath));
			System.out.println(elementString.getText());
			
		}
		
		for(int i=2;i<=rowsize;i++) {
			String beforeXpath = "//*[@id='customers']/tbody/tr[";
			String afterXpath = "]/td[3]";
			
			String actualxpath = beforeXpath+i+afterXpath;
			WebElement elementString = driver.findElement(By.xpath(actualxpath));
			System.out.println(elementString.getText());
			
		}
		System.out.println("*******");
		System.out.println("Printed the table contents");
		
	}
	@BeforeTest
	public void beforeTest() {
		driver = new EdgeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
	}

	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(500);
		driver.quit();
	}
}

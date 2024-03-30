package TC;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class TC06 {
	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@Test
	public void loginTest() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("Admin");;
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[11]/a"))).click();	//clicks on claim
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div[2]/div[1]/button"))).click();	//clicks on assign
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/h6")));	//waits for assign page to load
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div/div/input")).sendKeys("Timothy");
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div/div[2]/div"))).click();	//clicks on rahul
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/div[1]")).click();	//clicks on Event dropdown
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div[2]/div[2]"))).click();	//clicks on accomodation
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div/div[1]")).click();	//clicks on currency
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div[2]/div[63]"))).click();	//clicks on indian rupees
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[4]/button[2]")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[2]/div/button"))).click();	//clicks on Add
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[6]/div/div/div/form/div[1]/div/div/div/div[2]/div/div"))).click();	//clicks on Expense type
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[6]/div/div/div/form/div[1]/div/div/div/div[2]/div/div[2]/div[2]"))).click();	//clicks on fuels allowannce
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[6]/div/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/input")).sendKeys("2024-03-22");	//sends date
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[6]/div/div/div/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys("123412");	//sends amount
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[6]/div/div/div/form/div[4]/button[2]")).click();	//clicks on save
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[9]/button[2]"))).click();	//clicks on submit
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[2]/div/h6")));
		

	}

	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}

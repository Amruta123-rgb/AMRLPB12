package simple;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase002 {
	WebDriver driver;
	@BeforeMethod
	public void bm()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://elearningm1.upskills.in/");	
	}

	@AfterMethod()
	public void am() 
	{
		driver.quit();	
	}
	
	
	@Test
	public void login() 
	{
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("manzoorr");
		
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("manzoor123");
		
		driver.findElement(By.id("form-login_submitAuth")).click();
	
	}
	
}

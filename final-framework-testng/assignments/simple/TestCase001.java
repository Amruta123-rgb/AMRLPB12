package simple;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase001 {
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
	public void register() 
	{
		driver.findElement(By.linkText("Sign up!")).click();
		driver.findElement(By.id("registration_firstname")).clear();
		driver.findElement(By.id("registration_firstname")).sendKeys("manzoorm");

		driver.findElement(By.id("registration_lastname")).clear();
		driver.findElement(By.id("registration_lastname")).sendKeys("mehandi");
		driver.findElement(By.id("registration_email")).clear();
		driver.findElement(By.id("registration_email")).sendKeys("manzoor12@gmail.com");
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("manzoorm");
		driver.findElement(By.name("pass1")).clear();
		driver.findElement(By.name("pass1")).sendKeys("manzoor1");
		driver.findElement(By.name("pass2")).clear();
		driver.findElement(By.name("pass2")).sendKeys("manzoor1");
		driver.findElement(By.id("registration_phone")).clear();
		driver.findElement(By.id("registration_phone")).sendKeys("9876543210");


		Select Lang = new Select(driver.findElement(By.id("registration_language")));
		Lang.selectByVisibleText("English");

		driver.findElement(By.xpath("//input[@value='5']")).click();
		driver.findElement(By.id("registration_submit")).click();

	}
}

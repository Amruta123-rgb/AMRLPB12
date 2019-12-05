package simple;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase003 {

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
	public void Editprofile() 
	{
		driver.findElement(By.linkText("Edit profile")).click();
		driver.findElement(By.name("password0")).clear();
		driver.findElement(By.name("password0")).sendKeys("manzoor123");
		
		driver.findElement(By.name("password1")).clear();
		driver.findElement(By.name("password1")).sendKeys("mehadi");
		
		
		driver.findElement(By.name("password2")).clear();
		driver.findElement(By.name("password2")).sendKeys("mehadi");
		
		driver.findElement(By.xpath("//button[@class=' btn btn-primary ']")).click();
	}

}

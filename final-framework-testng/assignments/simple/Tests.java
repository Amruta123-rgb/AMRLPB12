package simple;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tests {

	@Test
	public void magentoLogin( ) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\AmrutaNilegaonkar\\Desktop\\Install\\AMU_Personal\\chromedriver_win32_V78\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30 ,TimeUnit.SECONDS);
		driver.get("http://magento.com");
		driver.findElement(By.className("fa-user")).click();
		driver.quit();



	}

}

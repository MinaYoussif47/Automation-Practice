package tests;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import utilitiesPages.Screenshots;

public class AppTest 
{
	Screenshots screenshots = new Screenshots();
	 
	WebDriver driver;
	@Test
   void login () {
	   try {
		   System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\SASA&MNON\\eclipse-workspace\\Selenium\\src\\resources\\chromedriver.exe" );
		   
		   driver = new ChromeDriver ();
		   //======================================
		   driver.get("http://automationpractice.com/index.php");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		   driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
		   driver.findElement(By.id("email")).sendKeys("3antr@gmail.com");
		   driver.findElement(By.id("passwd")).sendKeys("123456789");
		   driver.quit();
		   
	   }catch (Exception e) {
		   e.printStackTrace();
	   }
		
   }
	@AfterMethod
	public void tackeScreenShot()
	{ 
		screenshots.captureScreenShot("testScreenshot");
	
	}
}

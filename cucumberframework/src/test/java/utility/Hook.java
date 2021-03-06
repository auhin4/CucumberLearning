package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {
	private static WebDriver driver;
	
	@Before("@web")
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/austi/OneDrive/Documents/chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	@After("@web")
	   public void quitDriver() {
	     driver.quit();
	   }
	
}
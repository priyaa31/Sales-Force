package Tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;



public class TestBase
{
	public static WebDriver driver;
	 @BeforeTest
	 @Parameters("Browser")
	 public void setup(String Browser) throws IOException
	 {
		 if(Browser.equalsIgnoreCase("Chrome"))
		 {
		 System.setProperty("webdriver.chrome.driver","D:/Testing/chromedriver.exe");
		 driver=new ChromeDriver();
		 }
		 else if(Browser.equalsIgnoreCase("Firefox"))
		 {
			 System.setProperty("webdriver.gecko.driver","D:/Testing/geckodriver.exe");
			 driver=new FirefoxDriver();
			
		 }
		 else
		 {
			 System.out.println("You have choose some other browser");
		 }
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		 driver.get("https://grokbase.com/t/gg/selenium-users/1389rh613e/clicking-link-embedded-in-table-row-by-clicking-on-table-row");
		 //String str=getobject("url");
		 //driver.get(str);

	 }
}

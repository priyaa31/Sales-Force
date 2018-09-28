package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.JavascriptExecutor;


public class HomePage
{
	WebDriver driver;

	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(linkText="Amazon IN")
	public static WebElement Button;
	

	public void clickButton()
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView();",Button);
		Button.click();
	}

}

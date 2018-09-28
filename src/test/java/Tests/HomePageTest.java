package Tests;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.HomePage;


public class HomePageTest extends TestBase
{
	
	@Test
	public void link()
	{
		HomePage hp=PageFactory.initElements(driver, HomePage.class);
		hp.clickButton();
		
	}

}

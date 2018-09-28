package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage
{
	WebDriver driver;

	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
@FindBy(id="username")
private WebElement email;

@FindBy(id="password")
private WebElement pass;

@FindBy(id="Login")
private WebElement loginbutton;

public void setUsername(String text)
{
	email.sendKeys(text);
}

public void setPassword(String text)
{
	pass.sendKeys(text);
	
}

public void clickNext()
{
	loginbutton.click();
}

}

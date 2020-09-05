package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By emailid=By.xpath("//input[@id='input-email']");
	By Password=By.xpath("//input[@name='password']");
	By loginButton=By.xpath("//input[@value='Login']");
	
	public WebElement txtEmailId()
	{
		return driver.findElement(emailid);
	}
	public WebElement password()
	{
		return driver.findElement(Password);
	}
	
	public WebElement btnLogin()
	{
		return driver.findElement(loginButton);
	}

	
	
}

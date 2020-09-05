package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By myaccount=By.xpath("//a[@title=\"My Account\"]");
	By loginlink=By.xpath("//a[contains(text(),'Login')]");
	By validtionlink=By.xpath("//a[contains(text(),'Your Store')]");
	
	public WebElement lnkmyaccount()
	{
		return driver.findElement(myaccount);
		
	}
	public WebElement lnklogin()
	{
		return driver.findElement(loginlink);
	}
	public WebElement getValidationLink()
	{
		return driver.findElement(validtionlink);
	}

}

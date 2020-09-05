package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.base;
import pageObject.LandingPage;
import pageObject.LoginPage;

public class Homepageclone extends base {
	public WebDriver driver;
	
	
	
	@Test(dataProvider="getData")
	public void basePageNavigation1(String uname,String pass) throws IOException, InterruptedException
	{
		
		driver=intializeDriver();
		driver.get(Url);
		driver.manage().window().maximize();
		
		LandingPage l=new LandingPage(driver);
		l.lnkmyaccount().click();
		Thread.sleep(5);
		l.lnklogin().click();
		Thread.sleep(5);
		LoginPage log= new LoginPage(driver);
		log.txtEmailId().sendKeys(uname);
		log.password().sendKeys(pass);
		log.btnLogin().click();
		
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="john.adarsh.45@gmail.com";
		data[0][1]="45658";
		
		data[1][0]="john.adarsh.52@gmail.com";
		data[1][1]="efwefwf";
		
		return data;
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}
	
//t y	

}

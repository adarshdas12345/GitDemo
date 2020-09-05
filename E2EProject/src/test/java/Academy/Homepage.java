package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.base;
import pageObject.LandingPage;
import pageObject.LoginPage;

public class Homepage extends base{
	public WebDriver driver;
	private static Logger log =LogManager.getLogger(base.class.getName());
	
	@Test(dataProvider="getData")
	public void basePageNavigation2(String uname,String pass) throws IOException, InterruptedException
	{
		
		driver=intializeDriver();
		log.info("Driver is intialized in Home page ");
		driver.get(Url);
		log.info("Succesfully lunch the URL");
		driver.manage().window().maximize();
		LandingPage l=new LandingPage(driver);
		l.lnkmyaccount().click();
		Thread.sleep(5);
		l.lnklogin().click();
		Thread.sleep(5);
		LoginPage lo= new LoginPage(driver);
		lo.txtEmailId().sendKeys(uname);
		Thread.sleep(5);
		lo.password().sendKeys(pass);
		Thread.sleep(5);
		lo.btnLogin().click();
		log.info("Succsfully button got clicked");
		
		
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

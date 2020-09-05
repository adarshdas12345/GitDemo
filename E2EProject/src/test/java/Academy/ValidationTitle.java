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
import junit.framework.Assert;
import pageObject.LandingPage;
import pageObject.LoginPage;

public class ValidationTitle extends base {
	public WebDriver driver;
	private static Logger log =LogManager.getLogger(base.class.getName());
	
	@Test()
	public void basePageNavigation() throws IOException, InterruptedException
	{
		driver=intializeDriver();
		log.info("Driver has been intialized");
		
		driver.get(Url);
		log.info("Succesfully lunch the browser ");
		driver.manage().window().maximize();
		LandingPage l=new LandingPage(driver);
		Assert.assertEquals(l.getValidationLink().getText(), "Your Store");
		log.info("Succesfully text verified");
	
	
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}
	
//t y	

}

package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class base {
	
	public WebDriver driver;
	public String Url;
	
	public WebDriver intializeDriver() throws IOException
	{
		Properties prop=new Properties();//this is responsible to get datafrom data.prperetie but theaase are 2 separte thing how to connect
		FileInputStream fis=new FileInputStream("E:\\AUTOMATION TESTING 2020\\Workspace\\E2EProject\\src\\main\\java\\Resources\\data.properties");
		
		prop.load(fis);
		String browsername=prop.getProperty("browser");
		 Url=prop.getProperty("Url");
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E:\\AUTOMATION TESTING 2020\\Selenium_SETUP\\chrome\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			
		}
		else if(browsername.equalsIgnoreCase("IE"))
		{
			
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
		
		
	}
	
	public String takeScreenshot(String testcasename,WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String destination=System.getProperty("user.dir")+"\\reports\\"+testcasename+".png";
		FileUtils.copyFile(src,new File(destination));
		return destination;
	}

}

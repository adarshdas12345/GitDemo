package Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtedReportNg {
	 static ExtentReports extent;
	public static ExtentReports getReport()
	{
		
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Automation Run Result");
		reporter.config().setDocumentTitle("Testresult");
		
		 extent= new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Adarsh Das");
		return extent;
		
	}

}

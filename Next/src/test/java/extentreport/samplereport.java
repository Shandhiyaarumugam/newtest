package extentreport;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class samplereport
{
	
	
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReport.html");  
		ExtentReports extent = new ExtentReports();
		
		

	
	
}
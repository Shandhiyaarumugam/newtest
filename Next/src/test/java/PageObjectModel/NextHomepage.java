package PageObjectModel;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NextHomepage{
	
	ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReport.html");  
	ExtentReports extent = new ExtentReports();
	ExtentTest test=extent.createTest("Verify the page title");
	ExtentTest test1=extent.createTest("PLP Page verification");
	ExtentTest test2=extent.createTest("VerifyOrderComplete");
	
@Test
	public void Homepage() throws IndexOutOfBoundsException
	
	{
	   
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setDocumentTitle("MyReport");
		extent.attachReporter(htmlReporter);
		
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		
		operations Obj1=new operations(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://sarumugam:Masefieldcourt98@www.next.co.uk");
		
		
		
		
		//ExtentTest test=extent.createTest("Verify the page title");
		String pagetitle=driver.getTitle();
		if(pagetitle.contains("Next"))
				{
			test.pass("page title verified" +pagetitle);
				}
		else
		{
			test.fail("page title doesnt match"+pagetitle);
		}
			
			
		ExtentTest test=extent.createTest("accpeting cookie");
			
		   Obj1.cookies();
		   test.pass("cookies accepted");
		
		
		Obj1.entersearchword("dresses");
		Obj1.autosuggest();
		Obj1.sorting();
		String strUrl = driver.getCurrentUrl();
	    System.out.println("Current Url is:"+ strUrl);
	    if(strUrl.contains("low"))
	    {
	    	test1.pass("sorted with most popular");
	    }
	    
	    	else
	    	{
	    		test1.fail("not sorted");
	    	}
	      
	      
	    WebElement imgone= driver.findElement(By.cssSelector("a[title='Phase Eight Womens Black Candice Puff Sleeve Dress (M94701) | £89']"));
	    imgone.click();
	    
	   List<WebElement>size=driver.findElements(By.xpath("//ul[@class='sizeChips']/li"));
	   for(WebElement s:size)
	   {
	  	 if(s.getText().equals("10"))
	  	 {
	  		 s.click();
	  		 System.out.println("size selected");
	  		 break;
	  	 }
	  	 
	   }
	   
	   driver.findElement(By.xpath("//a[normalize-space()='ADD TO BAG']")).click();
	  WebElement Checkout=driver.findElement(By.xpath("(//a[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium header-1dgcfbw'][normalize-space()='Checkout'])[2]"));
	   Checkout.click();
	   WebElement username = driver.findElement(By.xpath("//input[@id='EmailOrAccountNumber']"));
	   //username.click();
	   username.sendKeys("XJ903501");
	   //username.sendKeys(Keys.ENTER);
	   WebElement pword=driver.findElement(By.xpath("//input[@id='Password']"));
	   pword.sendKeys("XJ903501");
	   
	   
	   
	   
	   WebElement signin= driver.findElement(By.xpath("//input[@id='SignInNow']"));
	   signin.click();
	   
	   String checkouturl=driver.getCurrentUrl();
	   if(checkouturl.contains("checkout"))
	   {
	  	 System.out.println("login successful");
	  	 
	  	 }
	   else
	   {
	  	 System.out.println("login failed");
	   }
	  	
	   driver.findElement(By.xpath("//button[normalize-space()='Complete With Nextpay']")).click();
	   
	  String ocpurl=driver.getCurrentUrl();
	  if(ocpurl.contains("complete"))
	  {
	  	test2.pass("order successful");
	  }
	  else
	  {
	  	test2.fail("There is an error processing your order");
	  }
	   
	  extent.flush();
	     
	     
	  	}

		//	
	    
		//driver.quit();
	}



	


package nexttest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.AWTException;



import io.github.bonigarcia.wdm.WebDriverManager;


public class practice {
	@Test
	public void titl() 
	{
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		driver.get("https://sarumugam:Masefieldcourt98@www.next.co.uk");
        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		
		Set <Cookie> cookies=driver.manage().getCookies();//captures the cookies from the browser
		
		int cooki=cookies.size();
		System.out.println("The number of cookies:"+cooki);
		
		
		String Url=driver.getCurrentUrl(); //getting current url
		System.out.println(Url);
		String title=driver.getTitle();     //actual title
		System.out.println("The title is"+title);
		
		String expected_title ="Next Official Site: Online Fashion, Kids Clothes &amp; Homeware";
		//Assert.assertEquals(title,expected_title);
		Assert.assertTrue(title.contains("Next"));
		
		System.out.println("Homepage verification passed");
	
		
		
	}
}

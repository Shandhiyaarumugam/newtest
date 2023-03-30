package nexttest;
import org.openqa.selenium.virtualauthenticator.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class iframeswitchto {
@Test
	public void main() throws InterruptedException
	{
	ChromeOptions chromeOptions = new ChromeOptions();
	chromeOptions.addArguments("--remote-allow-origins=*");
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver(chromeOptions);
		
	driver.get("http://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
	driver.manage().window().maximize();
	
	
	driver.switchTo().frame("iframeResult");
	
	driver.switchTo().frame(0); //switch to inner iframe by passing index
	
     System.out.println("text in inner frame"+driver.findElement(By.xpath("//h1")).getText());
     
     driver.switchTo().parentFrame();
     
     String txt=driver.findElement(By.xpath("//p[contains(text(),You can use the height and width attributes to specify the size of the iframe]")).getText();
     System.out.println("Text in outerframe is :"+txt);
     

	
	
	
	
	
	
	
	
	
	
	//driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
        
		
		
		/*
		//1st frame
		driver.switchTo().frame("packageListFrame"); //name of the frame
		Thread.sleep(3000);
        driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click();
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        
        
        
        //2nd frame
        
        driver.switchTo().frame("packageFrame");
        driver.findElement(By.xpath("//span[normalize-space()='HasAuthentication']")).click();
        driver.switchTo().defaultContent();
        Thread.sleep(3000);*/
        
        
        
        
		
	}
}

package nexttest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.virtualauthenticator.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NextLogin
{
	@Test
	public void homepage() throws InterruptedException
	{
	ChromeOptions chromeOptions = new ChromeOptions();
	chromeOptions.addArguments("--remote-allow-origins=*");
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver(chromeOptions);
	
	driver.getCurrentUrl();
	//wait 
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://sarumugam:Masefieldcourt98@www.next.co.uk");
	
	String Url=driver.getCurrentUrl(); //getting current url
	System.out.println(Url);
	
	
	driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
	
	driver.findElement(By.xpath("//input[@id='header-big-screen-search-box']")).sendKeys("dresses");
	
	
	//listing suggestions
	Thread.sleep(5000);
    List<WebElement>list=driver.findElements(By.xpath("//ul[@class='header-1axo6kt']//li"));
    int count=list.size();
    
    System.out.println("SIZE OF THE LIST ITEMS:"+count);
    list.get(count-3).click();
     
     //sort dropdown in PLP Page
     WebElement sort= driver.findElement(By.xpath("//div[@id='desktop-sort-select']"));
     sort.click();
  
    List<WebElement>sortoptions=driver.findElements(By.xpath("//ul[@class='MuiList-root MuiList-padding MuiMenu-list plp-r8u8y9']//li"));
    
    System.out.println("no of sort options in the PLP Page: = "+sortoptions.size());
    
   for(WebElement selectopt:sortoptions)
	   
   {
	   if(selectopt.getText().equals("Most Popular"))
			   {
		   selectopt.click();
		   break;
			   }
	
    }
   
   System.out.println("test");
   //driver.findElement(By.xpath("//legend[@title='Gender']")).click();
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
	System.out.println("order successful");
}
else
{
	System.out.println("There is an error processing your order");
}
 
   
	System.out.println("There is an error processing your order");
   
   
	}

	private void sendKeys(String string) {
		// TODO Auto-generated method stub
		
	}
	
}

   
	
    


	


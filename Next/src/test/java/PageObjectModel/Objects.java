package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Objects {
	
	WebDriver driver;
	
	@FindBy(name="header-big-screen-search-box")
	WebElement search;
	
	@FindBy(xpath="//ul[@class='header-1axo6kt']//li")
	List<WebElement> searchresult;
	
	@FindBy(id="onetrust-accept-btn-handler")
	WebElement acceptcookies;
	
	@FindBy(xpath="//div[@id='desktop-sort-select']")
    WebElement sortselect;
	
	@FindBy(xpath="//ul[@class='MuiList-root MuiList-padding MuiMenu-list plp-r8u8y9']//li")
	List<WebElement>sortingoptions;
	
	
	
	@FindBy(xpath="//legend[@title='Gender']")
	WebElement sortoption;
	
	Objects(WebDriver d)
	{
		driver = d;
		PageFactory.initElements(d,this);
	}                                                                                                                                                                                                
	/*public void entersearchword(String sword)
	{
		search.sendKeys("dresses");
		
	}
	
	public void autosuggest()
	{
		int count=searchresult.size();
		
	System.out.println("the number of list: "+count);
	searchresult.get(count-3).click();
	}
	
	public void cookies()
	{
		acceptcookies.click();
	}*/
	
}

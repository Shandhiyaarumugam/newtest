package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class operations extends Objects{

	operations(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}
	
	
	public void entersearchword(String sword)
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
	}
    public void sorting()
    {
    	sortselect.click();
    	System.out.println("no of sort options in the PLP Page: = "+sortingoptions.size());
    	  
    	   for(WebElement selectopt:sortingoptions)
    		   
    	   {
    		   if(selectopt.getText().equals("Most Popular"))
    				   {
    			   selectopt.click();
    			   break;
    				   }
    		
    	    }
    }
}

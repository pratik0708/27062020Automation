package libraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import configuration.Configuration;

public class CommonLibrary {
	
	public WebDriver launchBrowser(String browerName)
	{
		WebDriver dr=null;		
		switch(browerName)
		{
			case "Chrome":
				System.setProperty("webdriver.chrome.driver", Configuration.chromePath);
				dr= new ChromeDriver();
				break;
			case "Firefox":
				//Add gecko driver path for firefox driver
				dr= new FirefoxDriver();
				break;
				
			//Add more cases for other browsers	
		
		}
		dr.manage().window().maximize();
		navigateTohomePage(dr);
		dr.manage().timeouts().implicitlyWait(Configuration.implicitWait, TimeUnit.SECONDS);
		
		return dr;
	}
	
	public void navigateTohomePage(WebDriver dr)
	{
		dr.get(Configuration.url);
	}

	public boolean isElementPresent(WebDriver dr, By element)
	{
		int size=dr.findElements(element).size();
		if(size>0)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public void selectByVisibleText(WebDriver dr, By element, String visibleText)
	{
		Select sel= new Select(dr.findElement(element));
		sel.selectByVisibleText(visibleText);
	}
}

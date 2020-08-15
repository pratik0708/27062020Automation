package libraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import configuration.Configuration;

public class CommonLibrary {
	
	public WebDriver launchBrowser(String browerName)
	
	{
		WebDriver dr=null;
		
		switch (browerName)
		{
		case"Chrome":
			System.setProperty("webdriver.chrome.driver", Configuration.chromepath);
			dr=new ChromeDriver();
			break;
		case"FireFox":
			//Add gecko driver path for firefox driver
			dr=new FirefoxDriver();
			break;
			//Add more cases for other browsers
		}
		
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Configuration.implicitWait, TimeUnit.SECONDS);
	
         return dr;	
	}

}

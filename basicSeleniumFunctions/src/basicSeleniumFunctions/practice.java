package basicSeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr= new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.get("http://sampleapp.tricentis.com/101/");
		
		//dr.close(); // close only the window which is open, close only the window which are open from the code.
		
		
		//dr.quit(); // close all the window which are open
		
		//dr.findElement(By.id("nav_automobile")).click();
		WebElement ele=dr.findElement(By.id("nav_automobile"));
		
		String data=ele.getText();
		System.out.println(data);
		
		ele.click();
		// enter text 
		
		//dr.findElement(By.id("search_form")).sendKeys("VW");
		//dr.findElement(By.id("search_form")).sendKeys(Keys.ENTER);
		
		  WebElement makeDropDown = dr.findElement(By.name("Make")); 
		  Select sel= new Select(makeDropDown); 
		  sel.selectByIndex(4);
		  Thread.sleep(3000);
		  sel.selectByValue("Ford");
		 Thread.sleep(3000);
		  sel.selectByVisibleText("Mercedes Benz");
		  
		  dr.findElement(By.id("dateofmanufacture")).sendKeys("12/31/2010");




	}

}

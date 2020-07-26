package basicSeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automobile_EnterVehical_Data {

	public static void main(String[] args) throws InterruptedException {
		
		//Set ChromeDriver path		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr= new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.get("http://sampleapp.tricentis.com/101/index.php");
		
		dr.findElement(By.id("nav_automobile")).click();
		
		WebElement ele=dr.findElement(By.id("nav_automobile"));	
		String data=ele.getText();
		System.out.println(data);
		ele.click();	
		
		//dr.findElement(By.id("engineperformance")).sendKeys("100");
		//dr.findElement(By.id("engineperformance")).sendKeys(Keys.ENTER);
		
		WebElement makeDropDown=dr.findElement(By.name("make"));

		Select sel=new Select(makeDropDown);
		
		sel.deselectByIndex(4);
		Thread.sleep(3000);
		sel.selectByValue("Ford");
		Thread.sleep(3000);
		sel.deselectByVisibleText("Mercedes Benz");
		
		WebElement fuleDropDown=dr.findElement(By.name("fuel"));
		Select sel1=new Select(fuleDropDown);	
		sel1.selectByValue("Petrol");
		
		dr.findElement(By.id("listprice")).sendKeys("500");
		dr.findElement(By.id("listprice")).sendKeys(Keys.ENTER);
		
		dr.findElement(By.id("icenseplatenumber")).sendKeys("123");
		dr.findElement(By.id("icenseplatenumber")).sendKeys(Keys.ENTER);				
	
		dr.findElement(By.id("dateofmanufacture")).sendKeys("12/31/2010");
		
		//Radio Button
		dr.findElement(By.className("")).click();
		
		
	}

}

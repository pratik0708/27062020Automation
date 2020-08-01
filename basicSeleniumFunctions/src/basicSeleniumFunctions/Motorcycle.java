package basicSeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Motorcycle {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/101/#");
		dr.findElement(By.id("nav_motorcycle")).click();
		
		WebElement makeDropDown=dr.findElement(By.name("Make"));
		Select sel= new Select(makeDropDown);
		sel.selectByIndex(2);
		
		WebElement modelDropDown=dr.findElement(By.name("Model"));
		Select gel= new Select(modelDropDown);
		gel.selectByIndex(1);
		
		dr.findElement(By.id("cylindercapacity")).sendKeys("500");
		dr.findElement(By.id("engineperformance")).sendKeys("20");
		dr.findElement(By.id("dateofmanufacture")).sendKeys("10/23/2015");
		
		WebElement seatDropDown=dr.findElement(By.name("Number of Seats Motorcycle"));
		Select tel= new Select(seatDropDown);
		tel.selectByIndex(3);
		
		dr.findElement(By.id("listprice")).sendKeys("1000");
		dr.findElement(By.id("annualmileage")).sendKeys("150");
		dr.findElement(By.id("nextenterinsurantdata")).click();
		dr.findElement(By.id("firstname")).sendKeys("Pratik");
		dr.findElement(By.id("lastname")).sendKeys("Rupnar");
		dr.findElement(By.id("birthdate")).sendKeys("07/08/1991");
		dr.findElement(By.className("ideal-radiocheck-label")).click();
		dr.findElement(By.id("streetaddress")).sendKeys("solapur");
		dr.findElement(By.id("country")).sendKeys("India");
		dr.findElement(By.id("zipcode")).sendKeys("413001");
		dr.findElement(By.id("city")).sendKeys("solapur");
		
		WebElement occDropDown=dr.findElement(By.name("Occupation"));
		Select tel1= new Select(occDropDown);
		tel1.selectByIndex(4);
		dr.findElement(By.className("ideal-radiocheck-label")).click();
		dr.findElement(By.id("website")).sendKeys("Http://abc.com");
		
		

	}

}

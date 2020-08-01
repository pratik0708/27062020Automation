package basicSeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr= new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.get("http://sampleapp.tricentis.com/101/");
	
		/*
		 * WebElement ele=dr.findElement(By.xpath("//a[@id='nav_automobile']")); String
		 * data=ele.getText(); System.out.println(data); ele.click();
		 */
		
		/*
		 * WebElement ele=dr.findElement(By.xpath("//a[text()='Automobile']")); String
		 * data=ele.getText(); System.out.println(data); ele.click();
		 */	
		
		WebElement ele=dr.findElement(By.xpath("//a[contains(text(),'Auto']"));	
		String data=ele.getText();
		System.out.println(data);
		ele.click();	
		


	}

}

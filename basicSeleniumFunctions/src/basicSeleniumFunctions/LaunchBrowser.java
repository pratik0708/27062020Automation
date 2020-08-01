package basicSeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {

		// Set ChromeDriver path
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/101/#");

		// dr.findElement(By.id("nav_automobile")).click();

		WebElement ele = dr.findElement(By.id("nav_automobile"));
		String data = ele.getText();
		System.out.println(data);
		// ele.click();

		// Enter Text
		dr.findElement(By.id("search_form")).sendKeys("VW");
		dr.findElement(By.id("search_form")).sendKeys(Keys.ENTER);

	}

}

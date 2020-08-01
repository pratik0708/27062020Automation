package basicSeleniumFunctions;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();	
		dr.get("http://sampleapp.tricentis.com/101/index.php");
		
		String parent=dr.getWindowHandle();
		System.out.println(parent);
		
		dr.findElement(By.id("search_form")).sendKeys("abc");
		dr.findElement(By.id("search_form")).sendKeys(Keys.ENTER);
		dr.findElement(By.id("search_form")).clear();
		Thread.sleep(10000);
		
		dr.findElement(By.id("search_form")).sendKeys("VM");
		dr.findElement(By.id("search_form")).sendKeys(Keys.ENTER);
		dr.findElement(By.id("search_form")).clear();
		Thread.sleep(10000);
		
		dr.findElement(By.id("search_form")).sendKeys("xyz");
		dr.findElement(By.id("search_form")).sendKeys(Keys.ENTER);
		dr.findElement(By.id("search_form")).clear();
		Thread.sleep(10000);
		
		dr.findElement(By.id("search_form")).sendKeys("BMW");
		dr.findElement(By.id("search_form")).sendKeys(Keys.ENTER);
		
		Set<String> wins=dr.getWindowHandles();
		
		for(String w:wins)
		{
			dr.switchTo().window(w);
			
			List<WebElement> elements=dr.findElements(By.xpath("//input[@value='BMW']"));
			
			if(elements.size()>0)
			{
				break;
			}
			
		}
				
		dr.findElement(By.xpath("//a[text()='Login/Register']")).click();
		
		//Enter email on Login Up Window
		dr.findElement(By.id("user_name")).sendKeys("anand@gmail.com");
		
		dr.close();
		
		dr.switchTo().window(parent);
		
		dr.findElement(By.id("nav_automobile")).click();
	}

}

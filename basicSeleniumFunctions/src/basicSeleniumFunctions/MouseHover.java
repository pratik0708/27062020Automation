package basicSeleniumFunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.get("http://www.flipkart.com");
		
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		Actions act=new Actions(dr);
		
        act.moveToElement(dr.findElement(By.xpath("//span[text()='Men']"))).build().perform();
		
		WebDriverWait wait=new WebDriverWait(dr, 5);
		
	    wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//a[text()='T-Shirts']"))));
		
		dr.findElement(By.xpath("//a[text()='T-Shirts']")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[1]"))));
		
		act.dragAndDropBy(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[1]")), 50, 0).build().perform();
		
		
		

	}

}

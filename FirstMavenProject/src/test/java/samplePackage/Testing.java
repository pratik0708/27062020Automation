package samplePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Testing {
	
	@Test
	public void test1() 
	{
		System.out.println("Testing Maven-TestNG integration");
	}
     
	@Test
	public void test2() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://paytm.com/");
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		dr.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div[4]/div")).click();
		Thread.sleep(5000);
		dr.findElement(By.xpath("//*[@id=\"main-container\"]/div/div/div/div/div[1]/div/p")).click();
		dr.switchTo().frame(dr.findElement(By.tagName("iframe")));
		System.out.println(dr.findElement(By.xpath("//p[text()='Login into your paytm Web account']")).getText());
		

	}
}

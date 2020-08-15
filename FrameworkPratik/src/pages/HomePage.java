package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver dr;
	
	public HomePage(WebDriver dr)
	{
		this.dr=dr;
		
	}
      
	By automobile=By.id("nav_automobile");
	By truck=By.id("nav_truck");
	By motorcycle=By.id("nav_motorcycle");
	By Camper=By.id("nav_Camper");
	
	
	
	
	
}

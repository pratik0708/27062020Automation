package basicSeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Truck_EnterVehicledata {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/101/#");
		dr.findElement(By.id("nav_truck")).click();
		WebElement makeDropDown=dr.findElement(By.name("Make"));
		Select sel= new Select(makeDropDown);
		sel.selectByValue("Toyota");
		dr.findElement(By.id("engineperformance")).sendKeys("500");
		dr.findElement(By.id("dateofmanufacture")).sendKeys("09/07/2012");
		WebElement noofSeatsDropDown=dr.findElement(By.name("Number of Seats"));
		Select seat= new Select(noofSeatsDropDown);
		seat.selectByIndex(6);
		
		WebElement fuelTypeDropDown=dr.findElement(By.name("Fuel Type"));
		Select fuel= new Select(fuelTypeDropDown);
		fuel.selectByIndex(2);
		
		
		dr.findElement(By.id("payload")).sendKeys("600");
		dr.findElement(By.id("totalweight")).sendKeys("1000");
		dr.findElement(By.id("listprice")).sendKeys("100000");
		dr.findElement(By.id("licenseplatenumber")).sendKeys("KL467MH78");
		dr.findElement(By.id("annualmileage")).sendKeys("800");
		dr.findElement(By.id("nextenterinsurantdata")).click();
		
		dr.findElement(By.id("firstname")).sendKeys("Pratik");
		dr.findElement(By.id("lastname")).sendKeys("Rupnar");
		dr.findElement(By.id("birthdate")).sendKeys("07/08/1991");
				
		
		dr.findElement(By.xpath("//*[text()='female']")).click();
        dr.findElement(By.id("streetaddress")).sendKeys("Street Number 16");
		
		WebElement countryDropDown=dr.findElement(By.name("Country"));
		Select cou= new Select(countryDropDown);
		cou.selectByVisibleText("India");
		dr.findElement(By.id("zipcode")).sendKeys("411014");
		dr.findElement(By.id("city")).sendKeys("Pune");
		WebElement occupationDropDown=dr.findElement(By.name("Occupation"));
		Select occ= new Select(occupationDropDown);
		occ.selectByIndex(4);
		dr.findElement(By.className("ideal-check")).click();
		dr.findElement(By.id("website")).sendKeys("Http://truckpurchase.com");
		
		dr.findElement(By.id("nextenterproductdata")).click();
		dr.findElement(By.id("startdate")).sendKeys("09/26/2020");
		WebElement insuranceDropDown=dr.findElement(By.name("Insurance Sum"));
		Select ins= new Select(insuranceDropDown);
		ins.selectByIndex(5);
		WebElement damageDropDown=dr.findElement(By.name("Damage Insurance"));
		Select dam= new Select(damageDropDown);
		dam.selectByIndex(3);
		dr.findElement(By.xpath("//input[@id='EuroProtection']//following::span[1]")).click();
		dr.findElement(By.id("nextselectpriceoption")).click();

		dr.findElement(By.xpath("//input[@id='selectsilver']//following::span[1]")).click();
		Thread.sleep(3000);
		dr.findElement(By.id("nextsendquote")).click();
		
    	dr.findElement(By.id("email")).sendKeys("pratikrupnar143@gmail.com");
    	dr.findElement(By.id("phone")).sendKeys("1234567890");
    	dr.findElement(By.id("username")).sendKeys("Pratik1991");
    	dr.findElement(By.id("password")).sendKeys("Pass123");
    	dr.findElement(By.id("confirmpassword")).sendKeys("Pass123");
    	dr.findElement(By.id("Comments")).sendKeys("Send the quotation as per given info.");
	}

}


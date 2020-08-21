package pages.Camper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import libraries.CommonLibrary;

public class EnterVehicleData {

	WebDriver dr;
	CommonLibrary lib = new CommonLibrary();

	public EnterVehicleData(WebDriver dr) {
		this.dr = dr;
	}

	By make = By.id("make");
	By engineperformance = By.id("engineperformance");
	By dateofmanufacture = By.id("dateofmanufacture");
	By numberofseats = By.id("numberofseats");
	By righthanddriveyes = By.xpath("//span[@class='ideal-radio']");
	By fuel = By.id("fuel");
	By payload = By.id("payload");
	By totalweight = By.id("totalweight");
	By listprice = By.id("listprice");
	By licenseplatenumber = By.id("licenseplatenumber");
	By annualmileage = By.id("annualmileage");

	public boolean isMakeDropdownDisplayed()
	{
	return lib.isElementPresent(dr, make);
	}
	
	public boolean isEnginePerformanceDisplayed()
	{
		return lib.isElementPresent(dr, engineperformance);
	}
	
	public boolean isDateOfManufactureDisplayed()
	{
		return lib.isElementPresent(dr,dateofmanufacture);
	}
	public boolean isNumberOfSeatsDisplayed()
	{
		return lib.isElementPresent(dr,numberofseats);
	}
	public boolean isRightHandDriveyesDisplayed()
	{
		return lib.isElementPresent(dr,righthanddriveyes);
	}
	public boolean isFuelDisplayed()
	{
		return lib.isElementPresent(dr,fuel);
	}
	public boolean isPayLoadDisplayed()
	{
		return lib.isElementPresent(dr,payload);
	}
	public boolean isTotalWeightDisplayed()
	{
		return lib.isElementPresent(dr,totalweight);
	}
	public boolean isListPriceDisplayed()
	{
		return lib.isElementPresent(dr,listprice);
	}
	public boolean isLicensePlateNumberDisplayed()
	{
		return lib.isElementPresent(dr,licenseplatenumber);
	}
	public boolean isAnnualMileageDisplayed()
	{
		return lib.isElementPresent(dr,annualmileage);
	}
	public void selectMaker(String visibleText)
	{
		lib.selectByVisibleText(dr, make, visibleText);
	}
	public void enterEnginePerformance(String EngineperformanceinKW)
	{
		dr.findElement(engineperformance).sendKeys(EngineperformanceinKW);
	}
	public void enterDateOfManufacturing(String DOM)
	{
		dr.findElement(dateofmanufacture).sendKeys(DOM);
	}
	public void selectNumberOfSeat(String visibleText)
	{
		lib.selectByVisibleText(dr,numberofseats , visibleText);
	}
	public void selectRightHandDriveyes()
	{
		dr.findElement(righthanddriveyes).click();
	}
	public void selectFuel(String visibleText)
	{
		lib.selectByVisibleText(dr, fuel, visibleText);
	}
	public void enterPayLoad(String PayloadKg)
	{
		dr.findElement(payload).sendKeys(PayloadKg);
	}
	public void enterTotalweight(String TotalWeightKg)
	{
		dr.findElement(totalweight).sendKeys(TotalWeightKg);
	}
	public void enterListprice(String listprice$)
	{
		dr.findElement(listprice).sendKeys(listprice$);
	}
	public void enterLicensePlateNumber(String LPN)
	{
		dr.findElement(licenseplatenumber).sendKeys(LPN);
	}
	public void enterAnnualMileage(String AMinML)
	{
		dr.findElement(annualmileage).sendKeys(AMinML);
	}
}

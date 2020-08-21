package testScripts.Camper;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import driver.Driver;
import pages.HomePage;
import pages.Camper.EnterVehicleData;

public class CamperEnterVehicleDataScript extends Driver {
	
	WebDriver dr;
	EnterVehicleData EVC;
	HomePage HP;
	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String Browser)
	{
		dr=lib.launchBrowser(Browser);
		HP = new HomePage (dr);
		EVC =new EnterVehicleData (dr);
		HP.isCamperDisplayed();
		HP.clickCamper();
	}
	
	@AfterTest
	public void quitbrowser()
	{
		dr.quit();
		System.out.println("Script run sucessfully");
	}

	@Test(priority=0)
	public void CamperMake()
	{
		Assert.assertEquals(EVC.isMakeDropdownDisplayed(), true);
		EVC.selectMaker("BMW");
	}
	
	@Test(priority=1)
	public void CamperEngineperformance()
	{
		EVC.isEnginePerformanceDisplayed();
		EVC.enterEnginePerformance("1500");
	}
	
	@Test(priority=3)
	public void CamperDateOfManufacturing() 
	{
		EVC.isDateOfManufactureDisplayed();
		EVC.enterDateOfManufacturing("1/1/2010");
		}
	
	@Test(priority=4)
	public void CamperNoOfSeats()
	{
		EVC.isNumberOfSeatsDisplayed();
		EVC.selectNumberOfSeat("6");
	}
	
	@Test(priority=5)
	public void CamperRightHandsideDrive()
	{
		EVC.isRightHandDriveyesDisplayed();
		EVC.selectRightHandDriveyes();
	}
	@Test(priority=6)
	public void CamperFueltype()
	{
		EVC.isFuelDisplayed();
		EVC.selectFuel("Diesel");
	}
	
	@Test(priority=7)
		public void CamperPayload()
		{
		EVC.isPayLoadDisplayed();
		EVC.enterPayLoad("10000");
		}
	
	@Test(priority=8)
	public void CamperTotalweight()
	{
		EVC.isTotalWeightDisplayed();
		EVC.enterTotalweight("20000");
	}
	
	@Test(priority=9)
	public void CamperListPrice()
	{
		EVC.isListPriceDisplayed();
		EVC.enterListprice("250000000");
	}
	
	@Test(priority=10)
	public void CamperLiecenceplateno()
	{
		EVC.isLicensePlateNumberDisplayed();
		EVC.enterLicensePlateNumber("hh359");
	}
	
	@Test(priority=11)
	public void CamperAnnualMileage()
	{
		EVC.isAnnualMileageDisplayed();
		EVC.enterAnnualMileage("1000");
	}
	
	}
	


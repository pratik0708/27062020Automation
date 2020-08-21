package testScripts.Camper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import driver.Driver;
import libraries.CommonLibrary;
import pages.HomePage;
import pages.Camper.EnterInsuranceData;

public class CamperEnterInsuranceData extends Driver{
	
	WebDriver dr;
	EnterInsuranceData EID;
	HomePage HP;
	

	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String Browser)
	{
	dr=lib.launchBrowser(Browser);
	HP=new HomePage(dr);
	EID=new EnterInsuranceData(dr);
	HP.isCamperDisplayed();
	HP.clickCamper();
	HP.clickCamperEnterInsurantData();
	}
	
	/*
	 * @AfterTest public void quitbrower() { dr.quit();
	 * System.out.println("Script run sucessfully"); }
	 */
	
	@Test(priority=0)
	public void CamperFirstname()
	{
		EID.isFIrstnameDisplayed();
		EID.enterFirstName("Aniket");
	}
	
	@Test(priority=1)
	public void CamperLastName()
	{
		EID.isLastnameDisplayed();
		EID.enterLastname("Rajput");
	}
	
	@Test(priority=3)
	public void CamperDOB()
	{
		EID.isDateofbirthDisplayed();
		EID.enterDateOfBirth("2/11/1991");
	}
	
	@Test(priority=4)
	public void CamperGender()
	{
		EID.isGenderDisplayed();
	    EID.clickGender();
	}
	
	@Test(priority=5)
	public void CamperStreetaddress()
	{
		EID.isStreetaddressDisplayed();
		EID.enterStreetaddress("Porwal Road");
	}
	
	@Test(priority=6)
	public void CamperCountry()
	{
	 Assert.assertEquals(EID.isCountryDisplayed(), true);
	 EID.selectcountry("India");
	}
	
	@Test(priority=7)
	public void CamperZipCode()
	{
		EID.isZipcodeDisplayed();
		EID.enterZipcode("41107");
	}
	
	@Test(priority=8)
	public void CamperCity()
	{
		EID.isCityDisplayed();
		EID.entercity("Pune");
	}
	
	@Test(priority=9)
	public void CamperOccupation()
	{
		Assert.assertEquals(EID.isOccupationDisplayed(), true);
		EID.selectOccupation("Farmer");
	}
	
	@Test(priority=10)
	public void CamperHobbies()
	{
		EID.isHobbiesDisplayed();
		EID.clickHobbies();
	}

	@Test(priority=11)
	public void CamperWesite()
	{
		EID.isWebsiteDisplayed();
		EID.enterWebsite("www.google.com");
	}

	
}

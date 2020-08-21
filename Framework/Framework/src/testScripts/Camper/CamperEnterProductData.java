package testScripts.Camper;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import driver.Driver;
import pages.HomePage;
import pages.Camper.EnterProductData;

public class CamperEnterProductData extends Driver {

	WebDriver dr;
	EnterProductData EPD;
	HomePage HP;

	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String Browser) {
		dr = lib.launchBrowser(Browser);
		HP = new HomePage(dr);
		EPD = new EnterProductData(dr);
		HP.isCamperDisplayed();
		HP.clickCamper();
		HP.clickCamperEnterProductData();
	}

	@Test(priority = 0)
	public void CamperStartDate() {

		EPD.isStartDateDisplayed();
		EPD.enterStartDate("12/10/2020");
	}

	@Test(priority = 1)
	public void CamperInsuranceSum()

	{
		Assert.assertEquals(EPD.isStartDateDisplayed(), true);
		EPD.selectInusranceSum("3.000.000,00");
	}

	@Test(priority = 2)
	public void CamperDamageInsurance() {
		Assert.assertEquals(EPD.isDamageInsuranceDisplayed(), true);
		EPD.selectDamageInsurance("Full Coverage");
	}

	@Test(priority = 3)
	public void CamperOptionalProduct() {
      
		EPD.isOptionalProductDisplayed();
		EPD.clickOptionalProducts();
	}

}

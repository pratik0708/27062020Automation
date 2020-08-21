package pages.Camper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import libraries.CommonLibrary;

public class EnterInsuranceData {

	WebDriver dr;
	CommonLibrary lib= new CommonLibrary();
	
	public EnterInsuranceData(WebDriver dr)
	{
		this.dr=dr;
	}
	
	By firstname =By.xpath("//input[@id='firstname']");
	By lastname= By.xpath("//input[@id='lastname']");
	By dateofbirth= By.xpath("//input[@id='birthdate']");
	By gender =By.xpath("//label[text()='Male']/span");
	By streetaddress = By.xpath("//input[@id='streetaddress']");
	By country =By.xpath("//select[@id='country']");
	By zipcode=By.xpath("//input[@id='zipcode']");
	By city =By.xpath("//input[@id='city']");
	By occupation = By.xpath("//select[@id='occupation']");
	By hobbies =By.xpath("//label[contains(.,'Bungee')]/span");
	By website =By.xpath("//input[@id='website']");
	By picture=By.xpath("//div[@class='ideal-file-wrap']/input[@type='text']");

	public boolean isFIrstnameDisplayed()
	{
		return lib.isElementPresent(dr, firstname);
	}
	public boolean isLastnameDisplayed()
	{
		return lib.isElementPresent(dr, lastname);
	}
	public boolean isDateofbirthDisplayed()
	{
		return lib.isElementPresent(dr, dateofbirth);
	}
	public boolean isGenderDisplayed()
	{
		return lib.isElementPresent(dr, gender);
	}
	public boolean isStreetaddressDisplayed()
	{
		return lib.isElementPresent(dr, streetaddress);
	}
	public boolean isCountryDisplayed()
	{
		return lib.isElementPresent(dr, country);
	}
	public boolean isZipcodeDisplayed()
	{
		return lib.isElementPresent(dr, zipcode);
	}
	public boolean isCityDisplayed()
	{
		return lib.isElementPresent(dr, city);
	}
	public boolean isOccupationDisplayed()
	{
		return lib.isElementPresent(dr, occupation);
	}
	public boolean isHobbiesDisplayed()
	{
		return lib.isElementPresent(dr, hobbies);
	}
	public boolean isWebsiteDisplayed()
	{
		return lib.isElementPresent(dr, website);
	}
	public boolean isPictureDisplayed()
	{
		return lib.isElementPresent(dr, picture);
	}
	public void enterFirstName(String FirstName)
	{
		dr.findElement(firstname).sendKeys(FirstName);
	}
	public void enterLastname(String Lastname)
	{
		dr.findElement(lastname).sendKeys(Lastname);
	}
	public void enterDateOfBirth(String Dateofbirth)
	{
		dr.findElement(dateofbirth).sendKeys(Dateofbirth);
	}
	public void clickGender()
	{
		dr.findElement(gender).click();
	}
	public void enterStreetaddress(String Streetaddress)
	{
		dr.findElement(streetaddress).sendKeys(Streetaddress);
	}
	public void clickHobbies()
	{
		dr.findElement(hobbies).click();
	}
	public void enterZipcode(String Zipcode)
	{
		dr.findElement(zipcode).sendKeys(Zipcode);
	}
	public void entercity(String City)
	{
		dr.findElement(city).sendKeys(City);
	}
	public void selectOccupation(String visibleText)
	{
		lib.selectByVisibleText(dr, occupation, visibleText);
	}
	public void selectcountry(String visibleText)
	{
		lib.selectByVisibleText(dr, country, visibleText);
	}
	public void enterWebsite(String Website)
	{
		dr.findElement(website).sendKeys(Website);
	}
	public void enterPicture(String Picture)
	{
		dr.findElement(picture).sendKeys(Picture);
	}
	
}

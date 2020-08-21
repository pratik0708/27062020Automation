package pages.Camper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import libraries.CommonLibrary;

public class EnterProductData {
	
	WebDriver dr;
	CommonLibrary lib= new CommonLibrary();
	
	public EnterProductData(WebDriver dr)
	{
		this.dr=dr;
	}
      By startdate= By.id("startdate");
      By insurancesum=By.id("insurancesum");
      By damageinsurance=By.id("damageinsurance");
      By optionalproducts=By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[4]/p/label[1]/span");
      By next=By.id("nextselectpriceoption");
      
      public boolean isStartDateDisplayed()
      {
    	  return lib.isElementPresent(dr, startdate);
      }
      public boolean isInsurancesumDisplayed()
      {
    	  return lib.isElementPresent(dr, insurancesum);
      }
      public boolean isDamageInsuranceDisplayed()
      {
    	  return lib.isElementPresent(dr, damageinsurance);    	  
      }
      public boolean isOptionalProductDisplayed()
      {
    	  return lib.isElementPresent(dr, optionalproducts);    	  
      }
      
      public void enterStartDate(String StartDate)
      {
    	  dr.findElement(startdate).sendKeys(StartDate);
      }
      
      public void selectInusranceSum(String visibleText)
      {
    	  lib.selectByVisibleText(dr, insurancesum, visibleText);
      }
      public void selectDamageInsurance(String visibleText)
      {
    	  lib.selectByVisibleText(dr, damageinsurance, visibleText);
      }
      public void clickOptionalProducts()
      {
    	  dr.findElement(optionalproducts).click();
      }
      public void clickNext()
      {
    	  dr.findElement(next).click();
      }
} 

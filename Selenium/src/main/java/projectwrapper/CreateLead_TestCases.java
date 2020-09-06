package projectwrapper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import projectwrapper.ProjectSpecific;

public class CreateLead_TestCases extends ProjectSpecific {

	
@Test(dataProvider = "getData")

public void CreateLead(String cName, String fName, String lName) {


		driver.findElementByXPath("(//a[text()='Create Lead'])").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Mrs");
		
		driver.findElementById("createLeadForm_description").sendKeys("TCS");
		
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").clear();
		
		
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("1");
		
		driver.findElementById("createLeadForm_departmentName").sendKeys("MKT");
		
		
		WebElement ccc = driver.findElementById("createLeadForm_currencyUomId");
		Select val = new Select(ccc);
		val.selectByValue("BDT");
		
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("100");
		
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("https://www.google.com/");
		WebElement ccc1 = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select stat = new Select(ccc1);
		stat.selectByValue("TX");
		
		WebElement coun = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select count = new Select(coun);
		count.selectByValue("USA");
		
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("75061");
		
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("123456789");
		
		
		
		
		
		
		
		
		
		
		
	}

}

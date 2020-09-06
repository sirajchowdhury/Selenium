package learnSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BrowserTest01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\siraj\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();

		driver.findElementByLinkText("Create Lead").click();
		
		
		
		//driver.findElementByLinkText("Find Leads").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys("AB Bank");
		
		driver.findElementById("createLeadForm_firstName").sendKeys("Hamid");

		driver.findElementById("createLeadForm_lastName").sendKeys("Mia");
		WebElement drop = driver.findElementById("createLeadForm_dataSourceId");
		Select val = new Select(drop);
		val.selectByValue("LEAD_EMPLOYEE");
		
		driver.findElementById("createLeadForm_departmentName").sendKeys("Accounts");
		WebElement ind = driver.findElementById("createLeadForm_industryEnumId");
		Select inds = new Select (ind);
		inds.selectByVisibleText("Finance");

		driver.findElementById("createLeadForm_personalTitle").sendKeys("Mr.");
		
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("24");
		
		WebElement aaa = driver.findElementById("createLeadForm_ownershipEnumId");
		Select vvv = new Select(aaa);
		vvv.selectByValue("OWN_SCORP");

		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("7183000707");
		
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("abcxyz@inbox.com");
		
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("google.com");
		
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("2109 Fox St");
		
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Apt # 3B");
		
		driver.findElementById("createLeadForm_generalCity").sendKeys("Woodbury");
		
		WebElement prov = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select Stat = new Select(prov);
		Stat.selectByVisibleText("New York");
		
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("10908");
		Thread.sleep(3000);
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Find Leads").click();
		
		driver.findElementById("ext-gen248").sendKeys("Abul");
		
		driver.findElementById("ext-gen250").sendKeys("Ali");
		
		driver.findElementById("ext-gen252").sendKeys("ABC Co.");
		
		
		
		//driver.findElementByLinkText("Create Lead").click();
		//Thread.sleep(5000);

		//driver.findElementByLinkText("My Leads").click();

		
		
		
		
		 
	}

}

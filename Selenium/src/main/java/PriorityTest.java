import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityTest {

	public ChromeDriver driver;

	@BeforeMethod

	public void priority()

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\siraj\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	driver.findElementById("username").sendKeys("DemoSalesManager");
	
	driver.findElementById("password").sendKeys("crmsfa");
	
	driver.findElementByClassName("decorativeSubmit").click();
	
	driver.findElementByLinkText("CRM/SFA").click();
}

@Test (priority=1)

public void createlead() {

	driver.findElementByLinkText("Create Lead").click();

	driver.findElementByLinkText("Leads").click();

	driver.findElementByLinkText("Find Leads").click();
}

@Test (priority=2)

public void editlead() {
	driver.findElementById("createLeadForm_companyName").sendKeys("AB Bank");
	
	driver.findElementById("createLeadForm_firstName").sendKeys("Hamid");

	driver.findElementById("createLeadForm_lastName").sendKeys("Mia");
	WebElement drop = driver.findElementById("createLeadForm_dataSourceId");
	Select val = new Select(drop);
	val.selectByValue("LEAD_EMPLOYEE");
	
	driver.findElementById("createLeadForm_departmentName").sendKeys("Cashier");
	
}

@Test (priority=0)

public void editlead1() {
	
driver.findElementById("createLeadForm_numberEmployees").sendKeys("24");
WebElement aaa = driver.findElementById("createLeadForm_ownershipEnumId");
Select vvv = new Select(aaa);
vvv.selectByValue("OWN_SCORP");

driver.findElementByLinkText("Create Lead").click();
Thread.sleep(5000);

driver.findElementByLinkText("My Leads").click();
}
}



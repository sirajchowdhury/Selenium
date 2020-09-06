package learnInterface;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericWrapper implements WrapperMethods {

	public ChromeDriver driver;
	
	public void launchBrowser(String Url) {
			
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\siraj\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get(Url);
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	}
	
	public void enterById(String locatorValue, String data) {
		driver.findElementById(locatorValue).sendKeys(data);
		
	}

	public void enterByName(String locatorValue, String data) {
		driver.findElementByName(locatorValue).sendKeys(data);
		
	}	

	public void enterByClassName(String locatorValue, String data) {
		driver.findElementByClassName(locatorValue).sendKeys(data);
		
	}

	public void enterByLinkText(String locatorValue, String data) {
		driver.findElementByLinkText(locatorValue).sendKeys(data);
		
	}

	public void enterByXpath(String locatorValue, String data) {
		driver.findElementByXPath(locatorValue).sendKeys(data);
		
	}

	public void enterByPartialLinkText(String locatorValue, String data) {
		driver.findElementByPartialLinkText(locatorValue).sendKeys(data);
		
	}

	public void enterByCssSelector(String locatorValue, String data) {
		driver.findElementByCssSelector(locatorValue).sendKeys(data);
		
	}
	
	public void clickById(String locatorValue) {
		driver.findElementById(locatorValue);
	}
	
	public void clickByName(String locatorValue) {
		driver.findElementByLinkText(locatorValue).click();
		
	}

	public void clickByClassName(String locatorValue) {
		driver.findElementByClassName(locatorValue).click();
		
	}

	public void clickByLinkText(String locatorValue) {
		driver.findElementByLinkText(locatorValue).click();
		
	}
	
	public void clickByPartialLinkText(String locatorValue) {
	driver.findElementByPartialLinkText(locatorValue).click();
			
	}

	
	public void clickByXpath(String locatorValue) {
		driver.findElementByXPath(locatorValue).click();
		
	}

	public void SelectVisibleTextById(String Id, String Value) {
		WebElement ttt  = driver.findElementById(Id);
		Select obj = new Select (ttt);
		obj.selectByVisibleText(Value);
	}

	public void SelectValueById(String Id, String Value) {
		WebElement ttt1 = driver.findElementById(Id);
		Select obj2 = new Select (ttt1);
		obj2.selectByValue(Value);
		
	}


	public void verifyById(String locatorValue, String data) {
		String text = driver.findElementById(locatorValue).getText();
		if (text.equals(data)) {
		System.out.println("Valid name");}
		else
		{System.out.println("Invalid name"); }
		
	}
	
	public void verifyByName(String locatorValue, String data) {
		String text1 = driver.findElementByName(locatorValue).getText();
		if(text1.equals(data)) {
			System.out.println("Valid name");}
		else
			{System.out.println("Invalid name");
		}
	}


	public void closeBrowser() {
		driver.close();
		
	}

	public void SelectVisibleTextByName(String Id, String Value) {
		// TODO Auto-generated method stub
		
	}

	public void SelectValueByName(String Id, String Value) {
		// TODO Auto-generated method stub
		
	}

	public void SelectIndexById(String Name, int Value) {
		// TODO Auto-generated method stub
		
	}

	public void SelectIndexByName(String Name, int Value) {
		// TODO Auto-generated method stub
		
	}

	public void getTextById(String Id) {
		// TODO Auto-generated method stub
		
	}

	public void verifyByClassName(String locatorValue, String data) {
		// TODO Auto-generated method stub
		
	}

}
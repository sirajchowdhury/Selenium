package learnSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestBrowser1 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
@Test
public void rrr(){

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\siraj\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://hcr.ny.gov/rrp");
		driver.findElementByXPath("//span[text() = 'Rental Housing']").click();
		driver.findElementByXPath("//a[text()='Tenants']").click();
	
		
		
		
	}

}

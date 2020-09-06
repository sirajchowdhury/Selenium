package projectwrapper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecific {
public ChromeDriver driver;
	
	@Parameters({"url", "uname", "pwd"})
	@BeforeMethod
	public void login(String url, String uname, String pwd) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\siraj\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(url);
		
		driver.findElementById("username").sendKeys(uname);
		
		driver.findElementByName("PASSWORD").sendKeys(pwd);
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
				
		
		
		
	}

	
	@AfterMethod
	public void close() {
	driver.close();
	}
	
	@DataProvider
	public String[][] getData() {
		String [][] data = new String [2][3];
		
		data [0][0] = "Xenon";
		data [0][1] = "Abid";
		data [0][2] = "Ali";
		
		data [1][0] = "XYZ CO";
		data [1][1] = "Faruk";
		data [1][2] = "Ahmed";
		
		return data;
		
	}
	
}

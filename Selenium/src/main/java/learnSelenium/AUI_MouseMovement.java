package learnSelenium;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public abstract class AUI_MouseMovement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\siraj\\eclipse-workspace\\JavaProject\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://mrbool.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		WebElement content = driver.findElementByClassName("menulink");
		
		Actions action = new Actions(driver);
		
		action.moveToElement(content).perform();
		
		
		
		
		
		
		
		
	}

}

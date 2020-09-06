package learnSelenium;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\siraj\\eclipse-workspace\\JavaProject\\drivers\\chromedriver.exe");
				
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		driver.manage().window().maximize();

		
		WebElement rightclick  = driver.findElementByXPath("//span[text() = 'right click me']");
		
		Actions promtalert = new Actions(driver);
		
		promtalert.contextClick(rightclick).perform();
		
		
		

	}

}

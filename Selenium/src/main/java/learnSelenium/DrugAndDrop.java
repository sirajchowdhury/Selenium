package learnSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DrugAndDrop {

	//public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	@Test
	public void ttt() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\siraj\\eclipse-workspace\\JavaProject\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);

		Actions action = new Actions(driver);
				
		WebElement Draggable = driver.findElementById("draggable");
		
		WebElement Droppable = driver.findElementById("droppable");
		
		//Thread.sleep(2000);
		
		action.dragAndDrop(Draggable, Droppable).perform();
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
	}

}

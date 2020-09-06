package interface_Practice2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xwpf.usermodel.Document;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWrapper_2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\siraj\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		/*driver.get("https://www.w3schools.com");
		driver.findElementByLinkText("Learn HTML").click();
		driver.findElementByLinkText("Start learning HTML now »").click();
		driver.findElementByLinkText("Try it Yourself »").click();*/
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		Set<String> wind = driver.getWindowHandles();
		for (String eachwind : wind) {
			System.out.println(eachwind);
			driver.switchTo().window(eachwind);
		}
		
	}
	
}



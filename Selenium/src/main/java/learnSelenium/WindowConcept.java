package learnSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\siraj\\eclipse-workspace\\JavaProject\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/met_win_open.asp");
		
	}

}

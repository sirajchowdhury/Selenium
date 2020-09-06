package learnInterface;

import org.testng.annotations.Test;

public class Tcs01_login extends GenericWrapper {
	
	@Test
	public void login ( ) {

	launchBrowser ("http://leaftaps.com/opentaps/control/main");
	enterById("username", "DemoSalesManager");
	enterById("password", "crmsfa");
	clickByClassName("decorativeSubmit");
	clickByLinkText("CRM/SFA");
	
	
	}
}

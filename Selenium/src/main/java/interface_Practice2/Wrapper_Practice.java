package interface_Practice2;

public interface Wrapper_Practice {
	
	
public void launchBrowser(String Url);
	
	public void enterById(String locatorValue, String data);
	
	public void enterByName(String locatorValue, String data);
	
	public void enterByClassName(String locatorValue, String data);
	
	public void enterByLinkText(String locatorValue, String data);

	public void enterByPartialLinkText(String locatorValue, String data);
	
	public void enterByXpath(String locatorValue, String data);
	
	public void enterByCssSelector(String locatorValue, String data);	
	
	public void clickById(String locatorValue);

	public void clickByName(String locatorValue);
	
	public void clickByClassName(String locatorValue);
	
	public void clickByLinkText(String locatorValue);
	
	public void clickByPartialLinkText(String locatorValue);
	
	public void clickByXpath(String locatorValue);
	
	
	public void SelectVisibleTextById(String Id, String Value);
	
	public void SelectVisibleTextByName(String Id, String Value);
	
	public void SelectValueById(String Id, String Value);
	
	public void SelectValueByName(String Id, String Value);
	
	public void SelectIndexById(String Name, int Value);
	
	public void SelectIndexByName(String Name, int Value);
	
	public void getTextById(String Id);
	
	public void verifyById(String locatorValue, String data);

	public void verifyByName(String locatorValue, String data);
	
	public void verifyByClassName(String locatorValue, String data);
	
	public void enterframe(int Value);
	
	public void closeBrowser();
	
	
	
	
	

}


}

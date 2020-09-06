package learnSelenium;

public class TestNg {

	
	public void beforeSuite() {
		System.out.println("Before Suit");
	}
	
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	public void Test() {
	System.out.println("Test");	
	}
	
	public void Test1() {
		System.out.println("Test1");
	}
	
	public void aftrerMethod() {
		System.out.println("After Method");
	}

	public void afterClass() {
		System.out.println("After Class");
	}
	
	public void afterTest() {
		System.out.println("After Test");
	}
	
	public void afterSuite() {
		System.out.println("After Suite");
	}
}

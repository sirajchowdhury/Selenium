package learnSelenium;

import org.testng.annotations.Test;

public class TestNGPriority {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		@Test(priority=2)
		public void test() {
			System.out.println("Enter login");
		}
		
		@Test(priority=1)
		public void test2()  {
			System.out.println("Enter password");
		}
		
		@Test(priority=0)
		public void test3() {
			System.out.println("Enter name");
		
		
		
	}

}


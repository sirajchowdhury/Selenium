import org.testng.annotations.BeforeMethod;

public class TestNG3 {

//	public static void main(String[] args) {


@BeforeMethod
	

public void beforeMethod () {
	System.out.println("before method");
	}

@Test
public void Test() {
	System.out.println("Test");
}



}

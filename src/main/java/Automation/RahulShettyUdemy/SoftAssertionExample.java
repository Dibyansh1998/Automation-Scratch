package Automation.RahulShettyUdemy;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionExample {

	@Test
	public void testSoftAssertion() {
		SoftAssert softAssert = new SoftAssert();

		softAssert.assertEquals("Hello", "Hello");
		System.out.println("This will be printed");

		softAssert.assertEquals("Hello", "World"); // This will fail
		System.out.println("This will also be printed");

		softAssert.assertEquals(1, 2); // This will fail too
//		System.out.println("This will also pass");
		
		// Collect all assertion results
		softAssert.assertAll(); // This will report all failures
	}

}

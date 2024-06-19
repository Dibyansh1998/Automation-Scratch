package Automation.RahulShettyUdemy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionExample {

	@Test
	public void testHardAssertion() {
		Assert.assertEquals("Hello", "Hello");
		System.out.println("This will be printed");

		Assert.assertEquals("Hello", "World"); // This will fail
		System.out.println("This will not be printed");
	}
}

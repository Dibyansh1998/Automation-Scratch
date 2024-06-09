package Automation.RahulShettyUdemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo {

	@Test(dataProvider = "create")
	public void test(String username, String password) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");

		// UserName Text Box
		WebElement usertextBox = driver.findElement(By.id("user-name"));
		usertextBox.sendKeys(username);

		// Password Text Box
		WebElement passtextBox = driver.findElement(By.id("password"));
		passtextBox.sendKeys(password);

		// Click on Submit Button
		driver.findElement(By.id("login-button"));

		driver.close();
	}

	@DataProvider(name = "create")
	public Object[][] dataset1() {
		return new Object[][] {
			{ "standard_user", "secret_sauce" },
			{ "locked_out_user", "secret_sauce" },
			{ "problem_user", "secret_sauce" }, 
			{ "performance_glitch_user", "secret_sauce" }

		};

	}

}

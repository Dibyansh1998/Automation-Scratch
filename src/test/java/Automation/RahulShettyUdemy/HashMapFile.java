package Automation.RahulShettyUdemy;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HashMapFile {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://qa6.lifeatworkportal.com/deloitte");

		// Creating a HashMap to store usernames and passwords
		HashMap<String, String> userCredentials = new HashMap<>();

		// Adding some usernames and passwords to the HashMap
		userCredentials.put("911360001", "Test@1234");
		userCredentials.put("911360002", "Test@1234");
		userCredentials.put("911360003", "Test@1234");

		// Retrieving a password by username
		String username = "911360001";
		String password = userCredentials.get(username);

		if (password != null) {
			System.out.println("Password for " + username + ": " + password);
		} else {
			System.out.println("Username " + username + " not found.");
		}

		// Find the UserName and password input fields and enter credentials
		WebElement usernameInput = driver.findElement(By.id("USERNAME"));
		usernameInput.sendKeys(username);
		WebElement passwordInput = driver.findElement(By.id("password"));
		passwordInput.sendKeys(password);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("showhide"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='ContinueBtn']"))).click();
		System.out.println("This User" + "(" + username + ")" + " is able to click on Continue button on Home Page!!");

		// Authorization Page Command
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#CancelBtn"))).click();
		System.out.println("This User" + "(" + username + ")" + " is Web Enabled!!!");

		// Click on Site Again Link Command
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href='/deloitte']"))).click();
		
		// Iterating over all entries in the HashMap
		System.out.println("\nAll user credentials:");
		for (HashMap.Entry<String, String> entry : userCredentials.entrySet()) {
			System.out.println("Username: " + entry.getKey() + ", Password: " + entry.getValue());
		}
	}

}

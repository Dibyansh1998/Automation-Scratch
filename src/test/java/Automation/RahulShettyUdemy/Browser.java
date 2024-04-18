package Automation.RahulShettyUdemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Browser {

	public static void main(String[] args) throws InterruptedException {
		
                                                 // Used below command to invoke the Chrome Browser
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\dibya\\Downloads\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
	                                               //Used below command to invoke the Edge Browser
//				System.setProperty("webdriver.edge.driver",
//						"C:\\Users\\dibya\\Downloads\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		
		                                       //Used below command to invoke the Gecko Browser
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\dibya\\Downloads\\Drivers\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		// Implicit Wait
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		String password=getpassword(driver);
		String username="Dibyansh";
		driver.findElement(By.id("inputUsername")).sendKeys(username);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.className("signInBtn")).click();

		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div/p")).getText());
		Assert.assertEquals((driver.findElement(By.xpath("//div/p")).getText()), "You are successfully logged in.");

		System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
		Assert.assertEquals((driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText()), "Hello "+username+",");
		
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		Thread.sleep(2000);
		driver.close();

	}
	
	public static String getpassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		String passwordText=driver.findElement(By.cssSelector("form p")).getText();
		
		//Please use temporary password 'rahulshettyacademy' to Login.
		//Zero (0) th index-> Please use temporary password '
		// first (1) th index-> rahulshettyacademy' to Login.
		
		String [] passwordarray=passwordText.split("'");
		String password=passwordarray[1].split("'")[0];
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		return password;
		// Zero (o) th index-> rahulshettyacademy
		// First(1) th index-> ' to Login.

	}

}

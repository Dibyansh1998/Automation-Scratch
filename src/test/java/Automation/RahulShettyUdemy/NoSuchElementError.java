package Automation.RahulShettyUdemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoSuchElementError {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php/");
		
		//No Such Element error will occur whether the Locator is wrong or There is some wait to visibility of element located.
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Dibyansh");

	}

}

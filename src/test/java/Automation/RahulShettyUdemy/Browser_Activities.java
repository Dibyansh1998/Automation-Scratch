package Automation.RahulShettyUdemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Activities {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		//** Latest version of the SeleniumDriver  if we installed then no need to set-up the path of the browser it will automatically- 
		              // pick the below command
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\dibya\\Downloads\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//		  
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com"); //If page was fully loaded with all the element then use this command
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		driver.navigate().to("https://www.youtube.com"); //If page was Partially loaded with some of the element then use this command
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		driver.close();

	}

}

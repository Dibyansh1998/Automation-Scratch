package Automation.RahulShettyUdemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Self_Introduction {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\52304535\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());// This command will you the give the title of the page
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.close();// That command will close the current window
//		driver.quit();// This command will close the all the associated windows

	}

}

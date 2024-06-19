package Automation.RahulShettyUdemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {
		
		//If we want to run the code in headless Mode then No Browser will invoke, nothing will see as GUI perspective
		//But in console you will see the output.
		ChromeOptions option= new ChromeOptions();// This Class will execute the Headless Mode
		option.addArguments("--headless");// Need to parse this argument
		
//		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		String title=driver.getTitle();
		System.out.println(title);
		driver.quit();

	}

}

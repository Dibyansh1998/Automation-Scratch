package Automation.RahulShettyUdemy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClassDemo {

	public static void main(String[] args) 
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		
		//Hover the mouse on Profile Section
		WebElement move=driver.findElement(By.cssSelector(".desktop-user"));
		Actions a= new Actions(driver);
		a.moveToElement(move).build().perform();
		
		//Active the Search box and Shift the key and write Jeans
		a.moveToElement(driver.findElement(By.cssSelector("[class='desktop-query'] input"))).click()
		.keyDown(Keys.SHIFT).sendKeys("jeans").doubleClick().contextClick() //Context Click means right click
		.build().perform();
		
//		driver.quit();

	}

}

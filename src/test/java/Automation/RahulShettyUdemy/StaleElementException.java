package Automation.RahulShettyUdemy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementException {

	@Test
	public void StaleElementException1() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://omayo.blogspot.com/");
		WebElement ele= driver.findElement(By.cssSelector("div[class='widget-content'] textarea[id='ta1']"));
		ele.sendKeys("Dibyansh Verma");
		
		Thread.sleep(3000);
		//Click on Link
		driver.findElement(By.xpath("//a[normalize-space()='compendiumdev']")).click();
		
		Thread.sleep(3000);
		//Go to parent page
		driver.navigate().back();
		
		//If we missed the below step then it will give you the Stale Element Exception
		//To avoid the exception then re-initialized it the element which we want to clear it.
		ele= driver.findElement(By.cssSelector("div[class='widget-content'] textarea[id='ta1']"));
		ele.clear();
	}

}

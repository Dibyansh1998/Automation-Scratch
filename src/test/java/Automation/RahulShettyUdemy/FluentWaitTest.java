package Automation.RahulShettyUdemy;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitTest {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("[id='start'] button")).click();
		
		//Fluent Wait Command
		Wait<WebDriver> w1=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
		WebElement wait=w1.until(new Function<WebDriver, WebElement>(){
		public WebElement  apply(WebDriver driver)
		{
			if(driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed())
			{
				return driver.findElement(By.cssSelector("[id='finish'] h4"));
			}
			else
			{
				return null;
			}
		}
		});
		System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());
		
//		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(5));
//		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[id='finish'] h4")));
//		System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());
		
		driver.close();

	}

}
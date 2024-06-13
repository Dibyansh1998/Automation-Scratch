package Automation.RahulShettyUdemy;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
	//Below Command will execute the window handles
		
		Set<String> windows=driver.getWindowHandles();//[Parent Window, Child Window]
		Iterator<String> it=windows.iterator();
		String parentwindow=it.next();
		String childwindow=it.next();
		driver.switchTo().window(childwindow);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".im-para.red strong")));
		String email_id=driver.findElement(By.cssSelector(".im-para.red strong")).getText();
		
		//Split method will get the text from the String
//		String emailId=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		
		driver.switchTo().window(parentwindow);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username"))).sendKeys(email_id);
		
		

	}

}

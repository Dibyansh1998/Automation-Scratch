package Automation.RahulShettyUdemy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class framesDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://jqueryui.com/droppable/");
		
		//If we need to check how many frames are there then use below command
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		driver.switchTo().frame(0);
		
		//frame by elements
//		driver.switchTo().frame(driver.findElement(By.cssSelector("[class='demo-frame']")));
		WebElement source=driver.findElement(By.cssSelector("#draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		Actions a= new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
		
		//Below this command will go out from frames
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//li[@class='menu-item']/a[contains(text(),'Support')]")).click();

	}

}

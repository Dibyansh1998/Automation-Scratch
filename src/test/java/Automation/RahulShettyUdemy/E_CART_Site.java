package Automation.RahulShettyUdemy;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E_CART_Site {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Below code will wait until the element is visible on the page called as Explicit Wait
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(5));
		
		// This below code will wait for each elements which taking time to load the element, it'll apply for global level
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		String[] veggies = { "Beetroot", "Cucumber", "Beans" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		addItems(driver, veggies);

		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		//Explicit Wait
		
		System.out.println(w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo"))).getText());
		
//		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());

	}

	public static void addItems(WebDriver driver, String[] veggies) throws InterruptedException {
		// This code will get you all the products names for the page
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		Thread.sleep(3000);
		for (int i = 0; i < products.size(); i++) {
			String[] names = products.get(i).getText().split("-");

			String formattedNames = names[0].trim();// This will remove the space on the text
			List<String> itemsneededlist = Arrays.asList(veggies);

			int j = 0;
			if (itemsneededlist.contains(formattedNames)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == veggies.length) {
					break;
				}
			}

		}
	}
}

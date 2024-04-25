package Automation.RahulShettyUdemy;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E_CART_Site {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		String[] veggies = { "Cucumber", "Brocolli","Beetroot" };
		
		int j=0;
		//This code will get you all the products names for the page
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for (int i = 0; i < products.size(); i++) 
		{
			String[] names = products.get(i).getText().split("-");
			
			String formattedNames=names[0].trim();//This will remove the space on the text
			List<String> itemsneededlist = Arrays.asList(veggies);
			
			if (itemsneededlist.contains(formattedNames)) {
				j++;
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				if(j==3)
				{
					break;
				}
			}
		}

	}

}

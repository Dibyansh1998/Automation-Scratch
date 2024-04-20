package Automation.RahulShettyUdemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Updated_DropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");

		// Click on Passengers Drop Down
		driver.findElement(By.cssSelector("div[data-testid='home-page-travellers']")).click();
		// Click on Adult Plus (+) Button
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@data-testid='Adult-testID-plus-one-cta'])[1]")).click();

		/*
		 * int i=0; while(i<5) {
		 * driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']"
		 * )).click();//it will click the (+)icon 4 times i++; }
		 */
		for (int i = 0; i < 3; i++) {
			driver.findElement(By.xpath("(//div[@data-testid='Adult-testID-plus-one-cta'])[1]")).click();// it will
																											// click the
			// (+)icon 4 times
		}
		Thread.sleep(2000);
		// Click on the Done button on passengers Drop Down
		driver.findElement(By.xpath(
				"(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73'])[1]"))
				.click();

		// Select the Ahemdabad to Kanpur from the Drop Down

		driver.findElement(By.cssSelector(
				".css-1dbjc4n.r-14lw9ot.r-11u4nky.r-z2wwpe.r-1phboty.r-rs99b7.r-1loqt21.r-13awgt0.r-ymttw5.r-tju18j.r-5njf8e.r-1otgn73"))
				.click();
		driver.findElement(By.xpath(
				"(//div[@class='css-1dbjc4n r-18u37iz']/div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79'])[3]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"(//div[@class='css-1dbjc4n r-18u37iz']/div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79'])[37]"))
				.click();
		Thread.sleep(4000);
		driver.close();

	}

}

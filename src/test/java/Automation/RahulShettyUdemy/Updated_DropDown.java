package Automation.RahulShettyUdemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Updated_DropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		//Select the Kanpur to Delhi from the Drop Down
		
				driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-tju18j r-5njf8e r-1otgn73'])[1]")).sendKeys("KANP");


				Thread.sleep(2000);
//				driver.findElement(By.cssSelector("[data-testid='to-testID-destination']")).click();
				driver.findElement(By.xpath("//input[@value='Delhi (DEL)']")).click();
		// First Click on the Passengers Drop Down
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();

		// Click on Adult Plus (+) Button
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();

		/*
		 * int i=0; while(i<5) {
		 * driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']"
		 * )).click();//it will click the (+)icon 4 times i++; }
		 */
		for (int i = 0; i < 3; i++) {
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();// it will click the (+)icon 4 times
		}
		System.out.println(driver
				.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")).getText());
		Thread.sleep(2000);
		// Click on the Done button on passengers Drop Down
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();
		
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-18u37iz'])[35]")).click();
		Thread.sleep(2000);
		
		driver.close();

	}

}

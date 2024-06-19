package Automation.RahulShettyUdemy;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	Set<Cookie>	cookies=driver.manage().getCookies();//capture all the cookies from the browser
	System.out.println("Size of cookies: " +cookies.size()); //print the size of the cookies
	
	/*for(Cookie cookie:cookies)//Print the all the cookies
	{
		System.out.println(cookie.getName()+":"+cookie.getValue()); 
	}*/
	
	System.out.println(driver.manage().getCookieNamed("session-id-time"));//Get the cookies by name
	
	//Add cookies into the browser
	Cookie cobj= new Cookie("MyCookies","123456");
	driver.manage().addCookie(cobj);
	
	cookies=driver.manage().getCookies();
	
	System.out.println("Size of cookies: " +cookies.size()); //print the size of the cookies
	
	for(Cookie cookie:cookies)//Print the all the cookies
	{
		System.out.println(cookie.getName()+":"+cookie.getValue()); 
	}

	driver.close();
	}

}

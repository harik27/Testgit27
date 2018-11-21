package org.greens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {
	
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\work\\SeleniumProject\\driver\\chromedriver.exe");
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\eclipse-workspace\\work\\SeleniumProject\\driver\\geckodriver.exe");
		
		//WebDriver driver=new ChromeDriver();
		
		WebDriver driver=new FirefoxDriver();

		
		driver.get("https://www.facebook.com/");
		
		//getting title
		
	      String title=driver.getTitle();
	      
		System.out.println(title);
		
		//getting current url
		
		String currenturl=driver.getCurrentUrl();
		
		System.out.println(currenturl);
		
		//refresh
		
		driver.navigate().refresh();
		
		//navigate to
		
		driver.navigate().to("https://www.google.com/");
		
		//navigate back
		
		driver.navigate().back();
		
		//close the browser
		
	      driver.quit();
	      
	}

}

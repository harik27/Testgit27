package org.greens;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AC1 {
	
	public static void main(String[] args) throws AWTException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\work\\SeleniumProject\\driver\\chromedriver.exe");
		
		         WebDriver driver=new ChromeDriver();
				
				driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		     WebElement bank=  driver.findElement(By.xpath("//a[text()=' BANK ']"));
		     
		WebElement fiveK= driver.findElement(By.xpath("//a[text()=' 5000']"));
	
		
	WebElement sales=driver.findElement(By.xpath("//a[text()=' SALES ']"));
	
	
	WebElement p1=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	
	WebElement p2=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
	
	
WebElement p3=driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
	
	WebElement p4=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
	
	Actions ac=new Actions(driver);
	
	
ac.dragAndDrop(bank, p1).perform();


ac.dragAndDrop(fiveK, p2).perform();


ac.dragAndDrop(sales, p3).perform();


ac.dragAndDrop(fiveK, p4).perform();




	
	
	

	
	
	
	
	
	
	
	
	
	
	
		
		
	}

}

package org.greens;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\work\\SeleniumProject\\driver\\chromedriver.exe");
		
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement monD=driver.findElement(By.id("month"));
		
		Select al=new Select(monD);
		
		//al.selectByIndex(2);
		
		//al.selectByValue("10");
		
		List <WebElement>emp = al.getOptions();
		
		/*int s =emp.size();
		
		System.out.println(s);
		
		for(int i=0;i<=emp.size();i++)
		{
		WebElement w=emp.get(i);
		
		String s1= w.getText();
		
		System.out.println(s1);*/
		
		
		for(WebElement v1:emp)
		{
			
			//String s1=v1.getText();
			
			String s1=v1.getAttribute("value");
			
			System.out.println(s1);
			
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
		
		
		

	}

}

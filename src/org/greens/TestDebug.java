package org.greens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDebug {

	/*public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\work\\SeleniumProject\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//Entering Url
		
		driver.get("http://www.greenstechnologys.com/");
		
	WebElement gTxt=	driver.findElement(By.xpath("//h2[contains(text(),'Greens')]"));
	
	String txt=gTxt.getText();
	
	System.out.println(txt);
	}*/
	//printing half paragraph
	
	
	/*public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\work\\SeleniumProject\\driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	//Entering Url
	
	driver.get("http://www.greenstechnologys.com/");
	
WebElement gTxt=	driver.findElement(By.xpath("//font[contains(text(),'We at Greens')]"));

String txt=gTxt.getText();

System.out.println(txt);



}*/
	
	/*public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\work\\SeleniumProject\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//Entering Url
		
		driver.get("http://www.greenstechnologys.com/");
		
	WebElement gTxt=	driver.findElement(By.xpath("//font[contains(text(),'We at Greens')]"));

	String txt=gTxt.getText();

	System.out.println(txt);



	}	*/
	
	
/*public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\work\\SeleniumProject\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//Entering Url
		
		driver.get("http://www.greenstechnologys.com/oracle-training.html");
		
	WebElement gTxt=	driver.findElement(By.xpath("//p[contains(text(),'Awarded')]"));

	String txt=gTxt.getText();

	System.out.println(txt);
	
	WebElement sTxt=	driver.findElement(By.xpath("//p[contains(text(),'Rated as')]"));

	String tTxt=sTxt.getText();

	System.out.println(tTxt);
	
	
	
	
}*/
	
/*public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\work\\SeleniumProject\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//Entering Url
		
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		
		Thread.sleep(4000);
		
	WebElement gTxt=driver.findElement(By.xpath("(//span[@class='testimonial-content'])[1]"));

	String txt=gTxt.getText();

	System.out.println(txt);
	
	
	
	
	
}*/
	
	//Print Sekhar C (Infosys, Chennai) statement.
/*public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\work\\SeleniumProject\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//Entering Url
		
		driver.get("http://www.greenstechnologys.com/testimonial.html");
		
		Thread.sleep(4000);
		
	WebElement gTxt=driver.findElement(By.xpath("//strong[contains(text(),'Infosys')]"));

	String txt=gTxt.getText();

	System.out.println(txt);
	
	
	
	
	
}*/
	
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\work\\SeleniumProject\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//Entering Url
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(4000);
		
	WebElement gTxt=driver.findElement(By.xpath("//input[@id='email']"));
	
	Thread.sleep(5000);

	String txt=gTxt.getAttribute("value");

	System.out.println(txt);
	
WebElement pTxt=driver.findElement(By.xpath("//input[@id='pass']"));
	
	Thread.sleep(5000);

	String atxt=pTxt.getAttribute("value");

	System.out.println(atxt);
	
}
	
}
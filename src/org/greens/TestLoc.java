package org.greens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoc {

	//HDFC code is not working
	/*public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\work\\SeleniumProject\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//Entering Url
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		
		//finding locator for username  field
		
		WebElement userTxtName = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		
		//insert username
		
		userTxtName.sendKeys("hari");
		
		//finding the locator for contuine button
		
		WebElement contBtn=driver.findElement(By.xpath("//img[@style='margin-right:18px;']"));
		
		//Clicking contuine button
		
		contBtn.click();
		
		//finding the locator for password field
		
		WebElement passTxt=driver.findElement(By.xpath("//input[@name='fldPassword']"));
		
		//insertion password
		passTxt.sendKeys("vasu");
		
		//finding the locator for login button
		
		
		WebElement loginBtn=driver.findElement(By.xpath("//img[@alt='Login']"));
		
		//clicking button
		
		loginBtn.click();
		
		
		
		
	}*/
	
	//lakshmini vilas bank
	
	/*public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\work\\SeleniumProject\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//Entering Url
		
		driver.get("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
		
		//finding locator for username  field
		
		WebElement userTxtName = driver.findElement(By.xpath("//input[@id='fldLoginUserId']"));
		
		//insert username
		
		userTxtName.sendKeys("hari");
		
		//finding locator for password   field
		
		WebElement userTextpass=driver.findElement(By.xpath("//input[@id='fldPassword']"));
		
		//insert password
		
		
	
	userTextpass.sendKeys("27635448");
	
	//finding locator for submit button
	
	WebElement subBtn=driver.findElement(By.xpath("//input[@name='imageField']"));
	
	//clicking
	
	subBtn.click();
		
		
		
	}
	*/
	
	//ICICI BANK
	
	/*public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\work\\SeleniumProject\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//Entering Url
		
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		//finding locator for username  field
		
		WebElement userTxtName = driver.findElement(By.xpath("//input[@name='AuthenticationFG.USER_PRINCIPAL']"));
		
		//insert username
		
		userTxtName.sendKeys("hari");
		
		//finding locator for password   field
		
		WebElement userTextpass=driver.findElement(By.xpath("//input[@id='AuthenticationFG.ACCESS_CODE']"));
		
		//insert password
		
		
	
	userTextpass.sendKeys("27635448");
	
	
	}*/
	
	//Gmail-in password  fields values are not entering
	
	
	/*public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\work\\SeleniumProject\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//Entering Url
		
		driver.get("https://www.gmail.com/");
		//finding locator for username  field
		
		WebElement userTxtName = driver.findElement(By.xpath("//input[@name='identifier']"));
		
		//insert username
		
		userTxtName.sendKeys("harikpapanaidu@gmail.com");
		
		//finding the locator for next button
		
		WebElement nxtBtn1=driver.findElement(By.xpath("(//span[@class='RveJvd snByac'])[1]"));
		
		//clicking next button
		nxtBtn1.click();
		
		
		
		
		
		
		//finding locator for password   field
		
		WebElement userTextpass=driver.findElement(By.xpath("//input[@name='password']"));
		
		//insert password
		
		
	
	userTextpass.sendKeys("27635448");
	
	
	//finding the locator for next button
	
	WebElement next2=driver.findElement(By.xpath("(//span[@class='RveJvd snByac'])[1]"));
	
	//clicking
	
	next2.click();
	
	
	
	}*/
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\work\\SeleniumProject\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//Entering Url
		
		driver.get("http://www.greenstechnologys.com/");
		
		//finding locator for contactus link
		
		WebElement contLink = driver.findElement(By.xpath("//a[@href='contact.php']"));
		
		//clicking contactus link
		
	     contLink.click();
		
	WebElement nameTxt=driver.findElement(By.xpath("//input[@id='InputName']"));
	
	nameTxt.sendKeys("hari");
	
	
	WebElement emailTxt=driver.findElement(By.xpath("//input[@id='InputEmail1']"));
	
	emailTxt.sendKeys("harikpapanaidu@gmail.com");
	
	
	WebElement mobileTxt=driver.findElement(By.xpath("//input[@id='InputSubject']"));
	
	mobileTxt.sendKeys("7034941575");
	
	
	WebElement courseTxt=driver.findElement(By.xpath("(//select[@name='courses'])[1]"));
	
	courseTxt.sendKeys("Python");
	
	
	WebElement branchTxt=driver.findElement(By.xpath("(//select[@name='branch'])[1]"));
	
	branchTxt.sendKeys("OMR");
	
	WebElement timeTxt=driver.findElement(By.xpath("(//select[@name='time'])[1]"));
	
	timeTxt.sendKeys("Immediately");
	
	
	WebElement commentsTxt=driver.findElement(By.xpath("(//textarea[@name='comments'])[1]"));
	
	commentsTxt.sendKeys("i want to join course");
	
	
	WebElement subBtn=driver.findElement(By.xpath("//button[@id='submit']"));
	
	
	subBtn.click();
	
	WebElement sBtn=driver.findElement(By.xpath("//button[@id='submit']"));
	
	sBtn.click();
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
		
}

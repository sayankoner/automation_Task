package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebshop {
	public static void main(String[] args) throws InterruptedException {
		
		//to signup in the page change the mail before executing 
		
	System.setProperty("webdriver.chrome.driver","softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//a[@class='ico-register']")).click();
	driver.findElement(By.xpath("//input[@id='gender-male']")).click();
	driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("jqjq");
	driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Spiders");
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("abc128335523@gmail.com");
	driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("12345678");
	driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("12345678");
	driver.findElement(By.xpath("//input[@value='Register']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@href='/logout']")).click();
	Thread.sleep(6000);
	
	//to login in the page
	driver.findElement(By.xpath("//a[@href='/login']")).click();
	driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("abc128335523@gmail.com");
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("12345678");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	Thread.sleep(6000);
	driver.close();
}
}
package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qadata {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	//Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[id='firstName']")).sendKeys("hello");
	driver.findElement(By.cssSelector("input[id='lastName']")).sendKeys("hello");
	driver.findElement(By.cssSelector("input[id='userEmail']")).sendKeys("hello");
	
	driver.findElement(By.cssSelector("label[class='custom-control-label']")).click();
	driver.findElement(By.cssSelector("input[placeholder='Mobile Number']")).sendKeys("98767594");
	//hobbies
	driver.findElement(By.cssSelector("label[class='custom-control-label']")).click();
	//subject
	//driver.findElement(By.cssSelector("div[class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")).sendKeys("hellooo");
	//for="hobbies-checkbox-3"
	driver.findElement(By.cssSelector("label[for='hobbies-checkbox-3']")).click();

	Thread.sleep(2000);
	driver.quit();
}
}

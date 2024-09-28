package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProblemBharat {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		//driver.findElement(By.xpath("//a[.='Log In']")).click();
		driver.findElement(By.xpath("//span[.='Phone number, username, or email']/following-sibling::input[1]")).sendKeys("helprime");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Password']/following-sibling::input[1]")).sendKeys("100%Goingtowork");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='Log in']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[.='Not now']/div")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[.='Not Now']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[name()='svg' and @aria-label='Search']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("niranjan_ka_18");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[.='Niranjan']/span")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[.='Follow']/div[1]/div[1]")).click();
		Thread.sleep(12000);
		driver.quit();
	}
	//div[.='Follow']/div[1]/div[1]
	//*[name()='svg' and @aria-label='Search']
	//div[.='Not now' and @tabindex='0']
}

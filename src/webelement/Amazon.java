package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("s20 fe 5g",Keys.ENTER);
		String text=driver.findElement(By.xpath("//span[.='(60% off)']/preceding-sibling::a/span/span[1]")).getText();
		System.out.println(text);
		
	}
}
//span[.='(64% off)']/preceding-sibling::a/span/span[1]
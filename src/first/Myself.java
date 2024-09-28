package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myself {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("file:///C:/Users/admin/OneDrive/Desktop/project.html");
	driver.findElement(By.id("a1")).click();
	driver.quit();
	
}
}

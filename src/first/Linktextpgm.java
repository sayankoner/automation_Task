package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktextpgm {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/admin/OneDrive/Desktop/project.html");
		Thread.sleep(2000);
		driver.findElement(By.linkText("facebook")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}

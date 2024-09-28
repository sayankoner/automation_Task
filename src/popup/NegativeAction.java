package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NegativeAction {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		driver.findElement(By.name("cusid")).sendKeys("2345");
		driver.findElement(By.name("submit")).click();
		Alert al=driver.switchTo().alert();
		Thread.sleep(2000);
		al.dismiss();
		Thread.sleep(2000);
		//al.accept(); // org.openqa.selenium.NoAlertPresentException
		Thread.sleep(2000);
		driver.quit();
	}
}

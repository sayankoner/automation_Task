package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//a[.='Nested iframe']")).click();
		//driver.switchTo().frame(0);
		Thread.sleep(8000);
		//driver.findElement(By.xpath("//section[@class='main_form_container']"));
		driver.switchTo().frame(0);
		WebElement username = driver.findElement(By.xpath("//p[.='Admin@gmail.com']"));
		String user = username.getText();
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(user);

	}

}

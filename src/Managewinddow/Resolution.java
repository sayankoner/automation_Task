package Managewinddow;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resolution {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.navigate().to("file:///C:/Users/admin/OneDrive/Desktop/sayan/Selenium/xpath.html");
		Thread.sleep(2000);
		driver.navigate().to("file:///C:/Users/admin/OneDrive/Desktop/sayan/Selenium/project.html");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Dimension d= new Dimension(768,666);
		driver.manage().window().maximize()	;
		Thread.sleep(2000);
		driver.manage().window().setSize(d);
		Point p= new Point(200,100);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		driver.manage().window().maximize()	;
		
		Thread.sleep(5000);
		driver.quit();

		
	}
}

package Managewinddow;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllResolution {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.navigate().to("file:///C:/Users/admin/OneDrive/Desktop/abhi/Selenium/xpath.html");
		Thread.sleep(2000);
		driver.navigate().to("file:///C:/Users/admin/OneDrive/Desktop/abhi/Selenium/project.html");
		Thread.sleep(2000);
		Dimension d1=new Dimension(800,600) ;
		Thread.sleep(2000);
		Dimension d2=new Dimension(1024,768) ;
		Thread.sleep(2000);
		Dimension d3=new Dimension(1152,864) ;
		Thread.sleep(2000);
		Dimension d4=new Dimension(1280,600) ;
		Thread.sleep(2000);
		Dimension d5=new Dimension(1280,720) ;
		Thread.sleep(2000);
		Dimension d6=new Dimension(1280,768) ;
		Thread.sleep(2000);
		Dimension d7=new Dimension(1280,800) ;
		Thread.sleep(2000);
		Dimension d8=new Dimension(1280,960) ;
		Thread.sleep(2000);
		Dimension d9=new Dimension(1280,1024) ;
		Thread.sleep(2000);
		Dimension d10=new Dimension(1360,768) ;
		Thread.sleep(2000);
		Dimension d11=new Dimension(1366,768) ;
		Thread.sleep(2000);
		Dimension d12=new Dimension(1400,1050) ;
		Thread.sleep(2000);
		Dimension d13=new Dimension(1440,900) ;
		Thread.sleep(2000);
		
		Thread.sleep(5000);
		driver.quit();
		
	}
}
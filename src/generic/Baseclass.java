package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {
	public static WebDriver driver;
	public static void chromebase() {
		System.setProperty("webdriver.chrome.driver","softwares/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void firebase() {
		System.setProperty("webdriver.gecko.driver","softwares/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}
}

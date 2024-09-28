package first;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {
public static void main(String[] args) throws InterruptedException {
//	String key="webdriver.chrome.driver";
//	String value="./softwares/chromedriver.exe";
//	System.setProperty(key, value);
//	ChromeDriver driver= new ChromeDriver();
//	Thread.sleep(2000);
//	driver.quit();
//	Thread.sleep(2000);
//	String key1="webdriver.gecko.driver";
//	String value1="./softwares/geckodriver.exe";
//	System.setProperty(key1, value1);
//	FirefoxDriver driver1= new FirefoxDriver();
//	Thread.sleep(2000);
//	driver1.quit();
//	Thread.sleep(2000);
	String key2="webdriver.edge.driver";
	String value2="./softwares/msedgedriver.exe";
	System.setProperty(key2, value2);
	EdgeDriver driver2= new EdgeDriver();
	Thread.sleep(4000);
	driver2.quit();
}
}

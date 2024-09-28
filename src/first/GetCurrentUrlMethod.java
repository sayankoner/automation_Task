package first;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {
	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver= new ChromeDriver();
		//Thread.sleep(2000);
		driver.get("https:www.instagram.com");
		String x=driver.getCurrentUrl();
		System.out.println(x);
		driver.quit();
}}


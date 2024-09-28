package first;

import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver= new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https:www.facebook.com");
		//driver.get("https:www.instagram.com");
		//driver.get("https:www.google.com");
		driver.get("chrome://downloads/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		System.out.println(driver.getPageSource());
		//driver.quit();
		
	
}
}
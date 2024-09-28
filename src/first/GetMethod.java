package first;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {
	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver= new ChromeDriver();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/admin/OneDrive/Desktop/project.html");
		Thread.sleep(4000);
		driver.quit();
}}

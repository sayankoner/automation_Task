package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkAttText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(WebElement ele:links) {
			System.out.println(ele.getAttribute("href"));
			System.out.println(ele.getText());
		
		}
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println(images.size());
	}
}

package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exam {
	public static void main(String[] args) throws InterruptedException {

		// to signup in the page change the mail before executing

		System.setProperty("webdriver.chrome.driver", "softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		List<WebElement> listof=driver.findElements(By.xpath("//img"));
		for (int i = 0; i <listof.size(); i++) {
			WebElement ele=listof.get(i);
			System.out.println(ele.getAttribute("src"));
			
		}
	}
}
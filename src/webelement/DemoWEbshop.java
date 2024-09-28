package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWEbshop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement ele = driver.findElement(By.xpath("//ul[@class='top-menu']/li[4]/a"));
		System.out.println(ele.isDisplayed());
		boolean en = ele.isEnabled();
		if (en) {
			System.out.println("element is enabled");
		}
		WebElement ele2 = driver.findElement(By.xpath("//label[.='Excellent']/preceding-sibling::input[1]"));
		ele2.click();
		boolean sle = ele2.isSelected();
		if (sle) {
			System.out.println("the item is selected");
		}
		Point loc = ele.getLocation();
		System.out.println(loc);
		System.out.println(loc.getX());
		System.out.println(loc.getY());

	}
}

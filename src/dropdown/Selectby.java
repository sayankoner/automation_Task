package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectby {
	private static WebElement findElement;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/admin/OneDrive/Desktop/abhi/Selenium/multidropdown.html");
		WebElement ele2 = driver.findElement(By.id("menu"));

		Select s = new Select(ele2);
		if (s.isMultiple()) {
			s.selectByIndex(1);
			Thread.sleep(2000);
			s.selectByValue("3");
			Thread.sleep(2000);
			s.selectByValue("7");
			Thread.sleep(2000);
			s.selectByValue("9");
			Thread.sleep(2000);
			List<WebElement> listof = s.getAllSelectedOptions();
			for (WebElement e : listof) {
				System.out.println(e.getText());

			}
			s.deselectAll();
			List<WebElement> listof2 = s.getAllSelectedOptions();
			for (WebElement e1 : listof2) {
				System.out.println(e1.getText());

			}
		}else {
			System.out.println("this dropdown is not multiople");
			
		
		}
	}
}

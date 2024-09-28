package dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortData {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		Thread.sleep(2000);
		WebElement ele1=driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Thread.sleep(2000);
		Select s= new Select(ele1);
		List<WebElement> all_opt=s.getOptions();
		ArrayList<String> l= new ArrayList<>();
		for(WebElement ss: all_opt) {
			l.add(ss.getText());
		}
		Collections.sort(l,Collections.reverseOrder());
		for(String st:l) {
			System.out.println(st);
		}
		Thread.sleep(2000);
		driver.quit();
	}
	
}

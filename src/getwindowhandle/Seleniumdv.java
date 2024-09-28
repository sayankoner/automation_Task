package getwindowhandle;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Seleniumdv {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		List<WebElement> ele = driver.findElements(By.xpath("//div[@id='main_navbar']/ul/li/a/span"));
		Actions act = new Actions(driver);
		Robot r = new Robot();
		for (WebElement ele1 : ele) {
			act.contextClick(ele1).build().perform();
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
			Thread.sleep(2000);
		}
		Set<String> all_id = driver.getWindowHandles();
		ArrayList<String> idlist = new ArrayList(all_id);
		System.out.println(idlist);
		ArrayList<String> alltitle = new ArrayList();

		String id_doc = "";
		for (String id : all_id) {
			driver.switchTo().window(id);
			// System.out.println(driver.getCurrentUrl());
//			if (driver.getCurrentUrl().equals("https://www.selenium.dev/documentation/")) {
//				id_doc = id;
//			}
			alltitle.add(driver.getTitle());
			// System.out.println(id_doc+"id id doc");	
		}
		driver.switchTo().window(idlist.get(idlist.size() - 1));
		System.out.println(driver.getTitle());
		
		
		//this is the documenatation index==3
		driver.switchTo().window(idlist.get(3));
		
		System.out.println(driver.getTitle());

		System.out.println(alltitle);
		driver.close();
		Thread.sleep(2000);
		 driver.quit();
	}

}


package mouseaction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightclickNewtab {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		List<WebElement> ele= driver.findElements(By.xpath("//div[@id='main_navbar']/ul/li/a/span"));
		Actions act = new Actions(driver);
		Robot r= new Robot(); 
		for(WebElement ele1: ele) {
			if(ele1.getText()!="About" &&  ele1.getText()!="Projects" ) {
			act.contextClick(ele1).build().perform();			
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
			Thread.sleep(2000);
			}
			
		}
		Thread.sleep(2000);
		driver.quit();
	}
}

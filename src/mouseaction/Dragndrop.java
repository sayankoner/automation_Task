package mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragndrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		WebElement ele1=driver.findElement(By.xpath("//a[.=' 5000 ']"));
		WebElement ele2=driver.findElement(By.xpath("//h3[contains(text(),'DEBIT SIDE')]/following-sibling::table/tbody/tr/td[2]/div/div/ol/li"));
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.dragAndDrop(ele1,ele2).build().perform();
		Thread.sleep(4000);
		driver.quit();
	}
}

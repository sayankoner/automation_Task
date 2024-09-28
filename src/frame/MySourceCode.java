package frame;
import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import generic.Baseclass;
public class MySourceCode extends  Baseclass {
	public static void main(String[] args) throws AWTException {
		chromebase();
		driver.get("file:///C:/Users/admin/OneDrive/Desktop/abhi/Selenium/iframepages/mainpage.html");
		driver.findElement(By.tagName("input")).sendKeys("user");
		driver.switchTo().frame(0);
		driver.findElement(By.tagName("input")).sendKeys("mypass");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input")).sendKeys("abc@gmail.com");
		WebElement ele=driver.findElement(By.id("a3"));
		System.out.println(ele.getText());
		ele.click();
//		Actions a= new Actions(driver);
//		a.contextClick(ele);
//		Robot r= new Robot();
//		r.keyPress(KeyEvent.VK_T);
//		r.keyRelease(KeyEvent.VK_T);
	}
	
}

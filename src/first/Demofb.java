package first;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import generic.Baseclass;
public class Demofb extends Baseclass {
	public static void main(String[] args) {
		chromebase();
		driver.get("https://www.facebook.com/");
		WebElement ele=driver.findElement(By.xpath("//input[@type='password']"));
		ele.sendKeys("hello");
		ele.findElement(By.xpath("//input[@type='text']")).sendKeys("ye same h");
	}
}

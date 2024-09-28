package frame;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import generic.Baseclass;
public class Qspidersdefault extends Baseclass {
	 public static void main(String[] args) throws InterruptedException {
		chromebase();
		
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS );
		driver.findElement(By.xpath("//a[.='Nested iframe']")).click();
		Thread.sleep(6000);
		driver.switchTo().frame(0);
		String un=driver.findElement(By.xpath("//p[.='Admin@gmail.com']")).getText();
		String pwd=driver.findElement(By.xpath("//p[.='Admin@1234']")).getText();
		String cnpwd=driver.findElement(By.xpath("(//p[.='Admin@1234'])[2]")).getText();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(un,Keys.TAB,pwd,Keys.TAB,cnpwd,Keys.ENTER);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'Multiple')]")).click();
//		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		Thread.sleep(6000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Admin@gmail.com",Keys.TAB,"Admin@1234",Keys.TAB,"Admin@1234",Keys.ENTER);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.tagName("input")).sendKeys("SuperAdmin@gmail.com",Keys.TAB,"SuperAdmin@1234",Keys.ENTER);
	
		driver.get("https://demoapps.qspiders.com/ui/frames/nestedWithMultiple?sublist=3");
		Thread.sleep(6000);
		driver.switchTo().frame(0);
		String email=driver.findElement(By.xpath("//p[.='Admin@gmail.com']")).getText();
		String pwd1="Admin@1234";
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		driver.findElement(By.tagName("input")).sendKeys(email);
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		driver.findElement(By.tagName("input")).sendKeys(pwd1);
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame(2);
		driver.findElement(By.tagName("input")).sendKeys(pwd1);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(3);
		driver.findElement(By.tagName("button")).click();



	 }
}
//driver.findElement(By.id("username"))
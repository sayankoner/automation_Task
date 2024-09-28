package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra1 {
	public static void main(String[] args) throws InterruptedException {	
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	driver.findElement(By.xpath("//input")).sendKeys("Hrx shoes",Keys.ENTER);
	Thread.sleep(5000);
	String x=driver.findElement(By.xpath("//h4[.='Women Lace-Up Running Shoes']/following-sibling::div[1]/span[1]/span[1]")).getText();
	System.out.println(x);
	//String x= "rs. 987";
	char[] arr=x.toCharArray();
	String price="";
	for (int i = 0; i < arr.length; i++) {
		if((arr[i]>'1' && arr[i]<='9' )) {
			 price=price+arr[i];
		}
	}
	System.out.println(price);
	Thread.sleep(5000);
	driver.quit();
}
}
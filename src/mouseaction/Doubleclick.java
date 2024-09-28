package mouseaction;
import generic.MouseAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick extends MouseAction{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
		Thread.sleep(2000);
		//Actions act=new Actions(driver);
		gmrf(driver).doubleClick(ele).build().perform();
		Thread.sleep(4000);
	
		driver.quit();
	}
}

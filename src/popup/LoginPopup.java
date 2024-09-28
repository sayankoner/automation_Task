package popup;
import generic.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPopup {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://"+"admin"+":"+"admin"+"@"+"the-internet.herokuapp.com/basic_auth");
	}
}

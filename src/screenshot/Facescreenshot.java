package screenshot;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import generic.Baseclass;
public class Facescreenshot extends Baseclass {
	public static void main(String[] args) throws IOException {
		chromebase();
		driver.get("https://www.facebook.id/");
		TakesScreenshot sc=(TakesScreenshot)driver;
		File src=sc.getScreenshotAs(OutputType.FILE);
		File target= new File("C:\\Users\\admin\\OneDrive\\Desktop\\abhi\\Selenium\\screenshot\\def.jpg");
		FileHandler.copy(src, target);
		
	}
	
}

package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction 
{
	
	public static Actions  gmrf(WebDriver driver) {
		Actions s= new Actions(driver);
		return s;
	}
//	public static void  doublecl(WebDriver driver) {
//		Actions s= new Actions(driver);
//		s.doubleClick();
//	}
//	public static void  myright(WebDriver driver) {
//		Actions s= new Actions(driver);
//		 s.contextClick();
//	}
//}
}

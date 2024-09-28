package generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static Select gdrf(WebElement ele) {
		Select s= new Select(ele);
		return s;
	}
}

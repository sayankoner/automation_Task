package ddt;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import generic.Baseclass;
import generic.WriteGenDDT;
public class Hindibooks extends Baseclass {
	public static void main(String[] args) throws InterruptedException {
		chromebase();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hindi books"+Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> ele_name=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		int i=0;
		for(WebElement ele:ele_name) {
			String name=ele.getText();		
			WriteGenDDT.writeddt("books",i,1,name);
			i++;
			
			}
		
		List<WebElement> ele_star=driver.findElements(By.xpath("//span[contains(text(),\"stars\")]"));
		int j=0;
		for(WebElement ele:ele_star) {
			String star=ele.getText();		
			WriteGenDDT.writeddt("books",j,2,star);
			j++;
		}	
		List<WebElement> eleprice=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		int k=0;
		for(WebElement ele3:eleprice) {
			String name=ele3.getText();		
			WriteGenDDT.writeddt("books",k,3,name);
			k++;
		}
	}
}

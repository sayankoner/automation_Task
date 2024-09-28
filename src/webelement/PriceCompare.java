package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PriceCompare {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung s24 ultra 5g",Keys.ENTER);
		Thread.sleep(2000);
		WebElement ele1= driver.findElement(By.xpath("//span[.='Samsung Galaxy S24 Ultra 5G AI Smartphone (Titanium Black, 12GB, 256GB Storage)']/../../../following-sibling::div[2]/div/div[1]/div[1]/div[1]/div[1]/a/span/span[1]"));
		String te=ele1.getText();
		System.out.println(te);
		Thread.sleep(2000);
		System.out.println(ele1.getAttribute("class"));
		//String te=ele1.getText();
		Thread.sleep(2000);
		System.out.println("amazon price is "+te);
		WebElement ele4=driver.findElement(By.xpath("(//span[.='Samsung Galaxy S24 Ultra 5G AI Smartphone (Titanium Black, 12GB, 512GB Storage)'])[1]/../../../following-sibling::div[1]/div[1]/span"));
		String atr=ele4.getAttribute("aria-label");
		char[] atrr=atr.toCharArray();
		String stnew="";
		for (int i = 0; i < atrr.length; i++) {
			System.out.print(atrr[i]);
			
			if(!(atrr[i]>='0' && atrr[i]<='9' )) {
				atrr[i]=' ';
			}
				//System.out.print("new string"+arr[i]);
				stnew=stnew+atrr[i];	
		}
		System.out.println(stnew+"is snew");
		
		stnew=stnew.replace(" ","");
		System.out.println(stnew);
		int stnewdouble=Integer.parseInt(stnew);
		double stn=((double)(stnewdouble/10))/10;
		System.out.println("stnew is "+stn );
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("samsung s24 ultra 5g",Keys.ENTER);
		WebElement ele2=driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy S24 Ultra 5G (Titanium Black, 256 GB)']/../following-sibling::div/div[1]/div[1]/div[1]"));
		String s1=ele2.getText();
		System.out.println("flipkart pricee is "+s1);
		//driver.quit();
		String s="₹1,29,999";
		String snew="";
		char [] arr= s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			
			if(!(arr[i]>='0' && arr[i]<='9' )) {
				arr[i]=' ';
			}
				//System.out.print("new string"+arr[i]);
				snew=snew+arr[i];	
		}
		System.out.println(snew+"is snew");
		snew=snew.replace(" ","");
		int sint=Integer.parseInt(snew);
		System.out.print(sint);
		WebElement ele3=driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy S24 Ultra 5G (Titanium Violet, 256 GB)']/../div[2]/span[1]/div"));
		String star=ele3.getText();
		System.out.println();
		System.out.println(star);
		
	}
}

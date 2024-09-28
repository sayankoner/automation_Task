package orangeHRM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Recruitment extends GenOrange{
	@Test
	public void vacancy() throws InterruptedException {
		Pom_eleRepo repo= new Pom_eleRepo(driver);
		repo.user();
		repo.recrutment();
		WebElement eleaddrcrt = repo.addrcrt();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(5000);
		
		js.executeScript("arguments[0].scrollIntoView()", eleaddrcrt);
		js.executeScript("window.scrollBy(0,-500)");
		eleaddrcrt.click();
		System.out.println("hello");
		repo.candidateSave();
		Thread.sleep(10000);
		repo.recrutment();
		repo.vacancy_delete();
		repo.fiDlt();
		if(repo.cnfdltvanc()) {
			Reporter.log("item is deleted after add",true);
		}
		Thread.sleep(4000);
		
	}
}

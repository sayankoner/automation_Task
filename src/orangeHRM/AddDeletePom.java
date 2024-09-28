package orangeHRM;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AddDeletePom extends GenOrange {
	@Test
	public void addemp() throws InterruptedException {
		Pom_eleRepo repo= new Pom_eleRepo(driver);
		repo.user();
		repo.pim();
		repo.addemp();
		repo.fstnm();
		repo.lstnm();		
		repo.id();
		repo.save_button();
		Thread.sleep(5000);
		repo.elist_button();
//		repo.fnsrc();
//		repo.delete();
//		repo.yesDelete();
//		if(repo.confirmation()) {
//			Reporter.log("employee is deleted",true);
//		}
		Thread.sleep(10000);
		
	}
}

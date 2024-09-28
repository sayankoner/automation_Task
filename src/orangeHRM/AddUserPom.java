package orangeHRM;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AddUserPom extends GenOrange {
	@Test
	public void adduser() throws InterruptedException {
		Pom_eleRepo repo= new Pom_eleRepo(driver);
		repo.user();
		repo.admin();
		repo.addUser();	
		repo.userRole();
		repo.empname();
		repo.status();
		repo.unpwd();
		repo.saveUser();
		Thread.sleep(5000);
//		if ( repo.cnfmUser()) {
//			Reporter.log("new used is added",true);
//		}
		repo.dltuser();
		if(repo.cnfDeleted()) {
			Reporter.log("the user is deleted ",true);
		}
	}
}

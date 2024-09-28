package orangeHRM;

import org.testng.annotations.Test;

public class TimesheetPom extends GenOrange{
	@Test
	public void time() {
		Pom_eleRepo rep=new Pom_eleRepo(driver);
		rep.user();
		
		
	}
}

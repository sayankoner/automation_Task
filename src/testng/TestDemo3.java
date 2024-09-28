package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestDemo3 {
	@Test
	public void test1() {
		Reporter.log("challo",true);
	}
	@Test
	public void test2() {
		Reporter.log("biii",true);
	}
}

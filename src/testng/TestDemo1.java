package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestDemo1 {
	@Test
	public void test1() {
		Reporter.log("hello",true);
	}
	@Test
	public void test2() {
		Reporter.log("hiii",true);
	}
}

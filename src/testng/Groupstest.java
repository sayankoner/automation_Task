package testng;

import org.testng.annotations.Test;

public class Groupstest {
	@Test(groups="first")
	public void test1() {
		System.out.println("first group output");
		//Assert.fail();
	}
	@Test(dependsOnGroups="first")
	public void test2() {
		System.out.println("2nd  group output");
	}
	@Test(dependsOnGroups="first")
	public void test3() {
		System.out.println("3rd  group output");
	}
	public void test4() {
		System.out.println("4th  group output");
	}

	
}

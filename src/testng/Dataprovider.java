package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	@DataProvider(name="proname")
	public Object[][] dtp(){
		 Object[][] obj= {{"hii",1},{"hello",2}};
		 return obj;
	}
	@Test(dataProvider="proname")
	public void test1(String s,int i) {
		System.out.println("string is "+s+" "+"integer is "+i);
	}
}

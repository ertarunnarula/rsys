package practice;

import org.testng.annotations.Test;

public class Testng1 {
	
	@Test
	public void test01_first() {
		System.out.println("This is the first test method");
	}
	
	@Test(groups= {"Nirvana"})
	public void test02_second() {
		System.out.println("This is the second test method");
	}


}

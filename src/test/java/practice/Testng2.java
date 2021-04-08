package practice;

import org.testng.annotations.Test;

public class Testng2 {
	
	@Test
	public void test03_third() {
		System.out.println("This is the third test method");
	}
	
	@Test(groups= {"Nirvana"})
	public void test_04fourth() {
		System.out.println("This is the fourth test method");
	}


}

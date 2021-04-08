package practice;

import org.testng.annotations.Test;

public class Testng3 {
	
	@Test
	public void test05_fifth() {
		System.out.println("This is the fifth test method");
	}
	
	@Test(groups= {"Nirvana"})
	public void test06_sixth() {
		System.out.println("This is the sixth test method");
	}


}

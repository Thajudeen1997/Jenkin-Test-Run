package demoRunTest;

import org.testng.annotations.Test;

public class DemoRunTest {
	@Test
	public void Test1() {
		String browserName = System.getProperty("browser");
		System.out.println(browserName);
		System.out.println("inside test1");
	}
	@Test
	public void Test2() {
		System.out.println("inside test2");
	}	
	@Test
	public void Test3() {
		System.out.println("inside test3");
	}	
	
}



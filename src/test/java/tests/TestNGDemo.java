package tests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners({listener.Itestlistener.class})
public class TestNGDemo {

	@Test(priority=-1,groups = "alpha")
	public void test1() {
		System.out.println("******Inside test1!!");
	}
	@Test(priority=1)
	public void test2() {
		System.out.println("******Inside test2!!");
	}
	@Test(priority=3)
	public void test3() {
		System.out.println("Inside test3!!");
    	throw new SkipException("*****skipped  skipped");
	}
	@Test
	public void test4() {
		System.out.println("*******Inside test4!!");
		Assert.assertTrue(false);
	}
	@Test
	public void tetoretest() {
		System.out.println("Inside test4!!");
	}
	
	
	
}

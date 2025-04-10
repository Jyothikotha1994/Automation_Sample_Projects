package tests;
import org.testng.annotations.Test;

public class ParallelTestClass {
    
    @Test
    public void testMethod1() {
        System.out.println("Test 1 | " + Thread.currentThread().getId());
    }

    @Test
    public void testMethod2() {
        System.out.println("Test 2 | " + Thread.currentThread().getId());
    }
}
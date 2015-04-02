package fibonacci;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFibonacci {

	@Test
	public void testNegativeValue() {
		try {
			Fibonacci.calculate(-1);
			fail("Negative value can't calculate");
		} catch (NegativeValueException e) {
			assertNotNull(e.getMessage());
		} catch (Exception e) {
			fail("Unexpected Exception");
		}
	}
	
	@Test
	public void testZeroValue(){
		try {
			int value = Fibonacci.calculate(0);
			assertEquals("Unexpected value, result have to be F()=0 .",0, value);
		} catch (Exception e) {
			fail("Unexpected Exception");
		}
	}
	
	@Test
	public void testOneValue(){
		try {
			int value = Fibonacci.calculate(1);
			assertEquals("Unexpected value, result have to be F()=1 .",1, value);
		} catch (Exception e) {
			fail("Unexpected Exception");
		}
	}
	
	@Test
	public void testTenValue(){
		try {
			int value = Fibonacci.calculate(10);
			assertEquals("Unexpected value, result have to be F()=5 .",55, value);
		} catch (Exception e) {
			fail("Unexpected Exception");
		}
	}
	
	@Test
	public void testMaxValue(){
		try {
			int value = Fibonacci.calculate(46);
			assertEquals("Unexpected value, result have to be F()=1836311903 .",1836311903, value);
		} catch (Exception e) {
			fail("Unexpected Exception");
		}
	}

	@Test
	public void testOverMaxValue(){
		try {
			Fibonacci.calculate(47);
			fail("Unexpected Exception");
		}catch (MaxLimitException e) {
			assertNotNull("Max Limit 46 .",e.getMessage());
		} catch (Exception e) {
			fail("Unexpected Exception");
		}
	}
	

}

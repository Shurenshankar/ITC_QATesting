package coco;

import static org.junit.Assert.*;
import org.junit.Test;
import jcoco.calculator;

public class CalculatorTest {
	
	@Test
	public void testAdd() {
		calculator c =new calculator();
		assertEquals(5, c.add(2, 3));
	}
	
	@Test
	public void testSubtract() {
		calculator c = new calculator();
		assertEquals(1, c.subtract(3, 2));
	}
	
	@Test
	public void testSubtrac() {
		calculator c = new calculator();
		//assertEquals(6, c.multi(3, 2));
	}
}

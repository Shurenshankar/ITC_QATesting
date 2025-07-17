package coco_1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import jcoco_1.rectangle;

public class RectangleTest {
	@Test
	public void testarea() {
		rectangle r = new rectangle();
		assertEquals(20, r.reactanglearea(4, 5));
	}
	
	@Test
	public void testperimeter() {
		rectangle r = new rectangle();
		assertEquals(18,r.rectangleperimeter(4, 5));
	}

}

package MyPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class Model_Test {

	@Test
	public void test() {
		Model mo=new Model();
		double x1=mo.operations(1.0, 2.0, "+");
		assertEquals(3,x1,0);
		
		double x2=mo.operations(6, 2, "-");
		assertEquals(4,x2,0);
		
		double x3=mo.operations(3, 2, "*");
		assertEquals(6,x3,0);
		
		double x4=mo.operations(10, 2, "/");
		assertEquals(5,x4,0);
		
		double x5=mo.operations(10, 0, "/");
		assertEquals(Double.POSITIVE_INFINITY,x5,0);
		
		double x6=mo.operations(10, 3, "%");
		assertEquals(1,x6,0);
		
		double x7=mo.operations(1000000, 100, "/");
		assertEquals(10000,x7,0);
		
		double x8=mo.operations(10000, 100000, "*");
		assertEquals(1000000000,x8,0);
		
		double x9=mo.operations(1000000, 1000000, "*");
		assertEquals(1.0E12,x9,0);
		
		double x10=mo.operations(-7, 3, "%");
		assertEquals(-1,x10,0);
		
	}

}

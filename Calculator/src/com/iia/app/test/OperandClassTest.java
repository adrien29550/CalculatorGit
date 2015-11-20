package com.iia.app.test;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.iia.app.OperandClass;
import junit.framework.TestCase;

/**
 * 
 * @author Maxime Millot <m.millot@iia-laval.fr
 * @version 1.0.0
 */

public class OperandClassTest extends TestCase {

	/**
	 * test class of SampleTest class.
	 */
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	/**
	 * Test addition
	 */
	@Test
	public  void testAdd() {
		
		int a = 0;
		int b = 2;
		
		int result = a + b;
		
		assertEquals(result, OperandClass.add(a, b));
	}
	
	/**
	 * Test subtraction
	 */
	@Test
	public  void testSubb() {
		
		int a = 0;
		int b = 2;
		
		int result = a - b;
		
		assertEquals(result, OperandClass.sub(a, b));
	}
	
	/**
	 * Test subtraction
	 */
	@Test
	public  void testMulti() {
		
		int a = 0;
		int b = 2;
		
		int result = a * b;
		
		assertEquals(result, OperandClass.mul(a, b));
	}
	
	@Test
	public  void testDiv() {
		
		int a = 0;
		int b = 2;
		
		int result = a / b;
		
		assertEquals(result, OperandClass.div(a, b));
	}

}

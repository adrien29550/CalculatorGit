package com.iia.app.test;

import com.iia.app.OperandClass;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



/**
 * Author/version/...
 * @author Adrien tlt
 * @version 1.0.0
 */

public class OperandClassTest extends TestCase {

    /** Test class of SampleTest class.
     */
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
    /** Test addition.
     */
    @Test
    public  void testAdd() {

        int val1 = 0;
        int val2 = 2;
        
        int result = val1 + val2;

        assertEquals(result, OperandClass.add(val1, val2));
    }

    /** Test subtraction.
     */
    @Test
    public  void testSubb() {

        int val1 = 0;
        int val2 = 2;

        int result = val1 - val2;

        assertEquals(result, OperandClass.sub(val1, val2));
    }

    /** Test subtraction.
     */
    @Test
    public  void testMulti() {

        int val1 = 0;
        int val2 = 2;

        int result = val1 * val2;

        assertEquals(result, OperandClass.mul(val1, val2));
    }

    /** Test division.
     */
    @Test
    public  void testDiv() {

        int val1 = 0;
        int val2 = 2;

        int result = val1 / val2;

        assertEquals(result, OperandClass.div(val1, val2));
    }

}

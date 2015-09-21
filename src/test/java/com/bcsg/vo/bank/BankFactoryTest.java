/**
 * 
 */
package com.bcsg.vo.bank;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author User
 *
 */
public class BankFactoryTest {

	Bank testBank;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		testBank = BankFactory.getInstance("HSBC Canada");
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.bcsg.vo.bank.BankFactory#getInstance(java.lang.String)}.
	 */
	@Test
	public void testGetInstance() {
		assertTrue(testBank instanceof HSBCCanada);		
	}

}

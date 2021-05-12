package com.qa.encapsulation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CustomerTest {
	
	Customer cust = new Customer();

	@BeforeClass
	public static void start() {
		// setting up a connection
		System.out.println("Before class");
	}

	@Before
	public void before() {
		// initialise some values - setters
		System.out.println("Before");
		cust.setName("Mickey");
	}

//	@Ignore
	@Test
	public void testGetName() {
		System.out.println("Test");
		assertEquals("Mickey", cust.getName());
	}

	@Test
	public void testGetAge() {
		System.out.println("Test 2");
	}
	
	@Test
	public void testToString() {
		System.out.println("Test 3");
		assertEquals("Customer [name="+cust.getName()+", age=0, address=null, accoutNo=0]", cust.toString());
	}
	
	@Test
	public void testAdd() {
		System.out.println("Test 4");
		//         expected, actual
		assertEquals(7, cust.add(4, 3));
		assertNotEquals(43, cust.add(353, 3));
		assertEquals("adding 5+6", 11, cust.add(5,6));
		assertTrue(cust.bool());
	}

	@After
	public void after() {
		// clear data
		System.out.println("After");
	}

	@AfterClass
	public static void end() {
		// close the connection
		System.out.println("After class");
	}

}

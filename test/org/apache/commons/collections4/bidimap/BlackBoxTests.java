package org.apache.commons.collections4.bidimap;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import data.TreeBidiMapData;

public class BlackBoxTests {
	private TreeBidiMap bigBidiMap;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		TreeBidiMapData dataClass = new TreeBidiMapData();
		bigBidiMap = dataClass.bigBidiMap();
	}

	@After
	public void tearDown() throws Exception {
	}

	/*
	 * No errors, returns true for lookupKeyTest
	 */
	@Test
	public void lookupKeyTest1() {
		assertTrue(bigBidiMap.containsKey(5));	
	}
	
	/*
	 * No errors, returns false for lookupKeyTest
	 */
	@Test
	public void lookupKeyTest2() {
		assertFalse(bigBidiMap.containsKey(8));
	}
	
	/*
	 * No errors, returns null for lookupKeyTest
	 */
	@Test(expected=NullPointerException.class)
	public void lookupKeyTest3() {
		bigBidiMap.containsKey(null);
	}
	
	/*
	 * No errors, returns true for lookupValueTest
	 */
	@Test
	public void lookupValueTest1() {
		assertTrue(bigBidiMap.containsValue(10));
	}
	
	/*
	 * No errors, returns false for lookupValueTest
	 */
	@Test
	public void lookupValueTest2() {
		assertFalse(bigBidiMap.containsValue(11));
	}
	
	/*
	 * No errors, returns null for lookupKeyTest
	 */
	@Test(expected=NullPointerException.class)
	public void lookupValueTest3() {
		bigBidiMap.containsValue(null);
	}
	
	
	/*
	 * The Following "checkKeyTest" Relate to lookupKey
	 * No errors, returns true for checkKeyTest
	 */
	@Test
	public void checkKeyTest1() {
		assertTrue(bigBidiMap.containsKey(5));	
	}
	
	/*
	 * No errors, returns false for checkKeyTest
	 */
	@Test
	public void checkKeyTest2() {
		assertFalse(bigBidiMap.containsKey(8));
	}
	
	/*
	 * No errors, returns null for checkKeyTest
	 */
	@Test(expected=NullPointerException.class)
	public void checkKeyTest3() {
		bigBidiMap.containsKey(null);
	}
	
	/*
	 * The Following "checkValueTest" Relate to lookupValue
	 * No errors, returns true for checkValueTest
	 */
	@Test
	public void checkValueTest1() {
		assertTrue(bigBidiMap.containsValue(10));
	}
	
	/*
	 * No errors, returns false for checkValueTest
	 */
	@Test
	public void checkValueTest2() {
		assertFalse(bigBidiMap.containsValue(11));
	}
	
	/*
	 * No errors, returns null for checkValueTest
	 */
	@Test(expected=NullPointerException.class)
	public void checkValueTest3() {
		bigBidiMap.containsValue(null);
	}
	
}

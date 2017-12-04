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
	 * No errors, returns true
	 */
	@Test
	public void lookupTest1() {
		assertTrue(bigBidiMap.containsKey(5));
		
	}
	
	/*
	 * No errors, returns false
	 */
	@Test
	public void lookupTest2() {
		assertFalse(bigBidiMap.containsKey(8));
		
	}
	
	/*
	 * 
	 */
	@Test(expected=NullPointerException.class)
	public void lookupTest3() {
		bigBidiMap.containsKey(null);
		
	}
}

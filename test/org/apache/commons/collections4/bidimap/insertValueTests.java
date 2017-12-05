package org.apache.commons.collections4.bidimap;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class insertValueTests {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	/*
	 * Cannot test duplicate values, case gets caught early on
	 * 
	 */

	@Test
	public void testInsertValueRightNodeToRoot(){
		TreeBidiMap<Integer, Integer> testMap = new TreeBidiMap<Integer, Integer>();
		testMap.put(5, 10);
		testMap.put(12, 20);

	}
	
	@Test
	public void testInsertValueLeftNodeToRoot() {
		TreeBidiMap<Integer, Integer> testMap = new TreeBidiMap<Integer, Integer>();
		testMap.put(5, 10);
		testMap.put(6, 5);
	}
	
	@Test
	public void testInsertValue2RightNodesToRoot() {
		TreeBidiMap<Integer, Integer> testMap = new TreeBidiMap<Integer, Integer>();
		testMap.put(5, 10);
		testMap.put(6, 20);
		testMap.put(7, 25);
	}
	
	@Test
	public void testInsertValue2LeftNodesToRoot() {
		TreeBidiMap<Integer, Integer> testMap = new TreeBidiMap<Integer, Integer>();
		testMap.put(5, 10);
		testMap.put(6, 5);
		testMap.put(7, 1);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testInsertDuplicateValue() {
		TreeBidiMap<Integer, Integer> testMap = new TreeBidiMap<Integer, Integer>();
		testMap.put(5, 10);
		testMap.put(6, 10);
	}

}

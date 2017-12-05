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
	 * Insert right child value to the root
	 * Coverage: 1323-1325
	 */
	@Test
	public void testInsertValueRightNodeToRoot(){
		TreeBidiMap<Integer, Integer> testMap = new TreeBidiMap<Integer, Integer>();
		testMap.put(5, 10);
		testMap.put(12, 20);
		assertEquals(2, testMap.size());
	}
	
	/*
	 * Insert left child value to the root
	 * Coverage: 1313-1317
	 */
	@Test
	public void testInsertValueLeftNodeToRoot() {
		TreeBidiMap<Integer, Integer> testMap = new TreeBidiMap<Integer, Integer>();
		testMap.put(5, 10);
		testMap.put(6, 5);
		assertEquals(2, testMap.size());

	}

	/*
	 * Insert right child value to the root's right child
	 * Coverage: 1320-1322
	 */
	@Test
	public void testInsertValue2RightNodesToRoot() {
		TreeBidiMap<Integer, Integer> testMap = new TreeBidiMap<Integer, Integer>();
		testMap.put(5, 10);
		testMap.put(6, 20);
		testMap.put(7, 25);
		assertEquals(3, testMap.size());
	}

	/*
	 * Insert left child value to the root's left child
	 * Coverage: 1310-1312
	 */
	@Test
	public void testInsertValue2LeftNodesToRoot() {
		TreeBidiMap<Integer, Integer> testMap = new TreeBidiMap<Integer, Integer>();
		testMap.put(5, 10);
		testMap.put(6, 5);
		testMap.put(7, 1);
		assertEquals(3, testMap.size());

	}
	
	/*
	 * Coverage: 1306-1309
	 * exception never gets thrown, because the node gets replaced
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testInsertDuplicateValue() {
		TreeBidiMap<Integer, Integer> testMap = new TreeBidiMap<Integer, Integer>();
		testMap.put(5, 10);
		testMap.put(6, 10);
		assertEquals(1, testMap.size());

	}

}

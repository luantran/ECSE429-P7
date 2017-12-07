package org.apache.commons.collections4.bidimap;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections4.OrderedBidiMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import data.TreeBidiMapData;
import sun.awt.EmbeddedFrame;

public class BlackBoxTests {
	private TreeBidiMap<Integer, Integer> bigBidiMap;
	private TreeBidiMap emptyMap;

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
		emptyMap = dataClass.emptyTreeBidiMap();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	///////////////////////////////////////////////////////////////
	/* 
	 * Size() tests
	 *	
	 *	testZeroSize() - no errors
	 *	testSize() - no errors
	 */
	///////////////////////////////////////////////////////////////

	@Test 
	public void testZeroSize() {
		assertEquals(0, emptyMap.size());
	}
	
	@Test
	public void testSize() {
		assertEquals(7, bigBidiMap.size());
	}
	
	///////////////////////////////////////////////////////////////
	/*
	 * isEmpty() tests
	 *  
	 *  testEmptyMap - true
	 *  testNonEmptyMap - false
	 */
	///////////////////////////////////////////////////////////////

	@Test
	public void testEmptyMap() {
		assertTrue(emptyMap.isEmpty());
	}
	
	@Test
	public void testNonEmptyMap() {
		assertFalse(bigBidiMap.isEmpty());
	}
	
	///////////////////////////////////////////////////////////////
	/*
	 * get() Tests
	 */
	///////////////////////////////////////////////////////////////

	@Test
	public void testEmptyMapGet() {
		assertNull(emptyMap.get(1));
	}
	
	@Test
	public void testGetNonExistingKey() {
		assertNull(bigBidiMap.get(123));
	}
	
	@Test(expected=ClassCastException.class)
	public void testGetInvalidArgument() {
		bigBidiMap.get("Hello");
	}
	
	@Test
	public void testGetNullKey() {
		assertFalse(bigBidiMap.isEmpty());
	}
	
	///////////////////////////////////////////////////////////////
	/* 
	 * putAll test
	 *
	 */
	///////////////////////////////////////////////////////////////

	@Test
	public void testPutAll() {
		Map<Integer, String> newMap = new HashMap<Integer, String>();
		newMap.put(1, "one");
		newMap.put(2, "two");
		newMap.put(3, "three");
		newMap.put(4, "four");
		newMap.put(5, "five");
		emptyMap.putAll(newMap);
		assertEquals(emptyMap.get(1), "one");
		assertEquals(emptyMap.get(2), "two");
		assertEquals(emptyMap.get(3), "three");
		assertEquals(emptyMap.get(4), "four");
		assertEquals(emptyMap.get(5), "five");
	}
	
	///////////////////////////////////////////////////////////////

	/*
	 * containsKey() tests 
	 * 
	 * testContainsKey
	 * testContainsNonKey
	 * testContainsKeyNull
	 */
	///////////////////////////////////////////////////////////////

	
	/*
	 * No errors, returns true for lookupKeyTest
	 */
	@Test
	public void testContainsKey() {
		assertTrue(bigBidiMap.containsKey(5));	
	}
	
	/*
	 * No errors, returns false for lookupKeyTest
	 */
	@Test
	public void testContainsNonKey() {
		assertFalse(bigBidiMap.containsKey(8));
	}
	
	/*
	 * No errors, returns null for lookupKeyTest
	 */
	@Test(expected=NullPointerException.class)
	public void testContainsKeyNull() {
		bigBidiMap.containsKey(null);
	}
	
	///////////////////////////////////////////////////////////////
	/*
	 * containsKey() tests 
	 * 
	 * testContainsValue
	 * testContainsNonValue
	 * testContainsValueNull
	 */
	///////////////////////////////////////////////////////////////

	
	/*
	 * No errors, returns true for lookupValueTest
	 */
	@Test
	public void testContainsValue() {
		assertTrue(bigBidiMap.containsValue(10));
	}
	
	/*
	 * No errors, returns false for lookupValueTest
	 */
	@Test
	public void testContainsNonValue() {
		assertFalse(bigBidiMap.containsValue(11));
	}
	
	/*
	 * No errors, returns null for lookupKeyTest
	 */
	@Test(expected=NullPointerException.class)
	public void testContainsValueNull() {
		bigBidiMap.containsValue(null);
	}
	
	///////////////////////////////////////////////////////////////
	/*
	 * The Following "checkKeyTest" Relate to lookupKey
	 */
	///////////////////////////////////////////////////////////////

	
	/*
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
	 * No errors, does not allow search for key which is not of the same type
	 *  as the ones in the Tree
	 */
	@Test(expected=ClassCastException.class)
	public void checkKeyTest4() {
		bigBidiMap.containsKey("Help");
	}
	
	///////////////////////////////////////////////////////////////
	/*
	 * The Following "checkValueTest" Relate to lookupValue
	 */
	///////////////////////////////////////////////////////////////

	
	/*
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
	
	///////////////////////////////////////////////////////////////
	/*
	 * Inverse BidiMap Black Box Tests
	 */
	///////////////////////////////////////////////////////////////

	
	@Test
	public void testInverseBidiMap() {

		OrderedBidiMap inverse = this.bigBidiMap.inverseBidiMap();
		assertEquals(inverse.get(5), bigBidiMap.getKey(5));
		assertEquals(inverse.get(7), bigBidiMap.getKey(7));
		assertEquals(inverse.get(3), bigBidiMap.getKey(3));
		assertEquals(inverse.get(12), bigBidiMap.getKey(12));
		assertEquals(inverse.get(1), bigBidiMap.getKey(1));
		assertEquals(inverse.get(24), bigBidiMap.getKey(24));
		assertEquals(inverse.get(15), bigBidiMap.getKey(15));
	}
	
	/*
	 * 
	 */
}

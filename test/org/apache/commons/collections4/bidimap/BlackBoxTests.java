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
	private TreeBidiMap<Integer, Integer> rootOnlyMap;

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
		rootOnlyMap = dataClass.withRootOnlyBidiMap();
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
	public void testGetNonExistingValue() {
		assertNull(bigBidiMap.get(123));
	}
	
	@Test(expected=ClassCastException.class)
	public void testGetInvalidArgument() {
		bigBidiMap.get("Hello");
	}
	
	@Test
	public void testGetValue() {
		assertEquals(10, (int)bigBidiMap.get(5));
	}
	
	///////////////////////////////////////////////////////////////
	/*
	 * getKey() Tests
	 */
	///////////////////////////////////////////////////////////////

	@Test
	public void testEmptyMapGetKey() {
		assertNull(emptyMap.getKey(1));
	}

	@Test
	public void testGetNonExistingKey() {
		assertNull(bigBidiMap.getKey(123));
	}

	@Test(expected=ClassCastException.class)
	public void testGetKeyInvalidArgument() {
		bigBidiMap.getKey("Hello");
	}

	@Test
	public void testGetKey() {
		assertEquals(5, (int)bigBidiMap.getKey(10));
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
	
	@Test
	public void testPutAllToExistingMap() {
		Map<Integer, Integer> newMap = new HashMap<Integer, Integer>();
		newMap.put(133, 133);
		newMap.put(233, 233);
		newMap.put(333, 333);
		newMap.put(433, 433);
		newMap.put(533, 533);
		bigBidiMap.putAll(newMap);
		assertEquals(12, bigBidiMap.size());
		
	}
	
	
	///////////////////////////////////////////////////////////////
	/* 
	 * remove() tests
	 *
	 */
	///////////////////////////////////////////////////////////////

	@Test
	public void testRemoveFromRootOnlyMap() {
		rootOnlyMap.remove(5);
		assertEquals(0, rootOnlyMap.size());
	}
	
	@Test
	public void testRemoveFromEmptyMap() {
		assertNull(emptyMap.remove(1));
	}
	
	@Test
	public void testRemoveValidKey() {
		bigBidiMap.remove(5);
		assertEquals(6, bigBidiMap.size());
	}
	
	@Test
	public void testRemoveInvalidKey() {
		assertNull(bigBidiMap.remove(134));
	}
	
	
	///////////////////////////////////////////////////////////////
	/* 
	 * removeValue() tests
	 *
	 */
	///////////////////////////////////////////////////////////////

	@Test
	public void testRemoveValueFromRootOnlyMap() {
		rootOnlyMap.removeValue(10);
		assertEquals(0, rootOnlyMap.size());
	}
	
	@Test
	public void testRemoveValueFromEmptyMap() {
		assertNull(emptyMap.removeValue(1));

	}
	
	@Test
	public void testRemoveValidValue() {
		bigBidiMap.removeValue(10);
		assertEquals(6, bigBidiMap.size());
	}
	
	@Test
	public void testRemoveInvalidValue() {
		assertNull(bigBidiMap.removeValue(1));

	}
	

	///////////////////////////////////////////////////////////////
	/* 
	 * clear test
	 *
	 */
	///////////////////////////////////////////////////////////////

	@Test
	public void testClear() {
		bigBidiMap.clear();
		assertEquals(0, bigBidiMap.size());
	}
	
	
	
	///////////////////////////////////////////////////////////////
	/* 
	 * firstKey, lastKey, nextKey and previousKey tests 
	 * identical to leastNode and
	 * greatestNode tests in TreeBidiMapTest.java
	 */
	///////////////////////////////////////////////////////////////

	///////////////////////////////////////////////////////////////
	/* 
	* equals() tests are identical to doEquals
	*  tests in doEqualsTests.java
	*/
	///////////////////////////////////////////////////////////////
		
	///////////////////////////////////////////////////////////////
	/* 
	* hashCode() tests are identical to doHashCode 
	* tests in TreeBidiMapTest.java
	*/
	///////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////
	/* 
	* toString() tests are identical to doToString 
	* tests in TreeBidiMapTest.java
	*/
	///////////////////////////////////////////////////////////////
	
	
	///////////////////////////////////////////////////////////////
	/* 
	* keySet() tests
	*/
	///////////////////////////////////////////////////////////////
	
	
	@Test
	public void testEmptyMapKeySet() {
		assertEquals(0, emptyMap.keySet().size());
	}
	
	@Test
	public void testKeySet() {
		assertEquals(7, bigBidiMap.keySet().size());
		assertTrue(bigBidiMap.keySet().contains(1));
		assertTrue(bigBidiMap.keySet().contains(3));
		assertTrue(bigBidiMap.keySet().contains(5));
		assertTrue(bigBidiMap.keySet().contains(7));
		assertTrue(bigBidiMap.keySet().contains(12));
		assertTrue(bigBidiMap.keySet().contains(15));
		assertTrue(bigBidiMap.keySet().contains(24));		
	}
	
	@Test 
	public void testInverseKeySet() {
		assertEquals(7, bigBidiMap.inverseBidiMap().keySet().size());
		assertTrue(bigBidiMap.inverseBidiMap().keySet().contains(10));
		assertTrue(bigBidiMap.inverseBidiMap().keySet().contains(12));
		assertTrue(bigBidiMap.inverseBidiMap().keySet().contains(27));
		assertTrue(bigBidiMap.inverseBidiMap().keySet().contains(80));
		assertTrue(bigBidiMap.inverseBidiMap().keySet().contains(45));
		assertTrue(bigBidiMap.inverseBidiMap().keySet().contains(3));
		assertTrue(bigBidiMap.inverseBidiMap().keySet().contains(13));	
	}
	
	///////////////////////////////////////////////////////////////
	/* 
	* values() tests
	*/
	///////////////////////////////////////////////////////////////
	
	
	@Test
	public void testEmptyMapValues() {
		assertEquals(0, emptyMap.values().size());
	}
	
	@Test
	public void testValues() {
		assertEquals(7, bigBidiMap.values().size());
		assertTrue(bigBidiMap.values().contains(10));
		assertTrue(bigBidiMap.values().contains(12));
		assertTrue(bigBidiMap.values().contains(27));
		assertTrue(bigBidiMap.values().contains(80));
		assertTrue(bigBidiMap.values().contains(45));
		assertTrue(bigBidiMap.values().contains(3));
		assertTrue(bigBidiMap.values().contains(13));		
	}
	
	@Test 
	public void testInverseValues() {
		assertEquals(7, bigBidiMap.inverseBidiMap().keySet().size());
		assertTrue(bigBidiMap.inverseBidiMap().values().contains(1));
		assertTrue(bigBidiMap.inverseBidiMap().values().contains(3));
		assertTrue(bigBidiMap.inverseBidiMap().values().contains(5));
		assertTrue(bigBidiMap.inverseBidiMap().values().contains(7));
		assertTrue(bigBidiMap.inverseBidiMap().values().contains(12));
		assertTrue(bigBidiMap.inverseBidiMap().values().contains(15));
		assertTrue(bigBidiMap.inverseBidiMap().values().contains(24));	
	}
	
	///////////////////////////////////////////////////////////////
	/* 
	* entrySet() tests
	*/
	///////////////////////////////////////////////////////////////
	
	@Test
	public void testEmptyMapEntry() {
		assertEquals(0, emptyMap.entrySet().size());
	}
	
	@Test
	public void testEntrySet() {
		assertEquals(7, bigBidiMap.entrySet().size());
	}
	
	@Test 
	public void testInverseEntrySet() {
		assertEquals(7, bigBidiMap.entrySet().size());
		assertEquals("[3=24, 10=5, 12=7, 13=15, 27=3, 45=1, 80=12]",bigBidiMap.inverseBidiMap().entrySet().toString());
	}
	
	///////////////////////////////////////////////////////////////
	/* 
	* mapIterator() tests
	*/
	///////////////////////////////////////////////////////////////
	
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

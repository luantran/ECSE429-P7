package org.apache.commons.collections4.bidimap;

import data.TreeBidiMapData;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TreeBidiMapTest {

	private TreeBidiMap rootOnlyMap;
	private TreeBidiMap leftChildMap;
	private TreeBidiMap rightChildMap;


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		TreeBidiMapData dataClass = new TreeBidiMapData();
		rootOnlyMap = dataClass.withRootOnlyBidiMap();
		leftChildMap = dataClass.valueOnLeftChild();
		rightChildMap = dataClass.valueOnRightChild();

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testTreeBidiMap() {
		fail("Not yet implemented");
	}

	@Test
	public void testTreeBidiMapMapOfQextendsKQextendsV() {
		fail("Not yet implemented");
	}

	@Test
	public void testSize() {
		assertEquals(1, this.rootOnlyMap.size());
	}

	@Test
	public void testIsEmpty() {
		fail("Not yet implemented");
	}

	@Test
	public void testContainsKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testContainsValue() {
		fail("Not yet implemented");
	}

	@Test
	public void testGet() {
		fail("Not yet implemented");
	}

	@Test
	public void testPut() {
		fail("Not yet implemented");
	}

	@Test
	public void testPutAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemove() {
		rootOnlyMap.remove(5);
		assertEquals(0, rootOnlyMap.size());
	}
	
	@Test
	public void testRemoveLeftChild() {
		leftChildMap.remove(3);
		assertEquals(1, leftChildMap.size());
	}
	@Test
	public void testRemoveLeftChildFixup() {
		leftChildMap.remove(5);
		assertEquals(1, leftChildMap.size());
	}
	
	@Test
	public void testClear() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveValue() {
		fail("Not yet implemented");
	}

	@Test
	public void testFirstKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testLastKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testNextKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testPreviousKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testKeySet() {
		fail("Not yet implemented");
	}

	@Test
	public void testValues() {
		fail("Not yet implemented");
	}

	@Test
	public void testEntrySet() {
		fail("Not yet implemented");
	}

	@Test
	public void testMapIterator() {
		fail("Not yet implemented");
	}

	@Test
	public void testInverseBidiMap() {
		fail("Not yet implemented");
	}

	@Test
	public void testEqualsObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}
	
	/*
	 * Notes:
	 * - For compare(a1,b1)
	 * 	- a1 > b1 --> return a positive value
	 * 	- a1 < b1 --> return a negative value
	 * 	- a1 == b1 --> return 0
	 */
	
	/*
	 * Testing for method doPut; will test through method Put
	 * 
	 * Test Case 1 (line 509):
	 * - Need node == null --> checking root
	 * - Done with empty Map
	 * - Verify --> get first node and confirm key and value pair
	 * 
	 * 
	 */

	/*
     * Testing for method doPut; will test through method Put
     *
     * Test Case 2 (line 521):
     * - Need cmp == 0 --> make key of key, value pair the same as the root
     * - Done with Map with one value in root
     * - Verify --> get an IllegalArgumentException
     *
     */
	
	/*
	 * Testing for method doPut; will test through method Put
	 * 
	 * Test Case 3 (line 524 and 528):
	 * - Need cmp < 0 --> key in root must be greater than the key in value
	 * - Done with Map with one value in root
	 * - Verify:
	 * 	- the left child has the same key and value pair as the one passed in the put
	 * 	- the right child is null
	 * 
	 */
	
	/*
	 * Testing for method doPut; will test through method Put
	 * 
	 * Test Case 4 (line 538 and 542):
	 * - Need cmp > 0 --> key in root must be less than the key in value
	 * - Done with Map with one value in root
	 * - Verify:
	 * 	- the right child has the same key and value pair as the one passed in the put
	 * 	- the left child is null
	 * 
	 */
	
	/*
	 * Testing for method doPut; will test through method Put
	 * 
	 * Test Case 5 (line 524, 525 and 528):
	 * - Need:
	 * 	- cmp < 0 --> key in root must be greater than the key in value
	 * 	- Key of the left node, new "node", needs to be greater than the key in value
	 * - Done with Map with one value in root, and root with a left child
	 * - Verify:
	 * 	- verify that the right child is null
	 *  - that there exist a left child
	 *  	- put this in a new variable
	 * 	- the new left child has the same key and value pair as the one passed in the put
	 * 	- the new right child is null
	 * 
	 */
	
	/*
	 * Testing for method doPut; will test through method Put
	 * 
	 * Test Case 6 (line 538, 539, and 542):
	 * - Need:
	 * 	- cmp > 0 --> key in root must be less than the key in value
	 * 	- Key of the right node, new "node", needs to be less than the key in value
	 * - Done with Map with one value in root, and root with a right child
	 * - Verify:
	 * 	- verify that the left child is null
	 *  - that there exist a right child
	 *  	- put this in a new variable
	 * 	- the new right child has the same key and value pair as the one passed in the put
	 * 	- the new left child is null
	 * 
	 */

}

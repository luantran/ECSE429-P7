package org.apache.commons.collections4.bidimap;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import data.TreeBidiMapData;

public class doPutTests {

	
	private TreeBidiMap rootOnlyMap;
	private TreeBidiMap leftChildMap;
	private TreeBidiMap bigBidiMap;
	private TreeBidiMap rightChildMap;
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
		rootOnlyMap = dataClass.withRootOnlyBidiMap();
		emptyMap = dataClass.emptyTreeBidiMap();
		leftChildMap = dataClass.valueOnLeftChild();
		bigBidiMap = dataClass.bigBidiMap();
		rightChildMap = dataClass.valueOnRightChild();
	}

	@After
	public void tearDown() throws Exception {
	}


	/*
	 * Testing for method doPut; will test through method Put
	 * 
	 * Test Case 1 (line 509):
	 * - Need node == null --> checking root
	 * - Done with empty Map
	 * - Verify --> get first node and confirm key and value pair
	 */
	@Test
	public void testPutIntoEmptyMap() {
		emptyMap.put(4, 7);
		assertEquals(1, emptyMap.size()); // Checks that size equals 1
		assertEquals(4, emptyMap.firstKey()); // Check that the first key is correct
		assertEquals(7, emptyMap.get(4)); // Check that the first value is correct
		
	}
	
	/*
     * Testing for method doPut; will test through method Put
     *
     * Test Case 2 (line 521):
     * - Need cmp == 0 --> make key of key, value pair the same as the root
     * - Done with Map with one value in root
     * - Verify --> get an IllegalArgumentException
     *
     */
	@Test
	public void testPutDuplicateKey() {
		rootOnlyMap.put(5, 15); // Add duplicate key and no exception thrown
		assertEquals(1, rootOnlyMap.size());
		// This will not happen as line 505-506 will remove the duplicate first
	}

	/*
	 * Test Case 3 (line 524 and 528):
	 * - Need cmp < 0 --> key in root must be greater than the key in value
	 * - Done with Map with one value in root
	 * - Verify:
	 * 	- the left child has the same key and value pair as the one passed in the put
	 * 	- the right child is null
	 * 
	 */
	@Test
	public void testPutSmallerKey() {
		rootOnlyMap.put(1, 27);
		assertEquals(2,rootOnlyMap.size()); // There should be a left child from the root node and now have 2 values
	}
	
	
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
	@Test
	public void testPutGreaterKey() {
		rootOnlyMap.put(8, 15);
		assertEquals(2, rootOnlyMap.size());
	}
	
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
	 @Test
	 public void testPutMuchSmallerKey() {
		 leftChildMap.put(1, 15);
		 assertEquals(3, leftChildMap.size());
	 }
	 
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
	@Test
	public void testPutMuchGreaterKey() {
		rightChildMap.put(15, 29);// There should be a right child, which has another right child
		assertEquals(3,rightChildMap.size()); // Size should now be 3
	}

}

package org.apache.commons.collections4.bidimap;

import data.TreeBidiMapData;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import org.apache.commons.collections4.OrderedBidiMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TreeBidiMapTest {

	private TreeBidiMap rootOnlyMap;
	private TreeBidiMap leftChildMap;
	private TreeBidiMap bigBidiMap;
	private TreeBidiMap rightChildMap;
	private TreeBidiMap emptyMap;
	private TreeBidiMap<Integer, Integer> fourLevelTree;

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
		fourLevelTree = dataClass.fourLevelBidiMap();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	/*
	 * Constructor test
	 */
	@Test
	public void testTreeBidiMapMapOfQextendsKQextendsV() {
		Map<Integer, String> newMap = new HashMap<Integer, String>();
		newMap.put(1, "one");
		newMap.put(2, "two");
		newMap.put(3, "three");
		newMap.put(4, "four");
		newMap.put(5, "five");
		TreeBidiMap constructorBDMap = new TreeBidiMap(newMap);
		assertEquals(constructorBDMap.get(1), "one");
		assertEquals(constructorBDMap.get(2), "two");
		assertEquals(constructorBDMap.get(3), "three");
		assertEquals(constructorBDMap.get(4), "four");
		assertEquals(constructorBDMap.get(5), "five");

	}
	
	///////////////////////////////////////////////////////////////
	/*
	 * doRemoveKey Tests
	 */
	///////////////////////////////////////////////////////////////

	
	/*
	 * Coverage: 560
	 */
	@Test
	public void testDoRemoveNonExistingKeyl() {
		bigBidiMap.remove(2);
		assertEquals(7, bigBidiMap.size());
	}
	
	/*
	 * Coverage: 562-563
	 */
	@Test
	public void testDoRemoveKey() {
		bigBidiMap.remove(5);
		assertEquals(6, bigBidiMap.size());
	}
	
	///////////////////////////////////////////////////////////////
	/*
	 * doRemoveValue Tests
	 */
	///////////////////////////////////////////////////////////////

	
	/*
	 * Coverage: 569 
	 */
	@Test
	public void testDoRemoveNonExistingValue() {
		bigBidiMap.removeValue(2);
		assertEquals(7, bigBidiMap.size());
	}
	
	/*
	 * Coverage: 571-572
	 */
	@Test
	public void testDoRemoveValue() {
		bigBidiMap.removeValue(80);
		assertEquals(6, bigBidiMap.size());
	}
	
	///////////////////////////////////////////////////////////////
	/*
	 * copyColor Tests
	 */
	///////////////////////////////////////////////////////////////

	/*
	 * Coverage: 741
	 */
	@Test
	public void testCopyColor() {
		fourLevelTree.put(7, 7);
		fourLevelTree.remove(1);
		assertEquals(19, fourLevelTree.size());
	}
	
	///////////////////////////////////////////////////////////////
	/*
	 * doHashCode Tests
	 */
	///////////////////////////////////////////////////////////////

	/*
	 * Coverage: complete path coverage
	 */
	@Test
	public void testDoHashCode() {
		bigBidiMap.hashCode();
	}
	
	/*
	 * Coverage: complete decision coverage
	 */
	@Test
	public void testEmptyHashCode() {
		emptyMap.hashCode();
	}
	
	///////////////////////////////////////////////////////////////
	/*
	 * getMapIterator Tests
	 */
	///////////////////////////////////////////////////////////////

	/*
	 * Coverage: 1423
	 */
	@Test
	public void testGetMapIterator() {
		assertEquals("{5=10}",rootOnlyMap.toString());		
	}
	
	/*
	 * Coverag: 1425
	 */
	@Test
	public void testGetInverseMapIterator() {
		assertEquals("{10=5}",rootOnlyMap.inverseBidiMap().toString());
	}
	
	///////////////////////////////////////////////////////////////
	/*
	 * doToString Tests
	 */
	///////////////////////////////////////////////////////////////

	/*
	 * Coverage: 1397
	 */
	@Test
	public void testEmptyMapToString() {
		assertEquals("{}",emptyMap.toString());
	}
	
	/*
	 * Coverage: all paths except line 1397
	 */
	@Test
	public void testMapToString() {
		assertEquals("{3=27, 5=10}",leftChildMap.toString());
	}
	
	
	///////////////////////////////////////////////////////////////
	/*
	 * leastNode and greatestNode tests
	 */
	///////////////////////////////////////////////////////////////

	/*
	 * Finding the smallest key in tree; there should be one
	 * Covers: leastNode
	 */
	@Test
	public void testLeastNodeExist() {
		assertEquals(1,bigBidiMap.firstKey());
	}
	
	/*
	 * When the tree is empty and an attempt is made to find the smallest node
	 * Will not go into leastNode because there is an exception when the tree is empty
	 */
	@Test(expected=NoSuchElementException.class)
	public void testLeastNodeEmpty() {
		emptyMap.firstKey();
	}
	
	/*
	 * Finding the largest key in the tree; there should be one
	 * Covers: greatestNode
	 */
	@Test
	public void testGreatestNodeExist() {
		assertEquals(24, bigBidiMap.lastKey());
	}
	
	/*
	 * When the tree is empty and an attempt is made to find the largest node
	 * Will not go into greatestNode because there is an exception when the tree is empty
	 */
	@Test(expected=NoSuchElementException.class)
	public void testGreatesNodeEmpty() {
		emptyMap.lastKey();
	}
	
//
//	@Test
//	public void testRemove() {
//		rootOnlyMap.remove(5);
//		assertEquals(0, rootOnlyMap.size());
//	}
//	
//	@Test
//	public void testRemoveLeftChild() {
//		leftChildMap.remove(3);
//		assertEquals(1, leftChildMap.size());
//	}
//	@Test
//	public void testRemoveLeftChildFixup() {
//		leftChildMap.remove(5);
//		assertEquals(1, leftChildMap.size());
//	}
//	

}

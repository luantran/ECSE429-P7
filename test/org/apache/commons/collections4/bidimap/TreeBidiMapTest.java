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

//	@Test
//	public void testHashCode() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testTreeBidiMap() {
//		fail("Not yet implemented");
//	}

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

	@Test
	public void testSize() {
		assertEquals(1, this.rootOnlyMap.size());
	}
	
	/*
	 * Finding the smallest key in tree; there should be one
	 * Covers: leastNode
	 */
	@Test
	public void getLeastNodeExist() {
		assertEquals(1,bigBidiMap.firstKey());
	}
	
	/*
	 * When the tree is empty and an attempt is made to find the smallest node
	 * Will not go into leastNode because there is an exception when the tree is empty
	 */
	@Test(expected=NoSuchElementException.class)
	public void getLeastNodeEmpty() {
		emptyMap.firstKey();
	}
	
	/*
	 * Finding the largest key in the tree; there should be one
	 * Covers: greatestNode
	 */
	@Test
	public void getGreatestNodeExist() {
		assertEquals(24, bigBidiMap.lastKey());
	}
	
	/*
	 * When the tree is empty and an attempt is made to find the largest node
	 * Will not go into greatestNode because there is an exception when the tree is empty
	 */
	@Test(expected=NoSuchElementException.class)
	public void getGreatesNodeEmpty() {
		emptyMap.lastKey();
	}
	

//	@Test
//	public void testIsEmpty() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testContainsKey() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testContainsValue() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGet() {
//		fail("Not yet implemented");
//	}
	

//	@Test
//	public void testPutAll() {
//		
//	}

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
	
	
	
//	@Test
//	public void testClear() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetKey() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testRemoveValue() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testFirstKey() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testLastKey() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testNextKey() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testPreviousKey() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testKeySet() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testValues() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testEntrySet() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testMapIterator() {
//		fail("Not yet implemented");
//	}

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

//	@Test
//	public void testEqualsObject() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testToString() {
//		fail("Not yet implemented");
//	}

}

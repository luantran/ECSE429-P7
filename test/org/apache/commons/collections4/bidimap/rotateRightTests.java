package org.apache.commons.collections4.bidimap;

import static org.junit.Assert.*;
import data.TreeBidiMapData;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import data.TreeBidiMapData;

public class rotateRightTests {
	
	private TreeBidiMap rootOnlyMap;
	private TreeBidiMap leftChildMap;
	private TreeBidiMap bigBidiMap;
	private TreeBidiMap rightChildMap;
	private TreeBidiMap emptyMap;
	private TreeBidiMap twoLevelTree;

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
		twoLevelTree = dataClass.twoLevelBidiMap();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	// Happens inside doPut when you insert right or left through doRedBlackInsert
	// Passes the node and the key of that node
	
	/*
	 * Coverage:
	 * 874,880
	 */
	@Test
	public void testRightRotateOnce() {
		assertEquals(10, twoLevelTree.firstKey());
		twoLevelTree.put(15, 6);
		assertEquals(10, twoLevelTree.firstKey());
		twoLevelTree.put(5, 18);
		// Add to data type from above
		twoLevelTree.put(18, 6);
	}
	
	/*
	 * Coverage:
	 * 874,880,884
	 */
	@Test
	public void testRightRotateTwice() {
		assertEquals(10, twoLevelTree.firstKey());
		twoLevelTree.put(15, 6);
		assertEquals(10, twoLevelTree.firstKey());
		twoLevelTree.put(5, 18);
		// Add to data type from above
		twoLevelTree.put(1, 6);
	}
	
	/*
	 * Coverage: 882
	 */
	@Test
	public void testRoteteRightInsideBranch() {
		TreeBidiMap<Integer, Integer> testMap = new TreeBidiMap<Integer, Integer>();
		testMap.put(13, 13);
		testMap.put(8, 8);
		testMap.put(19, 19);
		testMap.put(15, 15);
		testMap.put(14, 14);
		assertEquals(5, testMap.size());
	}
	
	

}

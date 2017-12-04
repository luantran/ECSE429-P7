package org.apache.commons.collections4.bidimap;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import data.TreeBidiMapData;

public class doRedBlackDeleteTests {
	
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
		// bigBidiMap = dataClass.bigBidiMap();
		rightChildMap = dataClass.valueOnRightChild();
		twoLevelTree = dataClass.twoLevelBidiMap();
		
	}

	@After
	public void tearDown() throws Exception {
	}
	
	/*
	 * Deleting tree with only root so that tree is empty
	 * Coverage:
	 * 968, 1002
	 */
	@Test
	public void testRemoveRoot() {
//		rootOnlyMap.remove(5);
//		assertEquals(0,rootOnlyMap.size());
		
	}
	
	/*
	 * Deleting root so that left child becomes root
	 * Coverage: 972, 979, 982, 994
	 * 1014
	 * 
	 */
	@Test
	public void testRemoveRoot2() {
		twoLevelTree.remove(20);
		assertEquals(2,twoLevelTree.size());
	}

}

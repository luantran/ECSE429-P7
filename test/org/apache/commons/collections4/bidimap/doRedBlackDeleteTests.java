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
		bigBidiMap = dataClass.bigBidiMap();
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
		rootOnlyMap.remove(5);
		assertEquals(0,rootOnlyMap.size());
		assertEquals(false, rootOnlyMap.containsKey(5)); // Make sure the key is no longer there
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
		assertEquals(false, twoLevelTree.containsKey(20)); // Make sure the key is no longer there
	}
	
	/*
	 * Deleting left child when the tree is balanced and height of 1
	 * Coverage:
	 * 1012
	 * 984, 994
	 */
	@Test
	public void testRemoveLeftChild() {
		twoLevelTree.remove(10);
		assertEquals(2,twoLevelTree.size());
		assertEquals(false, twoLevelTree.containsKey(10)); // Make sure the key is no longer there
	}
	
	/*
	 * Deleting right child when the tree is balanced and height of 1
	 * Coverage:
	 * 1014
	 */
	@Test
	public void testRemoveRightChild() {
		twoLevelTree.remove(30);
		assertEquals(2,twoLevelTree.size());
		assertEquals(false, twoLevelTree.containsKey(30)); // Make sure the key is no longer there
	}
	
	/*
	 * Deleting child which is both black and on the right side
	 * Coverage:
	 * 972, 986, 994
	 * 1012
	 */
	@Test
	public void testRemoveOnRight() {
		 bigBidiMap.remove(12);
		 assertEquals(false, bigBidiMap.containsKey(12)); // Make sure the key is no longer there
	}

}

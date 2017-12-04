package org.apache.commons.collections4.bidimap;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import data.TreeBidiMapData;

public class rotateLeftTests {
	
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
	 * Coverage:
	 * 855,857
	 */
	@Test
	public void test1() {
		System.out.println(twoLevelTree);
		assertEquals(10, twoLevelTree.firstKey());
		twoLevelTree.put(40, 6);
		System.out.println(twoLevelTree);
		assertEquals(10, twoLevelTree.firstKey());
		twoLevelTree.put(25, 18);
		System.out.println(twoLevelTree);
		// Add to data type from above
		twoLevelTree.put(50, 7);
		twoLevelTree.put(60, 9);
	}
	
	/*
	 * Coverage:
	 * 847, 853, 855
	 */
	@Test
	public void test2() {
		System.out.println(twoLevelTree);
		assertEquals(10, twoLevelTree.firstKey());
		twoLevelTree.put(40, 6);
		System.out.println(twoLevelTree);
		assertEquals(10, twoLevelTree.firstKey());
		twoLevelTree.put(25, 18);
		System.out.println(twoLevelTree);
		// Add to data type from above
		twoLevelTree.put(50, 7);
		twoLevelTree.put(45, 9);
	}

}

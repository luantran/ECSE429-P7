package org.apache.commons.collections4.bidimap;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import data.TreeBidiMapData;

public class nextSmallerTests {
	
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
//		leftChildMap = dataClass.valueOnLeftChild();
//		bigBidiMap = dataClass.bigBidiMap();
//		rightChildMap = dataClass.valueOnRightChild();
		fourLevelTree = dataClass.fourLevelBidiMap();
	}

	@After
	public void tearDown() throws Exception {
	}

	/*
	 * Cannot test null because exception gets thrown
	 */
//	@Test
//	public void testNextGreaterNull() {
//		assertNull(fourLevelTree.nextKey(null));
//	}
	
	/**
	 * Coverage:
	 * 657
	 */
	@Test
	public void testNextSmallerWithLeft() {
		assertEquals(12, (int)fourLevelTree.previousKey(13));
	}
	
	/**
	 * Coverage:
	 * 665-666
	 */
	@Test
	public void testNextSmallerNoLeft() {
		assertEquals(5, (int)fourLevelTree.previousKey(6));
	}

	
	/**
	 * Coverage:
	 * 669-670
	 */

	@Test
	public void testNextSmallerNoLeftWithLeftParent() {
		assertNull(fourLevelTree.previousKey(1));
	}
	
	/**
	 * Coverage:
	 * 665-666
	 */
	@Test
	public void testNextSmallerNoLeftWithNullParent() {
		assertNull(rootOnlyMap.previousKey(5));
	}

	@Test
	public void testNextSmallerEmpty() {
		assertNull(emptyMap.nextKey(5));
	}

}

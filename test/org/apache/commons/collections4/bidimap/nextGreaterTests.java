package org.apache.commons.collections4.bidimap;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import data.TreeBidiMapData;

public class nextGreaterTests {
	
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
	
	
	//Cannot test null because exception gets thrown
	 
/*	@Test
	public void testNextGreaterNull() {
		assertNull(fourLevelTree.nextKey(null));
*/	}
	
	/**
	 * Coverage: 623-624
	 */
	@Test
	public void testNextGreaterWithRight() {
		assertEquals(15, (int)fourLevelTree.nextKey(13));
	}
	
	/**
	 * Coverage:631-632
	 */
	@Test
	public void testNextGreaterNoRight() {
		assertEquals(5, (int)fourLevelTree.nextKey(1));
	}
	
	/**
	 * Coverage:631-640
	 */
	
	@Test
	public void testNextGreaterNoRightWithRightParent() {
		assertEquals(8, (int)fourLevelTree.nextKey(6));
	}
	
	/**
	 * Coverage:631-632
	 */
	
	@Test
	public void testNextGreaterNoRightWithNullParent() {
		assertNull(rootOnlyMap.nextKey(5));
	}
	
	/**
	 * Coverage:619
	 */
	
	@Test
	public void testNextGreaterEmpty() {
		assertNull(emptyMap.nextKey(5));
	}
	
	

}

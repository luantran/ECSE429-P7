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
//		emptyMap = dataClass.emptyTreeBidiMap();
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
	
	@Test
	public void testNextGreaterWithRight() {
		fourLevelTree.nextKey(13);
	}
//	
	@Test
	public void testNextGreaterWithLeft() {
		fourLevelTree.nextKey(1);
	}
	
	@Test
	public void testNextGreaterWithParent() {
		fourLevelTree.nextKey(6);
	}
	
	@Test
	public void testNextGreaterWithNullParent() {
		rootOnlyMap.nextKey(5);
	}
	
	

}

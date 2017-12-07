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
	
<<<<<<< HEAD

=======
	/**
	 * Coverage:
	 * 657
	 */
>>>>>>> d8c42d9cef94f81d817835f37ce70fdbe7eef6d4
	@Test
	public void testNextSmallerWithLeft() {
		assertEquals(12, (int)fourLevelTree.previousKey(13));
	}
<<<<<<< HEAD

=======
	
	/**
	 * Coverage:
	 * 665-666
	 */
>>>>>>> d8c42d9cef94f81d817835f37ce70fdbe7eef6d4
	@Test
	public void testNextSmallerNoLeft() {
		assertEquals(5, (int)fourLevelTree.previousKey(6));
	}
<<<<<<< HEAD

=======
	
	/**
	 * Coverage:
	 * 669-670
	 */
>>>>>>> d8c42d9cef94f81d817835f37ce70fdbe7eef6d4
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
<<<<<<< HEAD

	@Test
	public void testNextSmallerEmpty() {
		assertNull(emptyMap.nextKey(5));
	}
=======
	
>>>>>>> d8c42d9cef94f81d817835f37ce70fdbe7eef6d4
}

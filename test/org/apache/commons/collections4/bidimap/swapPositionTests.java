package org.apache.commons.collections4.bidimap;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import data.TreeBidiMapData;

public class swapPositionTests {

	private TreeBidiMap fourLevelTree;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		TreeBidiMapData dataClass = new TreeBidiMapData();
		 fourLevelTree = dataClass.fourLevelBidiMap();
		 fourLevelTree.put(24, 24);
		 fourLevelTree.put(26, 26);
		 fourLevelTree.put(14, 14);
		 fourLevelTree.put(19, 19);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println();
	}
	
	/*
	 * Remove a node that is root
	 * Coverage: Line 1207
	 */
	@Test
	public void removeRootNode() {
		System.out.println(fourLevelTree.nextKey(13));
		fourLevelTree.remove(13);
	}
	
	
	@Test
	public void removeTestLeftRedNode() {
		System.out.println(fourLevelTree.nextKey(5));
		fourLevelTree.remove(5);
	}
//	
//	@Test
//	public void removeTestRightRedNode() {
//		System.out.println(fourLevelTree.nextKey(10));
//		fourLevelTree.remove(10);
//
//	}
//	
//	@Test
//	public void removeTest3() {
//		System.out.println(fourLevelTree.nextKey(8));
//		fourLevelTree.remove(8);
//	}
//
//
//	@Test
//	public void removeTest4() {
//		fourLevelTree.remove(24);
//		fourLevelTree.remove(23);
//	}


}

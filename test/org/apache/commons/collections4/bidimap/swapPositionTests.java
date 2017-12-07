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
	}
	
	/*
	 * Remove a node that is root
	 * Coverage: Line 1204
	 * Coverage: Lines 1142, 1152-1153, 1167, 1171, 1177-1178, 1183, 1187
	 */
	@Test
	public void removeRootNode() {
		fourLevelTree.remove(13);
		assertEquals(18, fourLevelTree.size());
		assertEquals(false, fourLevelTree.containsKey(13));

	}
	
	/*
	 * Remove a left node from a red node with 2 children
	 * Coverage: 1157, 1163-1164
	 */
	@Test
	public void removeTestLeftRedNode() {
		fourLevelTree.remove(5);
		assertEquals(18, fourLevelTree.size());
		assertEquals(false, fourLevelTree.containsKey(5));

	}
	
	
	/*
	 * Remove a right node from a red node with 2 children
	 * Coverage: 1148
	 */
	@Test
	public void removeTestRightRedNode() {
		fourLevelTree.remove(10);
		assertEquals(18, fourLevelTree.size());
		assertEquals(false, fourLevelTree.containsKey(10));

	}
	
	
	/*
	 * Remove a grand parent node
	 * Coverage: 1146
	 */
	@Test
	public void removeTestGrandParentNode() {
		fourLevelTree.remove(8);
		assertEquals(18, fourLevelTree.size());
		assertEquals(false, fourLevelTree.containsKey(8));

	}


	/*
	 * Remove 2 nodes
	 * Coverage: 1195
	 */
	@Test
	public void removeTest2Nodes() {
		fourLevelTree.remove(24);
		fourLevelTree.remove(23);
		assertEquals(17, fourLevelTree.size());
		assertEquals(false, fourLevelTree.containsKey(24));
		assertEquals(false, fourLevelTree.containsKey(23));
	}


}

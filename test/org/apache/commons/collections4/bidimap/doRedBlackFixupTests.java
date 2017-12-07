package org.apache.commons.collections4.bidimap;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import data.TreeBidiMapData;

public class doRedBlackFixupTests {
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

	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void removeTest() {
		fourLevelTree.put(7, 7);
		fourLevelTree.remove(1);
	}
	
//	@Test
//	public void removeTest2() {
////		fourLevelTree.put(24, 24);
//		fourLevelTree.remove(10);
//	}

}

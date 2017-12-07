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
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void removeTest() {
		System.out.println(fourLevelTree.nextKey(5));
		fourLevelTree.remove(5);
	}
	
//	@Test
//	public void removeTest2() {
//		fourLevelTree.remove(8);
//
//	}
//	
//	@Test
//	public void removeTest3() {
//		fourLevelTree.remove(23);
//	}
//	
//	@Test
//	public void removeTest4() {
//		fourLevelTree.remove(10);
//	}
//	@Test
//	public void removeTest5() {
//		fourLevelTree.remove(32);
//	}
//	@Test
//	public void removeTest6() {
//		fourLevelTree.remove(5);
//	}
//	@Test
//	public void removeTest7() {
//		fourLevelTree.remove(23);
//	}
//	@Test
//	public void removeTest8() {
//		fourLevelTree.remove(37);
//	}
//	@Test
//	public void removeTest9() {
//		fourLevelTree.remove(1);
//	}

}

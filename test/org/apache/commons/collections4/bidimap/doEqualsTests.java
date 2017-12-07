package org.apache.commons.collections4.bidimap;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import data.TreeBidiMapData;

public class doEqualsTests {
	
	private TreeBidiMap bigBidiMap;
	private TreeBidiMap bigBidiMap_other;
	private TreeBidiMap bigBidiMap2;
	private TreeBidiMap bigBidiMap3;
	private TreeBidiMap leftChildMap;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		TreeBidiMapData dataClass = new TreeBidiMapData();
		bigBidiMap = dataClass.bigBidiMap();
		bigBidiMap_other = dataClass.bigBidiMap();
		bigBidiMap2 = dataClass.bigBidiMap2();
		bigBidiMap3 = dataClass.bigBidiMap3();
		leftChildMap = dataClass.valueOnLeftChild();
	}

	@After
	public void tearDown() throws Exception {
	}

	
//	Comparing two different maps
	/*
	 * Coverage: 1348, 1350
	 */
	@Test
	public void doEqualsTestDifferentMaps() {
		assertFalse(bigBidiMap.equals(leftChildMap));

	}
	
	/*
	 * Coverage: 1345-1346
	 */
	@Test
	public void doEqualsTestDifferentTypes() {
		assertFalse(bigBidiMap.equals(1));

	}
	
	/*
	 * Coverage: 1342-1343
	 */
	@Test
	public void doEqualsTestSameMap() {
		assertTrue(bigBidiMap.equals(bigBidiMap));

	}
	
	/*
	 * Coverage: 1355-1357, 1368
	 */
	@Test
	public void doEqualsTestSameMapDifferentInstances() {
		assertTrue(bigBidiMap.equals(bigBidiMap_other));

	}
	
	/*
	 * Coverage: 1358-1359
	 */
	@Test
	public void doEqualsTestSameMapDifferentKeys() {
		assertFalse(bigBidiMap.equals(bigBidiMap2));

	}
	
	/*
	 * Coverage: 1364-1365
	 */
	@Test
	public void doEqualsTestCasting() {
		assertFalse(bigBidiMap.equals(bigBidiMap3));
		
	}

}

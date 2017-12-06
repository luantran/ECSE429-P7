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
	private TreeBidiMap bigBidiMap2;
	private TreeBidiMap bigBidiMap3;
	private TreeBidiMap bigBidiMap4;
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
		bigBidiMap2 = dataClass.bigBidiMap();
		bigBidiMap3 = dataClass.bigBidiMap2();
		bigBidiMap4 = dataClass.bigBidiMap3();
		leftChildMap = dataClass.valueOnLeftChild();
	}

	@After
	public void tearDown() throws Exception {
	}

	
	//Comparing two different maps
	@Test
	public void doEqualsTestDifferentMaps() {
		assertFalse(bigBidiMap.equals(leftChildMap));

	}
	
	@Test
	public void doEqualsTestDifferentTypes() {
		assertFalse(bigBidiMap.equals(1));

	}
	
	@Test
	public void doEqualsTestSameMap() {
		assertTrue(bigBidiMap.equals(bigBidiMap));

	}
	
	@Test
	public void doEqualsTestSameMapDifferentInstances() {
		assertTrue(bigBidiMap.equals(bigBidiMap2));

	}
	
	@Test
	public void doEqualsTestSameMapDifferentKeyInstances() {
		assertFalse(bigBidiMap.equals(bigBidiMap3));

	}
	
	@Test
	public void doEqualsTestSameMapDifferentKeyCasting() {
		assertFalse(bigBidiMap.equals(bigBidiMap4));
		
	}

}

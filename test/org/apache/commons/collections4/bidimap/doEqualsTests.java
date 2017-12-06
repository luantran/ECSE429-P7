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
		leftChildMap = dataClass.valueOnLeftChild();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test 
	//Comparing Both bigBidiMaps
	public void doEqualsKeyTest1() {

		assertEquals(bigBidiMap, bigBidiMap);

	}
	
	//Comparing two different maps
	public void doEqualsKeyTest2() {

		//assertEquals(bigBidiMap.size(), leftChildMap.size());
		System.out.println(bigBidiMap.equals(leftChildMap));

	}


}

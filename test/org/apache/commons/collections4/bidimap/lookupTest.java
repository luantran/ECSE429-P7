package org.apache.commons.collections4.bidimap;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import data.TreeBidiMapData;


/* 
 * Called by:
 * - nextKey()
 * - previousKey()
 * - lookupKey() -> containsKey() , get()
 * - lookupValue() -> containsValue(), getKey()
 */
public class lookupTest {
	
	private TreeBidiMap rootOnlyMap;
	private TreeBidiMap rightChildMap;
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
		rootOnlyMap = dataClass.withRootOnlyBidiMap();
		rightChildMap = dataClass.valueOnRightChild();
		leftChildMap = dataClass.valueOnLeftChild();

	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testContainsOnlyRoot() {
		assertTrue(rootOnlyMap.containsKey(5));
		assertTrue(rootOnlyMap.containsValue(10));
		assertEquals(10, rootOnlyMap.get(5));
		assertEquals(5, rootOnlyMap.getKey(10));
	}
	
	@Test
	public void testContainsTwoNodesRight() {
		assertTrue(rightChildMap.containsKey(7));
		assertTrue(rightChildMap.containsValue(12));
		assertEquals(12, rightChildMap.get(7));
		assertEquals(7, rightChildMap.getKey(12));

	}
	
	@Test
	public void testContainsTwoNodesLeft() {
		assertTrue(leftChildMap.containsKey(3));
		assertTrue(leftChildMap.containsValue(27));
		assertEquals(27, leftChildMap.get(3));
		assertEquals(3, leftChildMap.getKey(27));
	}


	

}

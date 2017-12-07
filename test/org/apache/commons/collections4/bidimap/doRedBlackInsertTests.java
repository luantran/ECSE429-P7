package org.apache.commons.collections4.bidimap;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import data.TreeBidiMapData;

public class doRedBlackInsertTests {

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
/*
 * Could not test the following lines: suspected to be dead code, 
 * code never reached:
 * lines 916-920
 * lines 942-946
 */

	/*
	 * Test case 0
	 * Insert a node to a root node
	 * Coverage: 899-900, 958
	 */
	@Test
	public void testInsertANode() {
		TreeBidiMap<Integer, Integer> testMap = new TreeBidiMap<Integer, Integer>();
		testMap.put(13, 13);
		testMap.put(8, 8);
		
	}
	
	/*
	 * Test case 1
	 * Insert a left child to a right child of a root node
	 * Coverage: 906, 922, 923, 926
	 */
	@Test
	public void testInsertLeftNodetoRedNode() {
		TreeBidiMap<Integer, Integer> testMap = new TreeBidiMap<Integer, Integer>();
		testMap.put(13, 13);
		testMap.put(8, 8);
		testMap.put(5, 5);
	}
	
	/*
	 * Test case 2
	 * Insert a right child to a right child of a root node
	 * Coverage: 932, 948, 949, 952
	 */
	@Test
	public void testInsertRightNodetoRedNode() {
		TreeBidiMap<Integer, Integer> testMap = new TreeBidiMap<Integer, Integer>();
		testMap.put(13, 13);
		testMap.put(32, 32);
		testMap.put(37, 37);
	}
	
	/*
	 * Test case 3
	 * Insert a left child to a balanced 2 degree tree
	 * Coverage: 909-913
	 */
	@Test
	public void testInsertLeftNodetoBalancedTree() {
		TreeBidiMap<Integer, Integer> testMap = new TreeBidiMap<Integer, Integer>();
		testMap.put(13, 13);
		testMap.put(8, 8);
		testMap.put(32, 32);
		testMap.put(5, 5);
	}
	
	/*
	 * Test case 4
	 * Insert right node to a balanced 2 degree tree
	 * Coverage: 935-939
	 */
	@Test
	public void testInsertRightNodetoBalancedTree() {
		TreeBidiMap<Integer, Integer> testMap = new TreeBidiMap<Integer, Integer>();
		testMap.put(13, 13);
		//to prevent the tree from being unbalanced
		testMap.put(8, 8);
		testMap.put(32, 32);
		testMap.put(37, 37);
	}
	


}

package org.apache.commons.collections4.bidimap;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
 * Missing dead code test (lines 916-920)
 * Missing dead code test (lines 942-946)
 * Missing conditions line 925 and 951
 * Missing condition 902
 */
	
	@Test
	public void test1(){
		TreeBidiMap<Integer, Integer> testMap = new TreeBidiMap<Integer, Integer>();
		testMap.put(5, 10);
		testMap.put(12, 20);

	}
	
	@Test
	public void test2() {
		TreeBidiMap<Integer, Integer> testMap = new TreeBidiMap<Integer, Integer>();
		testMap.put(5, 10);
		testMap.put(12, 20);
		testMap.put(4, 15);
	}
	
	
	@Test
	public void test3() {
		TreeBidiMap<Integer, Integer> testMap = new TreeBidiMap<Integer, Integer>();
		testMap.put(5, 10);
		testMap.put(12, 20);
		testMap.put(15, 14);
	}
	
	@Test
	public void test4() {
		TreeBidiMap<Integer, Integer> testMap = new TreeBidiMap<Integer, Integer>();
		testMap.put(5, 10);
		testMap.put(3, 28);
		testMap.put(4, 15);
	}
	
	@Test
	public void test5() {
		TreeBidiMap<Integer, Integer> bigBidiMap = new TreeBidiMap<Integer, Integer>();
		bigBidiMap.put(5, 10);
		bigBidiMap.put(7, 12);
		bigBidiMap.put(3, 27);
		bigBidiMap.put(12, 80);
		bigBidiMap.put(1, 45);
		bigBidiMap.put(24, 3);
		bigBidiMap.put(15, 13);
		bigBidiMap.put(6, 10);
		bigBidiMap.put(9, 12);
		bigBidiMap.put(23, 27);
	}
	


}

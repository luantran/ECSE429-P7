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
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void doEqualsKeyTest1() {
		assertTrue(bigBidiMap.equals(5)); // NOT WORKING! WHAT DO I COMPARE THIS EQUALS TO
	}

}

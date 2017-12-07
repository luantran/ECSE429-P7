package org.apache.commons.collections4.functors;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.commons.collections4.Closure;

import data.ChainedClosureData;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ChainedClosureTest {
	private ChainedClosure cClosure;
	private ChainedClosureData dataClass;
	private Closure<Integer> cIncrement;
	private Closure<Integer> cIncrementBy2;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		cIncrement = new Closure<Integer>() {

			@Override
			public void execute(Integer input) {
				input += 32;
				System.out.println(input);
			}
		};
		cIncrementBy2 = new Closure<Integer>() {

			@Override
			public void execute(Integer input) {
				input*=42;
				System.out.println(input);
			}
		};
	}

	@After
	public void tearDown() throws Exception {
	}

	/*
	 * Coverage: 101
	 */
	@Test
	public void testChainedClosureClosureOfQsuperEArray() {
		Closure newArray[] = {cIncrement, cIncrementBy2};
		ChainedClosure testChained = new ChainedClosure<Integer>(newArray);
	}
	
	
	/*
	 * Coverage: 111-112
	 */
	@Test
	public void testExecute() {
		Closure newArray[] = {cIncrement, cIncrementBy2};
		ChainedClosure testChained = new ChainedClosure<Integer>(newArray);
		int i = 2;
		testChained.execute(i);
	}
	
	/*
	 * Coverage: 123
	 */
	@Test
	public void testGetClosures() {
		Closure newArray[] = {cIncrement, cIncrementBy2};
		ChainedClosure testChained = new ChainedClosure<Integer>(newArray);
		Closure copyArray[] = new Closure[2];
		copyArray = testChained.getClosures();
		assertArrayEquals(newArray, copyArray);
	}
}

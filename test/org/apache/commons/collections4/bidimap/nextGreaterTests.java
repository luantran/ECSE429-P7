package org.apache.commons.collections4.bidimap;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import data.TreeBidiMapData;

public class nextGreaterTests {
	
	private TreeBidiMap rootOnlyMap;
	private TreeBidiMap leftChildMap;
	private TreeBidiMap bigBidiMap;
	private TreeBidiMap rightChildMap;
	private TreeBidiMap emptyMap;
	private TreeBidiMap twoLevelTree;

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
		emptyMap = dataClass.emptyTreeBidiMap();
		leftChildMap = dataClass.valueOnLeftChild();
		bigBidiMap = dataClass.bigBidiMap();
		rightChildMap = dataClass.valueOnRightChild();
		twoLevelTree = dataClass.twoLevelBidiMap();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
		
		/*
    		public K nextKey(final K key) {
        		checkKey(key);
        		final Node<K, V> node = nextGreater(lookupKey(key), KEY);
        		return node == null ? null : node.getKey();
    		}
		 * 
        	@Override
        	public V nextKey(final V key) {
            	checkKey(key);
            	final Node<K, V> node = nextGreater(TreeBidiMap.this.<V>lookup(key, VALUE), VALUE);
            	return node == null ? null : node.getValue();
        	}
		 * 
		 */
		 
        	@Override
        	public boolean equals(final Object obj) {
            return TreeBidiMap.this.doEquals(obj, DataElement.VALUE);
         	}
		 * 
		 */
		
		
		
	}

}

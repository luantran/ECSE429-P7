package org.apache.commons.collections4;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.commons.collections4.bag.CollectionBag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.bag.PredicatedSortedBag;
import org.apache.commons.collections4.bag.SynchronizedBag;
import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.commons.collections4.bag.TransformedBag;
import org.apache.commons.collections4.bag.TransformedSortedBag;
import org.apache.commons.collections4.bag.TreeBag;
import org.apache.commons.collections4.bag.UnmodifiableBag;
import org.apache.commons.collections4.bag.UnmodifiableSortedBag;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BagUtilsTest {

	private Predicate<Integer> isEvenPredicate;

	private Predicate predicate;

	private Transformer transformer;

	private Bag<Integer> hbag;

	private TreeBag<Integer> tbag;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

		predicate = PredicateUtils.truePredicate();

		tbag = new TreeBag<Integer>();
		tbag.add(1);
		tbag.add(-1);
		tbag.add(0);
		tbag.add(2);
		tbag.add(1000);
		tbag.add(999);

		hbag = new HashBag<Integer>();

		hbag.add(1);
		tbag.add(-1);
		hbag.add(0);
		hbag.add(2);
		hbag.add(1000);
		hbag.add(999);

		isEvenPredicate = new Predicate<Integer>() {
			@Override
			public boolean evaluate(Integer object) {
				return object % 2 == 0;
			}
		};

		transformer = new Transformer() {
			@Override
			public Object transform(Object obj) {
				return ((Integer) obj).toString().length();
			}
		};

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSynchronizedBag() {
		Bag<Integer> bag = BagUtils.synchronizedBag(hbag);
		assertTrue( bag instanceof SynchronizedBag);
		try {
			Bag bag2 = BagUtils.synchronizedBag(null);
			fail();
		} catch (NullPointerException e) {
		}
	}

	@Test
	public void testUnmodifiableBag() {
		Bag bag = BagUtils.unmodifiableBag(hbag);
		assertTrue( bag instanceof UnmodifiableBag);
		
		try {
			Bag bag2 = BagUtils.unmodifiableBag(null);
			fail();
		} catch (NullPointerException e) {
		}
		
		
		//the following is actually not necessary since we assume UnmodifiableBag is already tested
		
		try {
			bag.remove(2);
			fail();
		} catch (UnsupportedOperationException e) {
		}
		try {
			bag.add(8);
			fail();
		} catch (UnsupportedOperationException e) {
		}
		try {
			bag.clear();
			fail();
		} catch (UnsupportedOperationException e) {
		}
		

	}

	@Test
	public void testPredicatedBag() {
		// Bag bag = BagUtils.predicatedBag(tbag, isEvenPredicate);

		Bag bag = BagUtils.predicatedBag(new HashBag(), predicate);
		assertTrue( bag instanceof PredicatedBag);
		try {
			bag = BagUtils.predicatedBag(null, predicate);
			fail();
		} catch (NullPointerException ex) {
		}
		try {
			bag = BagUtils.predicatedBag(new HashBag(), null);
			fail();
		} catch (NullPointerException ex) {
		}
	}

	@Test
	public void testTransformingBag() {
		Bag bag = BagUtils.transformingBag(hbag, transformer);
		assertTrue(bag instanceof TransformedBag);
		try {
			Bag bag2 = BagUtils.transformingBag(hbag, null);
			fail();
		} catch (NullPointerException ex) {
		}
		try {
			Bag bag3 = BagUtils.transformingBag(null, transformer);
			fail();
		} catch (NullPointerException ex) {
		}
	}

	@Test
	public void testCollectionBag() {
		Bag bag = BagUtils.collectionBag(hbag);
		assertTrue(bag instanceof CollectionBag);
		
		try {
			Bag bag2 = BagUtils.collectionBag(null);
			fail();
		} catch (NullPointerException ex) {
		}
		
	}

	@Test
	public void testSynchronizedSortedBag() {
		Bag bag = BagUtils.synchronizedSortedBag(tbag);
		assertTrue(bag instanceof SynchronizedSortedBag);
		try {
			Bag bag2 = BagUtils.synchronizedSortedBag(null);
			fail();
		} catch (NullPointerException ex) {
		}
		
		
	}

	@Test
	public void testUnmodifiableSortedBag() {

		Bag bag = BagUtils.unmodifiableSortedBag(tbag);
		assertTrue(bag instanceof UnmodifiableSortedBag);
		try {
			Bag bag2 = BagUtils.unmodifiableSortedBag(null);
			fail();
		} catch (NullPointerException ex) {
		}
		
	}

	@Test
	public void testPredicatedSortedBag() {
		Bag bag = BagUtils.predicatedSortedBag(new TreeBag(), predicate);
		assertTrue( bag instanceof PredicatedSortedBag);
		try {
			bag = BagUtils.predicatedSortedBag(null, predicate);
			fail();
		} catch (NullPointerException ex) {
		}
		try {
			bag = BagUtils.predicatedSortedBag(new TreeBag(), null);
			fail();
		} catch (NullPointerException ex) {
		}
	}

	@Test
	public void testTransformingSortedBag() {
		Bag bag = BagUtils.transformingSortedBag(tbag, transformer);
		
		assertTrue( bag instanceof TransformedSortedBag);
		try {
			bag = BagUtils.transformingSortedBag(null, transformer);
			fail();
		} catch (NullPointerException ex) {
		}
		try {
			bag = BagUtils.transformingSortedBag(new TreeBag(), null);
			fail();
		} catch (NullPointerException ex) {
		}
		
	}

	@Test
	public void testEmptyBag() {
		Bag bag = BagUtils.emptyBag();
		assertTrue( bag.size()==0);
	}

	@Test
	public void testEmptySortedBag() {
		Bag bag = BagUtils.emptySortedBag();
		assertTrue( bag instanceof SortedBag);
		assertTrue( bag.size()==0);

	}

}

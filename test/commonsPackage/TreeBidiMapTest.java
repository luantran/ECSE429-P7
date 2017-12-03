package commonsPackage;
/*
 * Useful Links: https://commons.apache.org/proper/commons-collections/javadocs/api-release/index.html?org/apache/commons/collections4/ChainedClosure.html
 */

import static org.junit.Assert.*;

import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bidimap.TreeBidiMap;
import org.junit.Test;

public class TreeBidiMapTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		TreeBidiMap exMap = new TreeBidiMap();
		// exMap.put(key, value)
		assertEquals(1,0); //placeholder
	}
	
	/*
	 * Notes:
	 * - For compare(a1,b1)
	 * 	- a1 > b1 --> return a positive value
	 * 	- a1 < b1 --> return a negative value
	 * 	- a1 == b1 --> return 0
	 */
	
	/*
	 * Testing for method doPut; will test through method Put
	 * 
	 * Test Case 1:
	 * - Need node == null --> checking root
	 * - Done with empty Map
	 * - Verify --> get first node and confirm key and value pair
	 * 
	 * 
	 */

	/*
     * Testing for method doPut; will test through method Put
     *
     * Test Case 2:
     * - Need cmp == 0 --> make key of key, value pair the same as the root
     * - Verify --> get an IllegalArgumentException
     *
     */
}

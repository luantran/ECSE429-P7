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
     * - Done with Map with one value in root
     * - Verify --> get an IllegalArgumentException
     *
     */
	
	/*
	 * Testing for method doPut; will test through method Put
	 * 
	 * Test Case 3:
	 * - Need cmp < 0 --> key in root must be greater than the key in value
	 * - Done with Map with one value in root
	 * - Verify:
	 * 	- the left child has the same key and value pair as the one passed in the put
	 * 	- the right child is null
	 * 
	 */
	
	/*
	 * Testing for method doPut; will test through method Put
	 * 
	 * Test Case 4:
	 * - Need cmp > 0 --> key in root must be less than the key in value
	 * - Done with Map with one value in root
	 * - Verify:
	 * 	- the right child has the same key and value pair as the one passed in the put
	 * 	- the left child is null
	 * 
	 */
	
	/*
	 * Testing for method doPut; will test through method Put
	 * 
	 * Test Case 5:
	 * - Need:
	 * 	- cmp < 0 --> key in root must be greater than the key in value
	 * 	- Key of the left node, new "node", needs to be greater than the key in value
	 * - Done with Map with one value in root, and root with a left child
	 * - Verify:
	 * 	- verify that the right child is null
	 *  - that there exist a left child
	 *  	- put this in a new variable
	 * 	- the new left child has the same key and value pair as the one passed in the put
	 * 	- the new right child is null
	 * 
	 */
	
	/*
	 * Testing for method doPut; will test through method Put
	 * 
	 * Test Case 6:
	 * - Need:
	 * 	- cmp > 0 --> key in root must be less than the key in value
	 * 	- Key of the right node, new "node", needs to be less than the key in value
	 * - Done with Map with one value in root, and root with a right child
	 * - Verify:
	 * 	- verify that the left child is null
	 *  - that there exist a right child
	 *  	- put this in a new variable
	 * 	- the new right child has the same key and value pair as the one passed in the put
	 * 	- the new left child is null
	 * 
	 */
	
}

package data;

import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bidimap.TreeBidiMap;

public class TreeBidiMapData {
	
	public TreeBidiMap emptyTreeBidiMap(){
		
		TreeBidiMap emptyMap = new TreeBidiMap();
		return emptyMap;
		
	}
	
	public TreeBidiMap withRootOnlyBidiMap() {
		
		TreeBidiMap mapRoot = new TreeBidiMap<>();
		mapRoot.put(5, 10);
		return mapRoot;
		
	}
	
	public TreeBidiMap valueOnLeftChild() {
		
		TreeBidiMap leftChildMap = new TreeBidiMap();
		leftChildMap.put(5, 10);
		leftChildMap.put(3, 27);
		return leftChildMap;
		
	}
	
	public TreeBidiMap valueOnRightChild() {
		
		TreeBidiMap rightChildMap = new TreeBidiMap();
		rightChildMap.put(5, 10);
		rightChildMap.put(7, 12);
		return rightChildMap;
	}
	
public TreeBidiMap bigBidiMap() { //Testing testInverseBidiMap
		
		TreeBidiMap bigBidiMap = new TreeBidiMap();
		bigBidiMap.put(5, 10);
		bigBidiMap.put(7, 12);
		bigBidiMap.put(3, 27);
		bigBidiMap.put(12, 80);
		bigBidiMap.put(1, 45);
		bigBidiMap.put(24, 3);
		bigBidiMap.put(15, 13);

		return bigBidiMap;
	}

//Key modification testing doEquals
public TreeBidiMap bigBidiMap2() { 
	
	TreeBidiMap bigBidiMap2 = new TreeBidiMap();
	bigBidiMap2.put(5, 10);
	bigBidiMap2.put(7, 12);
	bigBidiMap2.put(6, 27);
	bigBidiMap2.put(77, 80);
	bigBidiMap2.put(4, 45);
	bigBidiMap2.put(2, 3);
	bigBidiMap2.put(8, 13);

	return bigBidiMap2;
}
//Key modification from ints to String for doEquals Tests
public TreeBidiMap bigBidiMap3() { 
	
	TreeBidiMap bigBidiMap3 = new TreeBidiMap();
	bigBidiMap3.put("seven", 7);
	bigBidiMap3.put("six", 6);
	bigBidiMap3.put("five", 5);
	bigBidiMap3.put("four", 4);
	bigBidiMap3.put("three", 3);
	bigBidiMap3.put("two", 2);
	bigBidiMap3.put("one", 1);

	return bigBidiMap3;
}

public TreeBidiMap fourLevelBidiMap() {
	TreeBidiMap<Integer, Integer> fourLevelTree = new TreeBidiMap<Integer, Integer>();
	fourLevelTree.put(13, 13);
	fourLevelTree.put(8, 8);
	fourLevelTree.put(32, 32);
	fourLevelTree.put(5, 5);
	fourLevelTree.put(10, 10);
	fourLevelTree.put(23, 23);
	fourLevelTree.put(37, 37);
	fourLevelTree.put(1, 1);
	fourLevelTree.put(6, 6);
	fourLevelTree.put(9, 9);
	fourLevelTree.put(12, 12);
	fourLevelTree.put(15, 15);
	fourLevelTree.put(25, 25);
	fourLevelTree.put(34, 34);
	fourLevelTree.put(43, 43);

	return fourLevelTree;
	
}
	
	public TreeBidiMap<Integer, Integer> twoLevelBidiMap() {
		
		TreeBidiMap<Integer, Integer> twolevelTree = new TreeBidiMap<Integer, Integer>();
		twolevelTree.put(20, 55);
		twolevelTree.put(10, 15);
		twolevelTree.put(30, 29);
		
		return twolevelTree;
		
	}
	
	

}

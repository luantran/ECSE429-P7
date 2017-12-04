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
	
	public TreeBidiMap twoLevelBidiMap() {
		
		TreeBidiMap twolevelTree = new TreeBidiMap();
		twolevelTree.put(20, 55);
		twolevelTree.put(10, 15);
		twolevelTree.put(30, 29);
		
		return twolevelTree;
		
	}
	
	

}

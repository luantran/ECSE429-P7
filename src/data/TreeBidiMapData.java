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
	
	

}

package data;

import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bidimap.TreeBidiMap;

public class TreeBidiMapData {
	
	public BidiMap emptyTreeBidiMap(){
		
		BidiMap emptyMap = new TreeBidiMap();
		return emptyMap;
		
	}
	
	public BidiMap withRootBidiMap() {
		
		BidiMap mapRoot = new TreeBidiMap<>();
		mapRoot.put(5, 10);
		return mapRoot;
		
	}
	
	public BidiMap valueOnLeftChild() {
		
		BidiMap leftChildMap = new TreeBidiMap();
		leftChildMap.put(5, 10);
		leftChildMap.put(3, 27);
		return leftChildMap;
		
	}
	
	public BidiMap valueOnRightChild() {
		
		BidiMap rightChildMap = new TreeBidiMap();
		rightChildMap.put(5, 10);
		rightChildMap.put(7, 12);
		return rightChildMap;
	}
	
	

}

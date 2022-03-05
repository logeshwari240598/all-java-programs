package com.Collection;

import java.util.TreeMap;

public class HTreeMap {
	
	//stored in sorting order 
	//null values are not allowed because of sorting order
	public void Treemap() {
		
		TreeMap<Integer, String>treemap=new TreeMap<Integer, String>();
		treemap.put(6, "logi");
		treemap.put(9, "kavi");
		treemap.put(5, "ammu");
		treemap.put(7, "pattu");
		System.out.println("treemap: "+treemap);
		
		
	}
	
	public static void main(String[] args) {
		HTreeMap map=new HTreeMap();
		map.Treemap();
		
	}

}

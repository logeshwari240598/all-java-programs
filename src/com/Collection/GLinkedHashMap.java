package com.Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class GLinkedHashMap {
	
	//same method are followed hashmap
	//insertion order main in linkedhashmap
	//null values are allowed 
	//null values are allowed and override the two null values also
	public void Linkedhashmap() {
		LinkedHashMap<Integer, String> linkedhashmap=new LinkedHashMap<Integer, String>();
		linkedhashmap.put(24, "logi");
		linkedhashmap.put(18, "dinesh");
		linkedhashmap.put(31, "jayan");
		linkedhashmap.put(30, "malai");
		System.out.println("linkedhashmap put values " +linkedhashmap);
		
		LinkedHashMap<String, String> hashmap=new LinkedHashMap<String, String>();
		hashmap.put("ammu", "logi");
		hashmap.put("din", "dinesh");
		hashmap.put("jayanthi", "jayan");
		hashmap.put("elumalai", "malai");
		hashmap.put("null", "malai");
		hashmap.put("null", "null");
		
		System.out.println("hashmap put values " +hashmap);
	}
	
	public static void main(String[] args) {
		
		GLinkedHashMap map=new GLinkedHashMap();
		map.Linkedhashmap();
		
	}

}

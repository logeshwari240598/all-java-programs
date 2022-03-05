package com.Collection;

import java.util.HashMap;

public class FHashMap {
	
	//insertion order is not mained
	//null values are allowed and override the two null values also
	public void Hashmap() {
		
		HashMap<Integer, String> hashmap=new HashMap<Integer, String>();
		hashmap.put(24, "logi");
		hashmap.put(18, "dinesh");
		hashmap.put(31, "jayan");
		hashmap.put(30, "malai");
		hashmap.put(null, "malai");
		hashmap.put(null, "null");
		System.out.println("hashmap put values " +hashmap);
		
		//To make a copy of the existing map
		HashMap<Integer, String> duplicateMap=new HashMap<Integer, String>();
		duplicateMap.putAll(hashmap);
		System.out.println("duplicateMap " +duplicateMap);
		
		//clear to delete the map contents
		duplicateMap.clear();
		System.out.println("After clearing " +duplicateMap);
		
		//To check if a key is present or not in the map
		System.out.println("Does this map has key 24? "+hashmap.containsKey(24) );
		
		//To check if a value is present or not in the map
	    System.out.println("Does this map has key jayan? "+hashmap.containsValue("jayan") );
	    
	    //clone if the map
	    System.out.println("cloned map "+hashmap.clone());
	    
	    //isempty
	    System.out.println("the map isempty "+hashmap.isEmpty());
	    
	    //Fetch the set of keys in the Map 
	    //Because list will allow duplicate but set won't. Key should be unique.
	    System.out.println("key set "+hashmap.keySet());
	    
	    //fetch value
	    System.out.println(hashmap.get(18));
	    
	    //fetch all the values
	    System.out.println("all values "+hashmap.values());
	    
	    //Entry set
	    System.out.println(hashmap.entrySet());
		
		
	}
	
	
	
	public static void main(String[] args) {
		FHashMap map=new FHashMap();
		map.Hashmap();
		
		
		
	}

}

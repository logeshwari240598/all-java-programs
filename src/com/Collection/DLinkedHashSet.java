package com.Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class DLinkedHashSet {

	//insertion order has mained
	//duplicate value not allowed
public void Linkedhashset() {
		
	LinkedHashSet<String> hash=new LinkedHashSet<String>();
		hash.add("A");
		hash.add("A");
		hash.add("B");
		hash.add("C");
		hash.add("D");
		hash.add("E");
		hash.add(null);
		hash.add("F");
		System.out.println(hash);
		
		hash.remove("A");
		System.out.println(hash);
	}
	
	public static void main(String[] args) {
		DLinkedHashSet set=new DLinkedHashSet();
		set.Linkedhashset();
	}

}

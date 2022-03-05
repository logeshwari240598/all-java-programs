package com.Collection;

import java.util.HashSet;
import java.util.Iterator;

public class CHashSet {
	
	//insertion order not mained
	//duplicate value not allowed
	//Null allowed
	
	public void hashset() {
		
		HashSet<String>hash=new HashSet<String>();
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
	
		
		public void iterator() {
		//iterate using iterator
		HashSet<String>hash1=new HashSet<String>();
		hash1.add("A");
		hash1.add("A");
		hash1.add("B");
		hash1.add("C");
		hash1.add("D");
		hash1.add("E");
		hash1.add(null);
		hash1.add("F");
		
		Iterator<String>  iterator=hash1.iterator();
		while(iterator.hasNext()) {
			System.out.println("Element of Hashset :"+ iterator.next());
		}
		}
	
	
	public static void main(String[] args) {
		
		CHashSet CHashSet=new CHashSet();
		CHashSet.hashset();
		CHashSet. iterator();
		
	}

}

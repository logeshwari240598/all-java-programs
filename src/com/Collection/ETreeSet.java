package com.Collection;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ETreeSet {
	
	//null values are not allowed
	//duplicate value not allowed
	
	public void Treeset() {
		
		TreeSet<String>treeSet=new TreeSet<String>();
		
		    treeSet.add("A");
		    treeSet.add("A");
		    treeSet.add("B");
		    treeSet.add("C");
		    treeSet.add("D");
		    treeSet.add("E");
			treeSet.add("z");
		  //treeSet.add(null);
			System.out.println(treeSet);
			
			//remove
			treeSet.remove("A");
			System.out.println(treeSet);
			
			//first element
			System.out.println("first element :"+ treeSet.first());
			
		}
	
	public static void main(String[] args) {
		ETreeSet tree=new ETreeSet();
		tree.Treeset();
		
	}

}

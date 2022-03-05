package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AArrayList {
	   
	   // duplicate values are allowed
	   // null values are allowed
	   //we have list iterator and iterator methods
       public void arrayListExample() {
    	   
		List <String> arrayList= new ArrayList<String>();
		arrayList.add("logi");
		arrayList.add("jayan");
		arrayList.add("ammu");
		arrayList.add("malai");
		arrayList.add("malai");
		arrayList.add(null);
		System.out.println(arrayList);
		
	    System.out.println("***************************************************************");
		
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.indexOf("logi"));
		System.out.println(arrayList.lastIndexOf("malai"));
		
	    System.out.println("***************************************************************");
		
		List<String>anotherlist=new ArrayList<String>();
		anotherlist.addAll(arrayList);
		System.out.println(anotherlist);
		
		System.out.println("***************************************************************");
		
		anotherlist.clear(); 
	    System.out.println(anotherlist);
	    
	    System.out.println("***************************************************************");
	    
	    arrayList.remove(0);
	    System.out.println(arrayList);
	    
	    System.out.println("***************************************************************");
	    
	    arrayList.remove("ammu");
	    System.out.println(arrayList);
	    
	    System.out.println("***************************************************************");
	    
	    arrayList.add(null);
	    System.out.println(arrayList);
	    
	    System.out.println("***************************************************************");
	    
	    arrayList.set(0,"dinesh");
	    System.out.println(arrayList);
	    
	    System.out.println("***************************************************************");
	    
	    System.out.println(arrayList.isEmpty());
	    
	    System.out.println("***************************************************************");
	    
	    //Iterate
	    
	    for (String string : arrayList) {
	    	System.out.println("Using for each :" +string);
			
		}
	    
	    System.out.println("***************************************************************");
	    
	    for(int i=0;i<arrayList.size();i++) {
	    	System.out.println("Using for loop :" +arrayList.get(i));
	    	
	    }
	    
	    System.out.println("***************************************************************");
	    
	    ListIterator<String> iterator=arrayList.listIterator();
	    
	    while(iterator.hasNext()) {
	    	System.out.println("list iterator :" +iterator.next());
	    }
	    
	    System.out.println("***************************************************************");
	    
	    
	    while(iterator.hasPrevious()) {
	    	System.out.println("list iterator :" +iterator.previous());
	    	
	    }
	    
	    System.out.println("***************************************************************");
	    
	    Iterator<String>iterator1=arrayList.iterator();
	    while(iterator1.hasNext()) {
	    	System.out.println(iterator1.next());
	    }	
		
       }	
	
        public static void main(String[] args) {
			
        	AArrayList example= new AArrayList(); 
        	 example.arrayListExample();

	}
	
	

}

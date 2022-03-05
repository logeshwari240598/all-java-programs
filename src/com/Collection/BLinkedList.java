package com.Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BLinkedList {
	//In Linkedlist using iterator 
	public void linkedlist(){
		
		LinkedList<String> linkedlist=new LinkedList<String>();
		
		//adding
		linkedlist.add("pink");
		linkedlist.add("blue");
		linkedlist.add("white");
		linkedlist.add("red");
		linkedlist.add("black");
		
		System.out.println("adding colours :" +linkedlist);
		
		//Add an element to the first position
		linkedlist.addFirst("flowers colors");
		System.out.println(linkedlist);
		
		//Add an element to the last position
		linkedlist.addLast("flowers are looking wonderful");
		System.out.println(linkedlist);
		
		//get the first value 
		System.out.println(linkedlist.get(0));
		System.out.println(linkedlist.get(3));
		
		//removeFirst and removeLast
		System.out.println("Remove first :"+linkedlist.removeFirst());
		System.out.println("Remove first :"+linkedlist.removeLast());
		
		//poll method and pollfirst() deletes the first element in the list
		System.out.println(linkedlist.poll());
		System.out.println(linkedlist);
		
		//pollLast deletes the last
		linkedlist.pollLast();
		System.out.println(linkedlist);
		
		//remove deletes the first element
		linkedlist.remove();
		System.out.println(linkedlist);
		
		//removeFirstOccurrence
		linkedlist.removeFirstOccurrence("pink");
		System.out.println("After removing the first Occurrence of pink "+linkedlist);
		
		linkedlist.removeLastOccurrence("black");
		System.out.println("After remove Last Occurrence of black "+linkedlist);
		
		
		System.out.println("**************************************************************************");	
		
	}
	
	public void iterateLinkedListWithSimpleFor() {
		
		LinkedList<Integer>linklist1=new LinkedList<Integer>();
		linklist1.add(1);
		linklist1.add(2);
		linklist1.add(3);
		linklist1.add(4);
		linklist1.add(5);
		System.out.println(linklist1);
		
		System.out.println("**************************print for loop********************************");
		
		for(int i=0; i<linklist1.size(); i++) {
			
			System.out.println("Element in the LL are "+ linklist1.get(i));	
		}
		
		System.out.println("***********************************************************************");
	}
	
	
	public void iterationwithAdvancedFor() {
		
		LinkedList<Integer>linklist2=new LinkedList<Integer>();
		linklist2.add(1);
		linklist2.add(2);
		linklist2.add(3);
		linklist2.add(4);
		linklist2.add(5);
		for(Integer integer :linklist2) {
			System.out.println(integer);
		}
		System.out.println("***********************************************************************");
	}
		
		public void Iterateusingwhile() {
			//Iterate using while
			LinkedList<Integer>linklist3=new LinkedList<Integer>();
			linklist3.add(6);
			linklist3.add(7);
			linklist3.add(8);
			linklist3.add(9);
			linklist3.add(10);
			
			int i=0;
			while(linklist3.size()>i){
				System.out.println("Element in the wh are "+linklist3.get(i));
				i++;
			}
			System.out.println("###############################################################");
			Iterator<Integer>iterator=linklist3.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		System.out.println("###############################################################");	
		}
	
	
	public static void main(String[] args) {
		BLinkedList list=new BLinkedList();
		list.linkedlist();
		list.iterateLinkedListWithSimpleFor();
		list.iterationwithAdvancedFor();
		list.Iterateusingwhile();
	}
	
	//using do while and iterator also   
	
	

}

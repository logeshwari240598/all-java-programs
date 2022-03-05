package com.JavaBasic;

public class StringBuffer18 {
	
	public static void main(String[] args) {
		
		//To demonstrate the string buffer is mutable.
		
		System.out.println("string is immutable");
		String name="logi";
		System.out.println("Appending : "+name.concat("ammu"));
		System.out.println("origninal name : "+name);
		
		System.out.println("**************************************************");
		
		System.out.println("stringBuffer is mutable"); 
		StringBuffer name1=new StringBuffer("logi");
		System.out.println("Appending : "+name1.append("ammu"));
		System.out.println("origninal name : "+name1);
		
		System.out.println("**************************************************");
		
		//stringBuffer methods
		
		//Reverse
		System.out.println("reversed name: "+name1.reverse());
		
		//Replace
		StringBuffer replace=new StringBuffer("pattu");
		System.out.println(replace.replace(0, 5, "ammu"));
		
		//delete 
		StringBuffer delete=new StringBuffer("pattu");
		System.out.println(delete.delete(0, 3));
		
		//Insert
		StringBuffer Insert=new StringBuffer("pattu");
		System.out.println(Insert.insert(5, "ma"));      
		
		//capacity
		System.out.println(Insert.capacity());
		
		 //same methods are applicable this to methods are:
		 //StringBuffer
		 //StringBuilder
		
	} 
	
	

}

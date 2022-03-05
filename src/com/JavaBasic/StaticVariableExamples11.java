package com.JavaBasic;

public class StaticVariableExamples11 {
	
	static int acountbalance;
	String depositedBy;
	
	public static void main(String[] args) {
		
		StaticVariableExamples11 object1=new StaticVariableExamples11();
		
		object1.acountbalance=1234;
		object1.depositedBy="logi";
		
		StaticVariableExamples11 object2=new StaticVariableExamples11();
		object2.acountbalance=12397;
		object2.depositedBy="ammu";
		
		
		System.out.println("object1 integer:" + object1.acountbalance);
		System.out.println("object1 integer:" + object1.depositedBy);
		System.out.println("object2 integer:" + object2.acountbalance);
		System.out.println("object2 integer:" + object2.depositedBy);
		
		
	}

}

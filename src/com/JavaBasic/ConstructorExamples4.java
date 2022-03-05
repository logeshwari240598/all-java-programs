package com.JavaBasic;

//No argument constructor 
public class ConstructorExamples4 {
	
	int employeeid;
	String employeeName;
	
	ConstructorExamples4(){
		employeeid=1;
		employeeName="logi";
		System.out.println("employeeid " + employeeid);
		System.out.println("employeeName " + employeeName);
		System.out.println("create employee deatails");
	}
	
	
	public static void main(String[] args) {
		
		ConstructorExamples4 emp=new ConstructorExamples4();
	
		
	}

}

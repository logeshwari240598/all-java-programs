package com.JavaBasic;

//Non parameterized constructor
public class ConstructorExamples5 {
	
	String Mom_name;
	String Dad_name;
	
	ConstructorExamples5(String mom , String dad){
		Mom_name=mom;
		Dad_name=dad;
		
	}
	
	public void sayaboutparent(){
		System.out.println("mom is " + Mom_name);
		System.out.println("dad is " + Dad_name);
		
	}
	
	public static void main(String[] args) {
		ConstructorExamples5 parent= new ConstructorExamples5("jayan","malai");
		parent.sayaboutparent();
		
		ConstructorExamples5 parent2= new ConstructorExamples5("jayanthi","elumalai");
		parent2.sayaboutparent();
	}

}

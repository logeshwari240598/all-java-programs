package com.JavaBasic;

public class ConstructorExamples6 {
	
	String draw;
	
	ConstructorExamples6(){
		System.out.println("Draw object created");
		
	}
	
	ConstructorExamples6(String todraw){
		draw= todraw;
		System.out.println("Drawing " + todraw);
		
		
	}
	
	public static void main(String[] args) {
		ConstructorExamples6 draw=new ConstructorExamples6();
		ConstructorExamples6 draw1=new ConstructorExamples6("logi");
		
		
	}

}

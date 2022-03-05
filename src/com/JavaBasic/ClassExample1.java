package com.JavaBasic;

public class ClassExample1 {
	
	int Howmanyclass=12345678;
	
	String classname="logi";
	
	int marks=350;
	
	public void getmarks() {
		System.out.println("class is "+ marks);
	}
	
	public void getclassname() {
		System.out.println("class is "+ classname);
	}
	
	public void getHowmanyclass() {
		System.out.println("class is "+ Howmanyclass);
	}
	
	
	
	public static void main(String[] args) {
		
		//classname objectname= new classname();
		
		ClassExample1 classes= new ClassExample1();
		classes.getmarks();
		classes.getHowmanyclass();
		classes.getclassname();
		
		
		
		
		
	}

}

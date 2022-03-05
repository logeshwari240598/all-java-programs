package com.JavaBasic;

//Example for default constructor.
public class ConstructorsExamples3 {
	
	String Student_name; //String --> means null will be print 
	int rollno; //datatype --> means 0 will be print
	boolean stud; //boolean --> means false will be print

	
	public static void main(String[] args) {
		
		ConstructorsExamples3 std = new ConstructorsExamples3();
		
		System.out.println(std.Student_name);
		System.out.println(std.rollno);
		System.out.println(std.stud);

		
	}

}

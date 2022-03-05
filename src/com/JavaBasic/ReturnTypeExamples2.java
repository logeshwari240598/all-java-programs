package com.JavaBasic;

public class ReturnTypeExamples2 {
	
	int collectedAmount=1000;
	
	public int collectAmontAndGiveItToMe() {
		System.out.println("daddy have collect rupees " + collectedAmount);
		return collectedAmount;
	}
	 
	public static void main(String[] args) {
		
		ReturnTypeExamples2 collect = new ReturnTypeExamples2();
		int amount =collect.collectAmontAndGiveItToMe();
		System.out.println("my son i have collected the amount "+amount);
		
		
		
	}

}

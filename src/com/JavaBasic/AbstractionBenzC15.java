package com.JavaBasic;

public class AbstractionBenzC15 extends AbstractionCarA15{
	
	@Override
	public void enginesecret() {
		System.out.println("Benz enginesecret");
	}
	
	@Override
	public void company() {
		System.out.println("Benz company");
	}
	
	
	
	public static void main(String[] args) {
		
		AbstractionCarA15 CarA15= new AbstractionBenzC15();
		CarA15.company();
		CarA15.enginesecret();
		
		
	}

}

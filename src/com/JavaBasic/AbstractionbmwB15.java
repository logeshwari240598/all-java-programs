package com.JavaBasic;

public class AbstractionbmwB15 extends AbstractionCarA15 {
	
	@Override
	public void enginesecret() {
		System.out.println("bmw engine secret");
	}
	
	@Override
	public void company() {
		System.out.println("bmw company vault");
	}
	
	public static void main(String[] args) {
	
		AbstractionCarA15 AbstractionCarA15=new AbstractionbmwB15();
		AbstractionCarA15.company();
		AbstractionCarA15.enginesecret();
		
		
		
	}

}

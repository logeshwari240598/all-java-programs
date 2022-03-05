package com.JavaBasic;

public class OverridingSon14 extends OverridingParent14 {
	
    @Override 
	public void ToGiveOrNot() {
    	System.out.println("I want properites!!");
    	 
     }
	
	
	public static void main(String[] args) {
		
		OverridingParent14 OverridingParent14=new OverridingSon14(); //parentclass refName=new Childclass();
		OverridingParent14.properties();	
		OverridingParent14.ToGiveOrNot(); 
		
	}

}
 
package com.JavaBasic;

public class PolymorphismOverloading13 {
	
	public void talk(String speakingStyle) {
       System.out.println("polite and respectfull");
	}
	
	public void talk(int speakingStyle) {
	       System.out.println("speak carring");
		}
	
	public void talk(float speakingStyle) {
	       System.out.println("Nothing personal!");
		}

	
    public static void main(String[] args) {
    	
    	PolymorphismOverloading13 talk=new PolymorphismOverloading13();
    	String String=new String();
    	talk.talk(String);
    	
		
	}
}

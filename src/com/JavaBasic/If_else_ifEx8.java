package com.JavaBasic;

public class If_else_ifEx8 {
	
	String MyheroName="Malai";
	
	public void Guessmysuperhero() {
		if(MyheroName.equalsIgnoreCase("logi")) { //if(MyheroName.equalsIgnoreCase("malai")) {
			System.out.println("you thought about logi"); //	System.out.println("you thought about malai");
		}else if(MyheroName.equals("jayan")) {
			System.out.println("you thought about jayan");	
		}else if(MyheroName.equals("dinesh")) {
			System.out.println("you thought about dinesh");	
		}else {
			System.out.println("sorry i cant guess!!!");
		}

	}
	
	public static void main(String[] args) {
		If_else_ifEx8 hero=new If_else_ifEx8();
		hero.Guessmysuperhero();
		
	}

}

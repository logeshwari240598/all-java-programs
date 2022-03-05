package com.JavaBasic;

public class StringEx17 {
	
	 public static void main(String[] args) {
		
		 String name="logiammuma"; //string literal
		 int number=3;
		 
		 //returns character value for the particular index
		 System.out.println(name.charAt(1));
		 
		 //returns string length
		 System.out.println(name.length());
		 
		 //checks the equality of string with the given object.
		 System.out.println(name.equals("logi"));
		 
		 //checks the equality of string with the given string object without case sensitivity
		 System.out.println(name.equalsIgnoreCase("logiAmmu"));
		 
		 //checks if string is empty or not.
		 System.out.println(name.isEmpty());
		 
		 //returns true or false based on the given value is present or not.
		 System.out.println(name.contains("logi"));
		 
		 //take a particular portion of the string
		 System.out.println(name.substring(1));
		 
		 //take a particular portion of the string begin and end index
		 System.out.println(name.substring(0, 6));
		 
		 //appends the string to the given string
		 System.out.println(name.concat(" malai"));
		 
		 //replaces the existing char with given char
		 System.out.println(name.replace("l", "y"));
		 
		 //find the position of a character in the string
		 System.out.println(name.indexOf("l"));
		 
		 //finds the character specified from the index position
		 System.out.println(name.indexOf("a", 5));
		 
		 //Trim will remove the white spaces before and after
		 System.out.println(name.trim());
		 
		 //convert the given data type to string 
		 //System.out.println(name.String.valueOf(number));
		 
		 //string upperCase 
		 String uppercase = "LOGESHWARI";
		 System.out.println(uppercase.toLowerCase());
		 
		 //string lowercase
		 String lowercase = "logeshwari";
		 System.out.println(lowercase.toUpperCase());
		 
		 //return a joined string with given delimiter
		 System.out.println(String.join("-", "l","o","g","i","a","m","m","u","24","05"));
		 
		 //split
		 String splitThis="Am,I,teaching,good?";
		 String [] splittedWords=splitThis.split(",");
		 for(String string:splittedWords) {
			 System.out.println(string);
		 }
				 
		 
		 
		 
	}

}

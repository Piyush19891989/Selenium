package Programs;

import java.util.ArrayList;

//Java Program to replace lower-case characters with upper-case and vice-versa
public class ReplaceLowercasetoupper {

	public static void main(String[] args) {
	
	String str = "Great Power" ;
	
	StringBuffer str1 = new StringBuffer(str) ;
	
	for ( int i = 0 ; i < str1.length() ; i++ ) {
		
		if (Character.isLowerCase(str1.charAt(i))) {
			str1.setCharAt(i,Character.toUpperCase(str1.charAt(i)));
		}else {
			str1.setCharAt(i, Character.toLowerCase(str.charAt(i)));
		}
	}
   
	
	System.out.println(str1) ;
   
	}

}

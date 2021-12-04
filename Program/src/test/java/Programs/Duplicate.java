package Programs;

import java.util.HashSet;

//Java program to find the duplicate characters in a string
public class Duplicate {

	public static void main(String[] args) {

		String str = "Great responsibility";
	    int Count ;
	    
	    char string[] = str.toCharArray() ;
	    
	    for (int i = 0 ; i <string.length ; i++) {
	    	Count = 1 ;
	    	for ( int j = i+1 ; j < string.length ; j++) {
	    		
	    	 if (string[i]==string[j] && string[i]!='0')  {
	    		 Count = Count + 1 ;
	    		 string[j] ='0' ;
	    	 }
	    	}
	    	
	    	if (Count > 1) {
	    		System.out.println(string[i]) ;
	    	}
	    }

	}

}

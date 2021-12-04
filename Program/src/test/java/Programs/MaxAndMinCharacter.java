package Programs;

import java.util.ArrayList;

//Java Program to find maximum and minimum occurring character in a string.
public class MaxAndMinCharacter {

	public static void main(String[] args) {
		String str = "grass is greener on the other side";
		int a[] = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			a[i] = (int) ch;

		}
      for ( int i = 0 ; i <a.length ; i++) {
    	  for ( int j = i+1 ; j < a.length ; j++) {
    		  if (a[i]>a[j]  && a[i]!=' ' && a[j] !=' ') {
    			 int temp = a[i] ;
    			 a[i] = a[j] ;
    			 a[j] = temp ;
    	
    		  }
    	  }
      }
      
  
      System.out.println("Minimum character-->"+(char)(a[0])) ;
    //  System.out.println("Maximum character-->"+(char)a[str.length()-1]) ;
   
      
      
	}
}

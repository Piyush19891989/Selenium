package Programs;

import java.util.ArrayList;

//Java Program to find the frequency of characters
public class FrequencyCharacter {

	public static void main(String[] args) {
		String str = "picture perfect"; 
	
		ArrayList<Character> a1 = new ArrayList<Character>() ;
		int Count = 1 ;
		for ( int i =0 ; i < str.length() ; i++) {
			a1.add(str.charAt(i)) ;
		}
	
		for (int i = 0 ; i < a1.size() ; i++) {
			for (int j = i+1 ; j < a1.size() ;j++) {
	      if ( a1.get(i).equals(a1.get(j)) && a1.get(j)!='0') {
	    	  Count++ ;
	    	  a1.remove(j);
	      }
	     
			}
			
			  System.out.println("Character-->"+a1.get(i));
				System.out.println("Count-->"+Count) ;
				Count = 1 ;
			
			
		}
	}

}

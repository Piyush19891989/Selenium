package Programs;
//Java Program to replace the spaces of a string with a specific character
public class ReplaceSpacewithcharacter {

	public static void main(String[] args) {
		 String Str1 = "Once in a blue moon";  
		 char ch = '-' ;
      StringBuffer str = new StringBuffer(Str1) ;
      for ( int i = 0 ; i < str.length() ; i++) {
    	  if (str.charAt(i)==' ') {
    		  str.setCharAt(i, ch);
    	  }
      }
      System.out.println(str) ;
	}

}

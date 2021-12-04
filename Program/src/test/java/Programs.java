import java.util.ArrayList;
import java.util.Scanner;

public class Programs {
	
	 public static String getSmallestAndLargest(String s, int k) {
	     
	      String Str1 = s.substring(0, k) ;    
	    String Smallest = Str1 ;
	    String Largest = Str1 ;
	     
	     for(int i = 1 ; i <=s.length()-k ; i++) {     
	              Str1 = s.substring(i,i+k) ;
	              
	              if(Str1.compareTo(Smallest) < 0 ) {
	                  Smallest = Str1 ;
	              }
	              
	              if (Str1.compareTo(Largest) > 0) {
	                  Largest = Str1 ;
	              }
	              
	            
	         
	        
	     } 
	        
	        
	       return Smallest + "\n" + Largest;
	    }
	     

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
}

}

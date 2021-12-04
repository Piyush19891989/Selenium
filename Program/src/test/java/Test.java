import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test    {
	 
 
	public static void main(String[] args) throws NumberFormatException, IOException {
	      
		  Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        
	     //   String A="Hello" ;
	     //   String B="Java";
	        
	        int len1 = A.length() ;
	        int len2 = B.length() ;
	        
	        System.out.println(len1+len2) ;
	        
	        if(A.compareTo(B) > 0) {
	        	System.out.println("Yes") ;
	        }else {
	        	System.out.println("No") ;
 	        }
	      
	      // String sd2= A.substring(0,1).toLowerCase()+A.substring(1) ;
	      String sd1= A.substring(0,1).toLowerCase()+A.substring(1) ;
	      String sd2= B.substring(0,1).toLowerCase()+B.substring(1) ;
	      
	      System.out.println(sd1+" "+sd2) ;
	        
	         
	      
	}
       
}

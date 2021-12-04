import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TestClass {

	public static void main(String[] args) throws IOException {
	 
	
	String s1= "everyone loves java" ;
	boolean FoundSpace = true ;
	char[] ch1 = s1.toCharArray() ;

	for(int i = 0 ; i < ch1.length ; i++) {
		
		if(Character.isLetter(ch1[i])) {
			
			if(FoundSpace==true) {
			ch1[i]=Character.toUpperCase(ch1[i]);
			FoundSpace = false ;
			}
		}
	
	else {
		FoundSpace = true ;
	}
	}
	
	//Convert to char to string
	String Message = String.valueOf(ch1) ;
  
	System.out.println(Message) ;
 	}
}

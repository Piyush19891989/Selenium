package Programs;

//Java Program to remove all the white spaces from a string
public class RemoveWhileSpaces {

	public static void main(String[] args)  {
	String str = "Hi How are you" ;
	String str1 ;
    str1 = str.replaceAll("\\s+","") ;
	 System.out.println(str1) ;	
		
	}
}

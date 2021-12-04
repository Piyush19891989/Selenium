package Programs;

//Java Program to determine whether a given string is palindrome
public class Palindrome {

	public static void main(String[] args) {
		   String str = "Kayak"; 
		   String str1 = str.toLowerCase() ;
		   StringBuffer str2 = new StringBuffer(str1) ;
		   str2.reverse() ;
		   
		   if (str1.contains(str2)) {
			   System.out.println("Palindrome") ;
		   }else {
			   System.out.println("Not palindrome");
		   }
	}

}

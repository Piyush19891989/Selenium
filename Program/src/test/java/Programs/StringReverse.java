package Programs;

public class StringReverse {

	public static void main(String[] args) {
		String str = "Dream big";
		int N = str.length() ;
		String ch ="" ;
		for(int i =N-1 ; i >= 0 ; i--) {
         ch = ch + str.charAt(i) ;
		}
     System.out.println(ch) ;
	}

}

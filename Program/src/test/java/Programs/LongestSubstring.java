package Programs;

import java.util.HashSet;

//Longest Substring Without Repeating Characters

public class LongestSubstring {  
  public static void main(String[] args) {
int Right = 0 ;
int Left = 0 ;
int Max = 0 ;
String str =  "abcabcbb" ;
HashSet<Character> h1 = new HashSet<Character>() ;

while(Right < str.length()) {
	char ch = str.charAt(Right) ;
	if (h1.add(ch)) {
		Max = Math.max(Max,Right-Left+1) ;
		Right++ ;
	}else  {
		while(str.charAt(Left)!=ch ) {
				h1.remove(str.charAt(Left)) ;
				Left ++ ;
			}
			
		
		h1.remove(ch) ;
			Left++;
		}
	}
System.out.println(Max) ;

  }

}  
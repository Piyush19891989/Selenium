package Programs;

public class DuplicateWords {

	public static void main(String[] args) {
		   String string = "Big black bug bit a big black dog on his big black nose";    
		   String words[] = string.split(" ") ;
		   int Count = 0 ; 
		   for ( int i = 0 ; i <words.length ; i++) {
			   Count = 1 ;
			   for ( int j = i+1 ; j < words.length ; j++) {
				
				   if (words[i].equals(words[j]) && words[j]!="0") {
					  Count++ ;
					  words[j] = "0" ;
				   }
			   }
			   if(Count > 1 )    {
	                System.out.println(words[i]);    
	        }   
			   
			   }
			  
		   

	}

}

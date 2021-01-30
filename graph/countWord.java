package graph;

public class countWord {
	public static int countWords(String str){ 
        
      // Check if the string is null 
      // or empty then return zero 
      if (str == null || str.isEmpty()) 
          return 0; 
      int wordCount = 0;
      for(int i = 0; i < str.length()-1; i++) {  
          //Counts all the spaces present in the string  
          //It doesn't include the first space as it won't be considered as a word  
          if(str.charAt(i) == ' '&& (i > 0)){  
              wordCount++;
              System.out.println(i);
          }  
      }  
      return wordCount; 
  } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="How many egge are in a half-dozane, 13?"; 
		          
		        // Print the result 
		        System.out.println("No of words : " + 
		           countWords(str)); 
	}

}

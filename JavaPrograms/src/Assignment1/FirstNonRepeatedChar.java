package Assignment1;

public class FirstNonRepeatedChar {
     
	public static void main(String[] args) {
		String input = "college";
      for(int i=0;i<input.length();i++)
      {
    	  boolean firstNonRepeatedChar = true;
    	  for(int j=0;j<input.length();j++)
    	  {
    		  if(i!=j && input.charAt(i)==input.charAt(j))
    		  {
    			  firstNonRepeatedChar = false;
    			  break;
    		  }
    	  }
    	  if(firstNonRepeatedChar==true)
    		  System.out.println("First non-repeated character is:"+input.charAt(i));
    	  break;
    	  
      }
	}

}

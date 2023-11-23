package Basicprograms;

import java.util.Arrays;

public class RepeatedCharacter {

	public static void main(String[] args) {
      String str="she is beautiful";
      char [] ch=str.toCharArray();
      System.out.println("the given string is:"+str);
      System.out.println(Arrays.toString(ch));
      System.out.println("the repeated characters in a string:");
      for(int i=0;i<str.length();i++)
      {
    	  for(int j=i+1;j<str.length();j++)
    	  {
    		  if(ch[i]==ch[j])
    		  {
    			  System.out.println(ch[j]);
    			  break;
    		  }
    		 
    	  }
      }
     //System.out.println("0");
	}

}

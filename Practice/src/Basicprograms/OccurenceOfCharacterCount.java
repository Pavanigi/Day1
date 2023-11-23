package Basicprograms;

import java.util.Scanner;

public class OccurenceOfCharacterCount {

	public static void main(String[] args) {
      String str="pavani";
      int count=0;
//      Scanner sc =new Scanner(System.in);
//      System.out.println("enter letter to search:");
      char ch= 'p';
      for(int i=0;i<str.length();i++)
      {
    	if(str.charAt(i)==ch) 
    	{
    		count++;
    	}
      }
      System.out.println("the repeated character count "+ch+ " is:"+count);
	}

}

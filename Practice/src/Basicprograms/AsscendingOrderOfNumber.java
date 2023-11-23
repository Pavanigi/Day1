package Basicprograms;

import java.util.Arrays;

public class AsscendingOrderOfNumber {

	public static void main(String[] args) {
         
//		String str="124359";
//      char ch[]=str.toCharArray();
       
        int ch[]= {1,2,6,7};
       for(int i=0;i<ch.length;i++)
       {
    	   for(int j=1+i;j<ch.length;j++)
    	   {
    		   if(ch[i]>ch[j])  //  if(ch[j]>ch[i] for descending
    		   {
    			   int temp=ch[i];
    			   ch[i]=ch[j];
    			   ch[j]=(char)temp;
    			   
    		   }
    	   }
       }
       for(int i=0;i<ch.length;i++) {  
       System.out.println(ch[i]);
	}

}
}

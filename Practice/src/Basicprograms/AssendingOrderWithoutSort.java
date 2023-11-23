package Basicprograms;

public class AssendingOrderWithoutSort {

	public static void main(String[] args) {
      
//      String str="pavani";
//		 char []ch=str.toCharArray();
		char []ch= {'a','e','d'};
      for(int i=0;i<ch.length;i++)
      {
    	  for(int j=i+1;j<ch.length;j++)
    	  {
    		  if(ch[i]>ch[j])
    		  {
    			  int temp=ch[i];
    			  ch[i]=ch[j];
    			  ch[j]=(char) temp;
    			 // System.out.println(ch[i]);
    		  }
    	  }
      }
      System.out.println("sorted in assending order");
      for(int i=0;i<ch.length;i++)
      {
    	  System.out.println(ch[i]);
    	  
      }
//      System.out.println();
	}

}

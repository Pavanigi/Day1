package Basicprograms;

public class ReverseNumber {

	public static void main(String[] args) {
       int num=55;
       int rev=0;
       int temp=num;
       while(num>0)
       {
    	   int r=num%10;
    	   rev=rev*10+r;
    	   num=num/10;
       }
       System.out.println(rev);
       if(temp==rev)
       {
    	   System.out.println("palindrome");
       }
       else
       {
    	   System.out.println("not pailndrome");
       }
	}

}

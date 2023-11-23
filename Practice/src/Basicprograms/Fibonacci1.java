package Basicprograms;

import java.util.Scanner;

public class Fibonacci1 {

	public static void main(String[] args) {
		int n=10;
     int [] fibonacci=new int[n];
     fibonacci[0]=0;
     fibonacci[1]=1;
     for(int i=2;i<=n-1;i++)
     {
    	 fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
     }
     for(int i=0;i<=n-1;i++)
     {
     
    	 System.out.println(fibonacci[i]);
 
	}
     Scanner sc =new Scanner(System.in);
     System.out.println("enter index to search:");
     int index=sc.nextInt();
     int fibonaccinum=fibonacci[index];
     System.out.println("the number at index "+index+"is:"+fibonacci[index]);

}
}
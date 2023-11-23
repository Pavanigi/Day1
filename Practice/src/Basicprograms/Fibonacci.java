package Basicprograms;

public class Fibonacci {

	public static void main(String[] args) {
		int n=10;
     int [] fibonacci=new int[n];
     fibonacci[0]=0;
     fibonacci[1]=1;
     
     for(int i=2;i<=n-1;i++)
     {
    	 fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
     }
     System.out.println("fibonacci series are:");
     
     for(int i=0;i<=n-1;i++)
     {
    	 System.out.println(fibonacci[i]);
     }
     int index=4;
     int fibonaccinum=fibonacci[4];
     System.out.println(fibonaccinum);
     

	}

}

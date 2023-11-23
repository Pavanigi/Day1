package Basicprograms;

import java.util.Scanner;

public class EvenOddDigitCount {

	public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     System.out.println("enter number:");
     int num=sc.nextInt();
     int evencount=0;
     int oddcount=0;
     while(num>0)
     {
    	 int digit=num%10;
    	 if(digit%2==0)
    	 {
    		 evencount++;
    	 }
    	 else
    	 {
    		 oddcount++;
    	 }
    	 num=num/10;
     }
     System.out.println("number of even digits in a number:"+evencount);
     System.out.println("number of odd digits in a number:"+oddcount);
	}

}

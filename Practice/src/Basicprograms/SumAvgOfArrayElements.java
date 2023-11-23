package Basicprograms;

import java.util.Scanner;

public class SumAvgOfArrayElements {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of array:");
    int n=sc.nextInt();
    int sum=0;
    float avg;
    int [] arr=new int[n];
    System.out.println("enter the elements:");
    for(int i=0;i<n;i++)
    {
    	arr[i]=sc.nextInt();
    	sum=sum+arr[i];

    }
    System.out.println("sum:"+sum);
    avg=(float)sum/n;
    System.out.println(avg);
    
	}

}

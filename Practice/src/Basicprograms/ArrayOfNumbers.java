package Basicprograms;

public class ArrayOfNumbers {

	public static void main(String[] args) {
       int arr[]= {1,2,4,5};
       int sum=0;
       int average;
       for(int i=0;i<arr.length;i++)
       {
    	   sum=sum+arr[i];
       }
       
       average=sum/arr.length;
       System.out.println(sum);
       System.out.println(average);

	}
	

}

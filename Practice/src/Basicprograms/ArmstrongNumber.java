package Basicprograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num=153;
		int sum=0;
		int temp=num;
		while(num>0)
		{
		  int digit=num%10;
		 // sum+=Math.pow(digit, 4);
		  sum=sum+(digit*digit*digit);
		  num=num/10;
	  }
	  System.out.println(sum);
	  if(temp==sum)
	  {
		  System.out.println("Armsrong number");
	  }
	  else
	  {
		  System.out.println("not armstrong");
	  }

	}

}

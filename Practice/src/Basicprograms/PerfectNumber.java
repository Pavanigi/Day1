package Basicprograms;

public class PerfectNumber {

	public static void main(String[] args) {
    int num=496;
    int sum=0;
    for(int i=1;i<num;i++)
    {
    	if(num%i==0) 
    	{
    	sum=sum+i;
        }
    }
    System.out.println(sum);
    if(sum==num)
    {
    	System.out.println("perfect number");
    }
    else
    {
    	System.out.println("not perfect number");
    }
	}

}

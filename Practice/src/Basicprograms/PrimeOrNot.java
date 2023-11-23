package Basicprograms;

public class PrimeOrNot {

	public static void main(String[] args) {
       
    	
		int n=6;
		boolean flag=false;
		if(n<=1)
		{
			System.out.println("neither prime nor composite");
		}
		else if (n>1)
		{
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					//System.out.println("not a prime number");
					flag=true;
					break;
				}
				
			}
		}
		if(!flag)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
		
	}




	}


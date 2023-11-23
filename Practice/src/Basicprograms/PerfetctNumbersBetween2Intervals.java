package Basicprograms;

public class PerfetctNumbersBetween2Intervals {
	
	public static boolean isPerfect(int num)
	{
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0) 
			{
				sum=sum+i;
			}
			
		}
		if(sum==num)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
     int start=1;
     int end=1000;
     for(int i=start;i<end;i++)
     {
    	 if(isPerfect(i))
    	 {
    		 System.out.println(i);
    	 }
     }

	}

}

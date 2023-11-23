package Basicprograms;

public class ArmstrongNumberTwoIntervals {

	public static void main(String[] args) {
		int start=1;
		int end=500;
		
		System.out.println("armstrong numbers between 1 to 500:");
		for(int i=start;i<=end;i++)
		{
			int sum=0;
			int temp=i;
			while(temp>0)
			{
				int r=temp %10;
				sum+=(r*r*r);
				temp=temp/10;
			}
			if(sum==i)
			{
				System.out.println(i);
			}
		}
		
		
		

	}

}

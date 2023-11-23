package Basicprograms;

public class ReplacingVowelsWithCon {

	public static void main(String[] args) {
     int num=1234;
     int count=0;
     while(num>0)
     {
    	 int digit =num%10;
      if(digit>0)
      {
    	 count++;
      }
      num=num/10;
	}
   System.out.println(count+1);
}
}

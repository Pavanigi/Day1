package Basicprograms;

public class FormNumberUsingEvenOdd {

	public static void main(String[] args) {
     int num=1234569;
     int esum=0;
     int osum=0;
     while(num>0) {
    	 int digit=num%10;
    	 if(digit%2==0)
    	 {
    		 esum=esum*10+digit;
    	 }
    	 else
    	 {
    		 osum=osum*10+digit;
    	 }
    	 num=num/10;
     }
     System.out.println("formed new even number using evendigis:"+esum);
     System.out.println("formed new odd number using odddigis:"+osum);

	}

}

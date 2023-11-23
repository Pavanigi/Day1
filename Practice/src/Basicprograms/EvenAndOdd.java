package Basicprograms;

public class EvenAndOdd {

	public static void main(String[] args) {
     int n1=1;
     int n2=10;
     System.out.println("\n the even numbers  between "+ n1 +" and "+ n2+":\n" );
     for(int i=n1;i<=n2;i++)
     {
    	
    	 if(i%2==0)
    	 {
    		System.out.println(i);
    	 }
    	
     }
	
     System.out.println("\nthe odd numbers are between "+ n1 +" and "+ n2+"is:\n" );
     for(int i=n1;i<=n2;i++)
     {
    	 if(i%2!=0)
    	 {
    		 System.out.println(i);
    	 }
     }

	}

}

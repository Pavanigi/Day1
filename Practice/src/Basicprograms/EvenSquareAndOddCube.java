package Basicprograms;

public class EvenSquareAndOddCube {

	public static void main(String[] args) {
		
		      int num=2345;
		      int sum=0;
		      int sum2=0;
		        while(num>0)
		        {
		           int reminder=num%10;	
		        
		    	   if(reminder%2==0)
		    	  {
		    		 
		    		  sum=sum+(reminder*reminder);
		    		 
		    	  }
		    	  else if(reminder%2 !=0)
		    	  {
		    		
		    		 sum2=sum2+(reminder*reminder*reminder);
		    		
		    		
		    	  }
		    	   num=num/10;
			
		        }
		      System.out.println("sum of squares of even numbers:"+sum);
		      System.out.println("sum of cubes of odd numbers:"+sum2);
		      int result=sum+sum2;
		      System.out.println(result);
		     

			}

		


	}


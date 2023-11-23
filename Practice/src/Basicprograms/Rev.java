package Basicprograms;

public class Rev {

	public static void main(String[] args) {
		String str="4567";
		char[] ch=str.toCharArray();
		//System.out.println(ch);
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
				int temp=ch[i];
				ch[i]=ch[j];
				ch[j]=(char) temp;
				}
				
			}
		}
		System.out.println("the number in assending order is:");
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
	
		
	}

}

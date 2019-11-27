import java.util.*;

class Patterns
{
	public static void main(String args[])
	{
		starpattern();
		System.out.println();
		nunmberPattern();	
	}
	public static void starpattern()
	{
		int a=1,b=1;
		while(a<5)
		{	
			
			for(int k=0;k<=(4-a);k++)
				System.out.print(" ");
			while(a>=b)
			{
				System.out.print("*" + " ");
				b++; 
			}
			System.out.println();
			b=1;
			a++;
		}
		int i=5,j=5;
		while(i>0)
		{	
			j=i;
			for(int k=0;k<(5-i);k++)
				System.out.print(" ");
			while(j>0)
			{
				System.out.print("*" +" ");
				j--;
			}
			System.out.println();
			i--;
		}
	} 

		
	
	public static void nunmberPattern()
	{
		int a=1,b=1;
		while(a<5)
		{	
			
			for(int k=0;k<=(4-a);k++)
				System.out.print(" ");
			while(a>=b)
			{
				System.out.print(a + " ");
				b++; 
			}
			System.out.println();
			b=1;
			a++;
		}
		int i=5,j=5;
		while(i>0)
		{	
			j=i;
			for(int k=0;k<(5-i);k++)
				System.out.print(" ");
			while(j>0)
			{
				System.out.print(i +" ");
				j--;
			}
			System.out.println();
			i--;
		}
	} 

}
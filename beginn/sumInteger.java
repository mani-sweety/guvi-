import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n,rem=0,i,sum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
	                    i=0;
			while(n>=1){
			
				rem=n%10;
				
			
				sum=sum+rem;
				n=n/10;
				i++;
			}
			System.out.print(sum);
	}
}

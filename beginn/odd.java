import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int m,n,i,k;
		k=0;
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
		for(i=(m+1);i<n;i++){
			if((i%2)==0){
			}
			else{
			k++;	
			if(k==1)
			{
			System.out.print(i);
			}
			else{
			System.out.print(" ");
			System.out.print(i);
			}
			
			}
			
		}
		
		
	}
}

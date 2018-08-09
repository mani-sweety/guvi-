/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n,rem=0,i,m=0;
		int[] a=new int[10];
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
	                    i=0;
			while(n>=1){
			
				rem=n%10;
				if(rem%2!=0){
				a[i]=rem;
				i++;
				}
				n=n/10;
				
			}
		
		
                                   	while(i>0){
			--i;	
			System.out.print(a[i]);
			if(i>=1)
			  System.out.print(" ");
			}
		
	}
}

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
		
		int a,d,n,res,res1;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		d=sc.nextInt();
		n=sc.nextInt();
	
		res=(2*a+(n-1)*d);
		res1=(n*res)/2;
	
		System.out.print(res1);
		
		
	}
}

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
		int n,rem=0,temp;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		temp=0;
		while(n>0){
			rem=n%10;
			temp=(temp*10)+rem;
			n=n/10;
		}
		System.out.print(temp);
	}
}

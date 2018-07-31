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
		int[] a=new int[10];
		int max;
		Scanner sc=new Scanner(System.in);
	
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		max=0;
		for(int i=0;i<10;i++){
			if(a[i]>max){
				max=a[i];
				
			}
		}
		System.out.print(max);
	}
}

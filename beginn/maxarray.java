import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int i,j,max,n;
		int[] a=new int[10];
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
			
		}
		max=a[0];
		for(i=0;i<n;i++){
		for(j=i+1;j<n;j++){
			if(a[j]>max){
				max=a[j];
			}
	}
		}
		
	System.out.print(max);
	
}
}

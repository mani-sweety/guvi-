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
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		int n=str.length();
		int c=0;
		int[] k=new int[10];
		char[] a=new char[10];
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(str.charAt(i)==str.charAt(j)){
			         k[i]=c++;
				
			             a[i]=str.charAt(i);
				}
			}
		}
		char o=' ';
				for(int i=0;i<a.length-1;i++){
					if(k[i]>k[i+1]){
						 o=a[i];}
				else{
			}
				}
				System.out.print(o);
	}
}

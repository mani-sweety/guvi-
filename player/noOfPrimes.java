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
		int n,m;
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
		int k=0,c=0;
		
	                     while(m<=n){
	                     	c=0;
			for(int i=2;i<=m;i++){
				
				if(m%i==0){
					c++;
					
				          
				}
			}
			if(c==1){
				k++;
			}
			m++;
			
	                     }
				
					System.out.print(k);
			
		
			
				
	                     
				
				
	}
}

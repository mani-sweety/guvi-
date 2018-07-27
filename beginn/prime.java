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
		int m,n,j,a;
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
		
		while(m<n){
			a=0;
			for(j=2;j<n;j++){
				if(m>2){
					if((m%j)==0)
					{
						a++;
					}
					if(a==0){
						System.out.print(m+" ");
					}
					break;
				
					
				}
				
			}
			++m;
		}
		
	
	}
}

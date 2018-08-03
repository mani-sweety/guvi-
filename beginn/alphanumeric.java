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
		String s1,p;
		int a=0,b=0;
		Scanner sc=new Scanner(System.in);
		s1=sc.next();
		
		for(int i=0;i<s1.length();i++){
			
		if(Character.isDigit(s1.charAt(i)))
		{a++;
		}	
	if((Character.isLetter(s1.charAt(i)))){
			b++;
		}
		}
		
		if((a>=1)&&(b>=1)){
			System.out.print("Yes");
		}
		else{
			System.out.print("No");
		}
		
		
	}
}

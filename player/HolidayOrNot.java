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
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.next().toLowerCase();
		System.out.print(s);
		if(s.equals("sunday") || s.equals("saturday")) 
			System.out.println("yes");
		
		else 
			System.out.println("no");
		
	
	}
}

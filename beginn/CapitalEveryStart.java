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
				String str,str1=" ";
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		str=" "+str;
		for(int i=0;i<str.length();i++){
			 char x=str.charAt(i);
			 
			if(x==' '){
				if(i==0){
					str1=str1;
					char y=str.charAt(i+1);
                                                          str1=str1+Character.toUpperCase(y);
                                                          i++;
				}
				else{
				str1=str1+ " ";
			char y=str.charAt(i+1);
                                    str1=str1+Character.toUpperCase(y);
                                    i++;
			}
			}
			else{
 
				str1=str1+x;
			}
 
		}
		System.out.print(str1);
		

	}
}

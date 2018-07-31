import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int hr,min,hr1,min1,res,res1;
		Scanner sc=new Scanner(System.in);
		
		hr=sc.nextInt();
		min=sc.nextInt();
		hr1=sc.nextInt();
		min1=sc.nextInt();
		if((hr>hr1)&&(min>min1)){
		res=hr-hr1;
		res1=min-min1;
		
		System.out.println(res+" "+res1);
		}
		else if((hr<=hr1)&&(min>=min1)){
		res=hr1-hr;
		res1=min-min1;
		
		System.out.println(res+" "+res1);
		}
		
		else
		{
			res=hr1-hr;
		res1=min1-min;
		
		System.out.println(res+" "+res1);
		
		}
		
	}
}

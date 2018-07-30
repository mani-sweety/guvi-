import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int hr,min;
		Scanner sc=new Scanner(System.in);
		min=sc.nextInt();
		hr=(min/60);
		min=(min%60);
		System.out.print(hr+" "+min);
	}
	
}

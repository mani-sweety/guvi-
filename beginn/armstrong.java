	import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int sum,rem,n,temp;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		sum=0;
		rem=0;
		while(n>0){
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(sum==temp){
			System.out.print("yes");
		}
		else{
			System.out.print("no");
		}
		
	}
}

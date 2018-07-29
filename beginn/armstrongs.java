import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		        int n, count = 0, a, b, c, sum = 0,m,k,d;
		        Scanner sc=new Scanner(System.in);
		        m=sc.nextInt();
		        k=sc.nextInt();
        d=0;
        for(int i = (m+1); i < k; i++)
        {
            n = i;
            while(n > 0)
            {
            	
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            
            if(sum == i)
            {d++;
            if(d==1){
             System.out.print(i);
                
                	             }
                else {
                	System.out.print(" ");
                	System.out.print(i);
   
                }
                
            }  
            
            
            sum = 0;
        
            
        }

	}
}

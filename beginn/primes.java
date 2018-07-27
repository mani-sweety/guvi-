import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n,a,m,j,i;
	
	
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
		
		for(i=m;i<n;i++){
			a=0;
			for(j=2;j<i;j++){
		
			if((i%j)==0){
                        	++a;
                        	break;
			}
		}
                        	if(a==0){
                        	System.out.print(i+" ");
                        
                        	
		
			}
	}
			
		
		
	}
}

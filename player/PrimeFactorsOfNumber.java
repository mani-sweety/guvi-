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
		  
        Scanner scanner = new Scanner (System.in);
        int number = scanner.nextInt();
        int count;
      int k=0;
        for (int i = 2; i<=(number); i++) {
            count = 0;
            while (number % i == 0) {
                number /= i;
                count++;
        
            }
            if (count == 0) {
                 continue;
            }
            else{
            	k++;
            }
            if(k==1)
            {
                        System.out.print(i);
	
            }
            else{
            	System.out.print(" "+i);
            }

        }	
	}
}

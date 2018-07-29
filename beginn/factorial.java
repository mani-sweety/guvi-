import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n,f=1;
		
		Scanner sc=new Scanner(System.in);
			n = sc.nextInt();
			for( int i=n;i>1;i--){
				f=f*i;
			}
			System.out.print(f);
		
	}
}

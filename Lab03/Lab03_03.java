import java.util.Scanner;

public class Lab3_3 {

	public static void main(String[] args) {

		System.out.println(factorial(4,5));

	}
	
	static int factorial( int x )
	{
		int r = 1;
		while (x > 0)
		{
			r *= x;
			x--;
		}
		
		return r;
	}
	
	static int factorial( int x, int y )
	{
		int r;
		
		if ( x>y )
		{
			r = factorial(x) / factorial(y-1);
		}
		else
		{
			r = factorial(y) / factorial(x-1);
		}
		
		return r;
	}
}

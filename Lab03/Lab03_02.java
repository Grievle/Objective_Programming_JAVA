import java.util.Scanner;

public class Lab3_2 {
	public static void main(String[] args) {
		int result;
		int n;
		Scanner in = new Scanner(System.in);
		
		System.out.print("키보드로 정수값을 입력하세요 : ");
		n = in.nextInt();
		
		result = factorial(n);
		
		System.out.println(result);
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
}

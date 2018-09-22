import java.util.Scanner;

public class Lab3_1 {
	public static void main(String[] args) {
		int result;
		int n;
		Scanner in = new Scanner(System.in);
		
		System.out.print("키보드로 정수값을 입력하세요 : ");
		n = in.nextInt();
		
		result = 1;
		
		while ( n > 0 ) {
			result *= n;
			n--;
			if (n <= 0)
			{
				break;
			}
		}
		
		System.out.println(result);
	}
}

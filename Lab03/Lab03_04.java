import java.util.Scanner;

public class Lab3_4 {

	public static void main(String[] args) {
		int n;
		int sum = 0;
		Scanner in = new Scanner(System.in);

		do
		{
			System.out.print("양의 정수를 입력하세요 : ");
			n = in.nextInt();
			if (n % 2 == 0)
			{
				sum += n;
			}
		}while( n >0 );
		System.out.println("입력한 양의 정수에서 짝수의 합은 " + sum);

	}

}

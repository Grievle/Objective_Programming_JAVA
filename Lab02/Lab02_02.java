import java.util.Scanner;

public class Lab2_2 {
	public static void main(String[] args) {
		int num;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		num = in.nextInt();
		
		if (num % 2 == 0)
		{
			System.out.println("짝수");
		}
		else
		{
			System.out.println("홀수");
		}
	}
}

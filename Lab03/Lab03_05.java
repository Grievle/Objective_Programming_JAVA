import java.util.Scanner;

public class Lab3_5 {
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.print("�ڿ����� �Է��ϼ��� : ");
		n = in.nextInt();
		for (int i = 1; i<=n; i++)
		{
			printStar(i);
			System.out.println();
		}
	}
	
	static void printStar( int x )
	{
		for (int i = 1; i<=x; i++)
		{
			System.out.print("*");
		}
	}
}

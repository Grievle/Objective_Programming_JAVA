import java.util.Scanner;

public class Lab3_4 {

	public static void main(String[] args) {
		int n;
		int sum = 0;
		Scanner in = new Scanner(System.in);

		do
		{
			System.out.print("���� ������ �Է��ϼ��� : ");
			n = in.nextInt();
			if (n % 2 == 0)
			{
				sum += n;
			}
		}while( n >0 );
		System.out.println("�Է��� ���� �������� ¦���� ���� " + sum);

	}

}

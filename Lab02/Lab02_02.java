import java.util.Scanner;

public class Lab2_2 {
	public static void main(String[] args) {
		int num;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		num = in.nextInt();
		
		if (num % 2 == 0)
		{
			System.out.println("¦��");
		}
		else
		{
			System.out.println("Ȧ��");
		}
	}
}

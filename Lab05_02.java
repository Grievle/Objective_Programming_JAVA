import java.util.Scanner;

public class Lab05_02 {

	public static void main(String[] args) {
		int numOfStudents = 0;
		int[] scores;
		Scanner in = new Scanner(System.in);
		numOfStudents = in.nextInt();
		scores = new int[numOfStudents];
		for (int i : scores)
		{
			System.out.print(i+1 + "��° �л��� ������ �Է��ϼ��� : ");
			i = in.nextInt();
		}
		int cnt = 0;
		for (int i : scores)
		{
			cnt++;
			System.out.print( cnt + "��° �л��� �����Դϴ� : ");
			System.out.println(scores[i]);
		}
		cnt = 0;
		for (int i : scores)
		{
			cnt++;
			System.out.print(cnt + "��° �л��� ����� ");
			if (i >= 90)
			{
				System.out.println("A�Դϴ�.");
			}else if (i >= 80)
			{
				System.out.println("B�Դϴ�.");
			}else if (i >= 70)
			{
				System.out.println("C�Դϴ�.");
			}else if (i >= 60)
			{
				System.out.println("D�Դϴ�.");
			}else
			{
				System.out.println("F�Դϴ�.");
			}
		}
	}
}

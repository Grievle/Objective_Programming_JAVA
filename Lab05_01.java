import java.util.Scanner;

public class Lab05_01 {

	public static void main(String[] args) {
		int numOfStudents = 0;
		int[] scores;
		Scanner in = new Scanner(System.in);
		System.out.print("�л��� ���� �Է��ϼ��� : ");
		numOfStudents = in.nextInt();
		scores = new int[numOfStudents];
		for (int i = 0 ; i < numOfStudents ; i++ )
		{
			System.out.print(i+1 + "��° �л��� ������ �Է��ϼ��� : ");
			scores[i] = in.nextInt();
		}
		for (int i = 0 ; i < numOfStudents ; i++ )
		{
			System.out.print(i+1 + "��° �л��� �����Դϴ� : ");
			System.out.println(scores[i]);
		}
	}
}

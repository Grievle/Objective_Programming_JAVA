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
			System.out.print(i+1 + "번째 학생의 점수를 입력하세요 : ");
			i = in.nextInt();
		}
		int cnt = 0;
		for (int i : scores)
		{
			cnt++;
			System.out.print( cnt + "번째 학생의 점수입니다 : ");
			System.out.println(scores[i]);
		}
		cnt = 0;
		for (int i : scores)
		{
			cnt++;
			System.out.print(cnt + "번째 학생의 등급은 ");
			if (i >= 90)
			{
				System.out.println("A입니다.");
			}else if (i >= 80)
			{
				System.out.println("B입니다.");
			}else if (i >= 70)
			{
				System.out.println("C입니다.");
			}else if (i >= 60)
			{
				System.out.println("D입니다.");
			}else
			{
				System.out.println("F입니다.");
			}
		}
	}
}

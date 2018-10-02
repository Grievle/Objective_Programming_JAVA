import java.util.Scanner;

public class Lab05_01 {

	public static void main(String[] args) {
		int numOfStudents = 0;
		int[] scores;
		Scanner in = new Scanner(System.in);
		System.out.print("학생의 수를 입력하세요 : ");
		numOfStudents = in.nextInt();
		scores = new int[numOfStudents];
		for (int i = 0 ; i < numOfStudents ; i++ )
		{
			System.out.print(i+1 + "번째 학생의 점수를 입력하세요 : ");
			scores[i] = in.nextInt();
		}
		for (int i = 0 ; i < numOfStudents ; i++ )
		{
			System.out.print(i+1 + "번째 학생의 점수입니다 : ");
			System.out.println(scores[i]);
		}
	}
}

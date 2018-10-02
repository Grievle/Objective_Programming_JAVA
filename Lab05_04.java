import java.util.Scanner;

public class Lab05_04 {
	public static void main(String[] args) {
		System.out.println("숫자를 10개 입력하세요");
		Scanner in = new Scanner(System.in);
		int[] numlist = new int[10];
		int[] histogram = new int[10];
		for (int i : numlist)
		{
			i = in.nextInt();
			for(int j = 9 ; j >= 0 ; j--)
			{
				if(i >= (j*10))
				{
					histogram[j] ++;
					break;
				}
			}
		}
		int cnt = 0;
		for (int i : histogram)
		{
			if ( cnt == 0 )
			{
				System.out.print(" " + cnt*10 + " ~  " + ((cnt+1)*10-1) + " : ");
			}else {
				System.out.print(cnt*10 + " ~ " + ((cnt+1)*10-1) + " : ");
			}
			for (int j = 1 ; j <= i ;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			cnt++;
		}
	}
}

import java.util.Scanner;

class Dice {
	int face;
	
	int roll()
	{
		return (int) (Math.random()*6)+1;
	}
}

public class Lab4_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String check;
		Dice dice = new Dice();
		while(true)
		{
			System.out.print("계속 던질까요? (y/n)");
			check = in.next();
			if (check.compareToIgnoreCase("n")==0)
			{
				break;
			}else
			{
				System.out.println("주사위 숫자 : "+dice.roll());
			}
			
		}
		System.out.println("주사위 던지기를 종료합니다.");
	}
}

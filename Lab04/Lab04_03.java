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
			System.out.print("��� �������? (y/n)");
			check = in.next();
			if (check.compareToIgnoreCase("n")==0)
			{
				break;
			}else
			{
				System.out.println("�ֻ��� ���� : "+dice.roll());
			}
			
		}
		System.out.println("�ֻ��� �����⸦ �����մϴ�.");
	}
}

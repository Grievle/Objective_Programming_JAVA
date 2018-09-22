import java.util.Scanner;

class Printer {
	private int numOfPapers = 0;
	private boolean duplex = false;
	public Printer(int numOfPapers, boolean duplex) {
		this.numOfPapers = numOfPapers;
		this.duplex = duplex;
	}
	
	void print(int amount) {
		if (numOfPapers == 0)
		{
			System.out.println("������ �����ϴ�.");
		}
		if (this.getDuplex())
		{
			if (amount%2 == 1)
			{
				amount /=2;
				amount += 1;
			}else {
				amount /= 2;
			}
			System.out.print("������� ");
		}
		else
		{
			System.out.print("�ܸ����� ");
		}
		
		if (amount > numOfPapers)
		{
			this.getDuplex();
			System.out.println("��� ����Ϸ��� ������ "+ (amount-numOfPapers)+ "�� �����մϴ�. " +numOfPapers+ "�常 ����մϴ�.");
			numOfPapers = 0;
		}
		else
		{
			System.out.println(amount+"�� ����߽��ϴ�. ���� "+(numOfPapers-amount)+"�� ���� �ֽ��ϴ�.");
			numOfPapers -= amount;
		}
	}
	
	public boolean getDuplex() {
		return duplex;
	}
	
	public void setDuplex(boolean duplex) {
		this.duplex = duplex;
	}
}

public class Lab4_01 {
	public static void main(String[] args) {
		int paper_num;
		int print_num;
		boolean duplex_bool;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Printer�� ���� ���� �ż��� ������ : ");
		paper_num = in.nextInt();
		System.out.print("�ܸ��� false, ����� true : ");
		duplex_bool = in.nextBoolean();
		Printer p = new Printer(paper_num, duplex_bool);
		while (true)
		{
			System.out.print("�ܸ��� false, ����� true : ");
			duplex_bool = in.nextBoolean();
			p.setDuplex(duplex_bool);
			System.out.print("���� ���� ���ΰ���? : ");
			print_num = in.nextInt();
			p.print(print_num);
			
		}
	}
}

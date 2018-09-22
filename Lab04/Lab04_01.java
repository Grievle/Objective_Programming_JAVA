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
			System.out.println("용지가 없습니다.");
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
			System.out.print("양면으로 ");
		}
		else
		{
			System.out.print("단면으로 ");
		}
		
		if (amount > numOfPapers)
		{
			this.getDuplex();
			System.out.println("모두 출력하려면 용지가 "+ (amount-numOfPapers)+ "매 부족합니다. " +numOfPapers+ "장만 출력합니다.");
			numOfPapers = 0;
		}
		else
		{
			System.out.println(amount+"장 출력했습니다. 현재 "+(numOfPapers-amount)+"장 남아 있습니다.");
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
		
		System.out.print("Printer에 넣을 용지 매수를 쓰세요 : ");
		paper_num = in.nextInt();
		System.out.print("단면은 false, 양면은 true : ");
		duplex_bool = in.nextBoolean();
		Printer p = new Printer(paper_num, duplex_bool);
		while (true)
		{
			System.out.print("단면은 false, 양면은 true : ");
			duplex_bool = in.nextBoolean();
			p.setDuplex(duplex_bool);
			System.out.print("몇장 뽑을 것인가요? : ");
			print_num = in.nextInt();
			p.print(print_num);
			
		}
	}
}

import java.util.Scanner;

public class Lab2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double w, h, area;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("직사각형의 가로 길이를 입력하세요 : ");
		w = in.nextDouble();
		
		System.out.print("직사각형의 세로 길이를 입력하세요 : ");
		h = in.nextDouble();
		
		area = w * h;
		
		System.out.print("입력하신 직사각형의 넓이는 " + area);
//		System.out.println("입력하신 직사각형의 넓이는 %f" , area);
	}

}

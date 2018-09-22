import java.util.Scanner;

class Car {
	String car_color;
	static int numofCar = 0;
	static int numofRedCar = 0;
	public Car(String color)
	{
		this.car_color = color;
		numofCar++;
		if(car_color.compareToIgnoreCase("red")==0)
		{
			numofRedCar++;
		}
	}
	
	public int setRedCar() {
		return this.numofRedCar;
	}
	public int setCarNum() {
		return this.numofCar;
	}
	
}

public class Lab4_02 {

	public static void main(String[] args) {
		
		String color;
		Scanner in = new Scanner(System.in);
		while (true)
		{
			System.out.print("자동차 색상(예 : red, blue, green) 혹은 종료(exit) :");
			color = in.next();
			Car car = new Car(color);
			if(color.equals("exit"))
			{
				System.out.println("자동차 수 : " + (car.setCarNum()-1) + ", 빨간색 자동차 수 : " + car.setRedCar());
				break;
			}
			
			
		}

	}

}

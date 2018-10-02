
public class Lab05_03 {
	
	public static void main(String[] args) {
		int[] num = {9,86,45,83,23,77};
		num = reverse(num);
		for (int i : num)
		{
			System.out.print(i + " ");
		}
	}
	
	public static int[] reverse(int[] org)
	{
		int len = org.length;
		int[] arr_org = new int[len];
		for (int i : org)
		{
			len--;
			arr_org[len] = i;
		}
		return arr_org;
	}
}

package ProgramPrectice;
import java.util.Scanner;
public class PositiveFormeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the any nuber");
		int num = sc.nextInt();
		if(num>=0)
		{
			System.out.println(num);
		}
		else
		{
			System.out.println(-num);
		}
	}
}


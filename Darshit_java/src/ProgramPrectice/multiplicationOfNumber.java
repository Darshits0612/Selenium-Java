package ProgramPrectice;
import java.util.Scanner;
public class multiplicationOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int sum=1;
		while(num != 0) {
			int ld = num%10;
			sum=sum*ld;
			num=num/10;
		}
		System.out.println(sum);
	}

}

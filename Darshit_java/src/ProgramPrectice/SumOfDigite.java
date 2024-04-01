package ProgramPrectice;
import java.util.Scanner;
public class SumOfDigite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		while(num != 0) {
			int n = num%10;
			sum=sum+n;
			num=num/10;
		}
		System.out.println("the digite sum is = "+sum);
	}

}

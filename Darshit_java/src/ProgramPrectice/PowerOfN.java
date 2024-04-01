//Print n Power of p
package ProgramPrectice;
import java.util.Scanner;
public class PowerOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the base value");
		int base = sc.nextInt();
		System.out.println("Enter the Power Value");
		int power = sc.nextInt();
		int sum=1;
		for(int i=1;i<=power;i++) {
			sum=sum*base;
		}
		System.out.println(sum);
	}

}

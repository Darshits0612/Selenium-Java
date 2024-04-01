package pattern;

import java.util.Scanner;

public class Forth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enteer the number");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			int t = 1;
			for (int j = num; j >= i; j--) {
				System.out.print(t + " ");
				t++;
			}
			System.out.println();
		}
	}

}

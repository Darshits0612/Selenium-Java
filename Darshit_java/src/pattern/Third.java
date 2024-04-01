package pattern;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row");
		int num = sc.nextInt();
		int n = 1;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(n + "  ");
				n += 2;
			}
			System.out.println();
		}
	}

}

package pattern;

import java.util.Scanner;

public class Six {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Row");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			int t=num;
			for(int j=num-i;j>=1;j--) {
				
				System.out.print("  ");
				t--;
				
			}
			for(int j=1;j<=i;j++) {
				
				System.out.print(t+" ");
				t--;
			}
			System.out.println();
		}
	}
}

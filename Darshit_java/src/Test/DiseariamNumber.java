package Test;

import java.util.Scanner;

public class DiseariamNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the Starting value");
				int num = sc.nextInt();
				System.out.println("enter the end value");
				int num1=sc.nextInt();

				for (int i = num; i <= num1; i++) {
					int j = i;
					int sum = 0;
					
					while (j != 0) {
						int ld = j % 10;
						int count = digitCount(j);
						sum = sum + power(ld, count);
						j = j / 10;
					}
					if (sum == i) {
						System.out.println(i);
					}

				}
			}

			static int digitCount(int n) {
				int count = 0;
				while (n != 0) {
					count++;
					n = n / 10;
				}
				return count;
			}

			static int power(int ld, int count) {
				int sum = 1;
				for (int i = 1; i <= count; i++) {
					sum = sum * ld;
				}
				return sum;
			}

		


	}



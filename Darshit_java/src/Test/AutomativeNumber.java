package Test;

import java.util.Scanner;

public class AutomativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int num1 = num;
		int count = counts(num);
		int squer = num * num;
		int count1 = 0;
		int sum = 0;
		int sum1=0;
		while (count1 != count) {
			
				int n = num % 10;
				int n1=num1%10;
				sum = sum * 10 + n;
			     sum1=sum1*10+n1;
				num = num / 10;
				num1=num1/10;
				count1++;
			
		}
		//System.out.println(sum1+" "+sum);
		if (sum1 == sum) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

	public static int counts(int num) {
		int count = 0;
		while (num != 0) {
			int r = num % 10;
			
			count++;
			num = num / 10;
		}
		return count;
	}

}
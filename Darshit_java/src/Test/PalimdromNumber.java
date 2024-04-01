package Test;

import java.util.Scanner;

public class PalimdromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		for(int i=100;i<=1000;i++) {
			int j=i;
			int sum=0;
			while(j!=0) {
				int ld=j%10;
				sum=sum*10+ld;
				j=j/10;
			}
			if(i==sum) {
				System.out.println(sum);
			}
		}
	}

}

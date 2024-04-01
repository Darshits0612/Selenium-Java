package mock;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		int sum=0;
		int sum1=1;
		int sum3=0;
		
		System.out.print(sum+" "+sum1);
		
		for (int i = 2; i < num; i++) {
					
			sum3=sum+sum1;
			System.out.print(" "+sum3);
			sum=sum1;
			sum1=sum3;			
		}
	}
}

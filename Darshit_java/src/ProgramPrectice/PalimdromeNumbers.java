package ProgramPrectice;

public class PalimdromeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=100;i<=1000;i++) {
			int j=i;
			int sum=0;
			while(j != 0) {
				
				int ld=j%10;
				sum=sum*10+ld;
				j=j/10;
			}
			if(i==sum) {
				System.out.print(i+" ");
			}
		}
		
	}

}

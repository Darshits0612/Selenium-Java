package programing;

public class swepnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int temp=0;
	
		System.out.println("before the sweping a="+a+" b="+b);
//		
//		temp=a;
//		a=b;
//		b=temp;
//		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("after the swping");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}

package satish;
import java.util.Scanner;
public class cout {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the cout");
		int a=sc.nextInt();
		int count=0;
		while(a!= 0) {
			count++;
			a=a/10;
			
		}
		System.out.println(count);
	}

}

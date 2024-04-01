package satish;
import java.util.Scanner;
public class Fectorial {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the number");
int a=Sc.nextInt();
int sum=1;
for(int i=2;i<=a;i++) {
	sum=sum*i;
}
System.out.println(sum);
	}

}

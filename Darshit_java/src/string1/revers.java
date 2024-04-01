package string1;
import java.util.Scanner;
public class revers {
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the string");
			String s=sc.next();
			String s1=" ";
			
			for(int i=0;i<s.length();i++)
			{
				s1=s.charAt(i)+s1;
			}
			s1=s1.trim();
			System.out.println(s1);
	}

}

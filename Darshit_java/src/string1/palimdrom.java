package string1;
import java.util.Scanner;
public class palimdrom {
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the string");
			String s=sc.next();
			String s1="";
			for(int i=s.length()-1;i>=0;i--)
			 //for(int i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				s1=ch+s1;	
				System.out.println(s1);
			}
			 if(s1.equalsIgnoreCase(s))
			 {
				 System.out.println("string is palimdrom");
			 }
			 else 
			 {
				 System.out.println("string is not palimdrom");
			 }
	}

}

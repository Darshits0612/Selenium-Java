package string1;
import java.util.Scanner;


public class convert_lc_up {
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the string");
			String s=sc.next();
			String temp=" ";
			for(int i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				if(ch>='A' && ch<='Z')
				{
					temp=temp+((char)(ch+32));
				}
				else
				{
					temp=temp+((char)(ch-32));
				}
			}
			System.out.println(temp);
	}

}

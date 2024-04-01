package string1;
import java.util.Scanner;
public class countstrchar {
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the string");
			String s=sc.next();
			int uc=0;
			int lc=0;
			int special=0;
			int n=0;
			for(int i=0;i<s.length();i++)
			{
			char ch=s.charAt(i);
				if(ch >= 'A' && ch <= 'Z')
				{
					uc++;
				}
				else if(ch >= 'a' && ch <= 'z')
				{
					lc++;
				}
				else if(ch >= '0' && ch <= '9')
				{
					n++;
				}
				else
				{
					special++;
				}
			}
			System.out.println("upeercase character is "+uc);
			System.out.println("lowercase character is "+lc);
			System.out.println("number is "+n);
			System.out.println("special scembol is "+special);
			
			
			
			
	}

}

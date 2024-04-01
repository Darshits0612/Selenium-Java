package string1;

import java.util.Scanner;
public class sumascii {
	
	public static void main(String[] args) {

			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the string");
			String s=sc.next();
			int sum=0;
			char ch[]=s.toCharArray();
			for(int i=0;i<s.length();i++)
			{
				
				if(ch[i] >= '0' && ch[i] <= '9')
				{
					sum=sum+(ch[i]-48);
				}
			}
			System.out.println(sum);
}
}

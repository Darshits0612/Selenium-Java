package string1;
import java.util.Scanner;
public class count_char1 {
	
	
		
		public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the string");
				String s=sc.next();
				
				for(int j=0;j<s.length();j++)
				{
					char k=s.charAt(j);
					int count=0;
					
					for(int i=0;i<s.length();i++)
					{
						char ch=s.charAt(i);
					
						if(ch==k)
						{
							count++;
						}
					}
					if(count>=2)
					{
					System.out.println(k+" occurred for "+count+" times");
					}
				}
		}

} 



package string1;
import java.util.Scanner;
public class find_length {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
		//String s="darshot";
		int count=0;
		
		for(int i=0;true;i++)
		{
			try
			{
					s.charAt(i);
					count++;
					
			}
		catch(StringIndexOutOfBoundsException e)
			{
			break;
			}
		}
		System.out.println("the length of "+s+" is "+count);

	}
}
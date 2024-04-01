package string1;

public class print_uprcase_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String s1="aDEFsdFEWdsdfsdfSDfdsF";
		
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				System.out.println(ch);
			}
		}
	}

}

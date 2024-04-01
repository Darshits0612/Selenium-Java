package programing;

public class ReverceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "hello";
		String s1="";
		
		for(int i=0;i<s.length();i++)
		{
		   char ch=s.charAt(i);
		   s1=ch+s1;
		   
		}
		System.out.println(s1);
	}

}

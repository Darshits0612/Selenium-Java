package mock;

public class ReversString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="hello";
		String s2=" ";
//		for(int i=0;i<s1.length();i++)
//		{
//			char ch=s1.charAt(i);
//			s2=ch+s2;
//			
//		}
//		System.out.println(s2);

	
	   for(int i=s1.length()-1;i>=0;i--)
	   {
		  char ch=s1.charAt(i);
				  System.out.print(ch);
	   }
	
	
	
	
	}

}

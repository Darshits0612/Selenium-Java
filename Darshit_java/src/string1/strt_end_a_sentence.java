package string1;

public class strt_end_a_sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "a sadfa alkjda asdf fdsa";
		String []s2=s1.split(" ");
		
		for(int i=0;i<s2.length;i++)
		{
			char start=s2[i].charAt(0);
			char end=s2[i].charAt(s2[i].length()-1);
			
			if(start=='a' && end=='a')
			{
				System.out.println(s2[i]);
			}
		}
	}

}

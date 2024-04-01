package string1;

public class end_a_strarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String []s1= {"hello","java","vadA","abcda","ASFDA"};
		
		for(int i=0;i<s1.length;i++)
		{
			char ch=s1[i].charAt(s1[i].length()-1);
			if(ch=='a' || ch=='A')
			{
				System.out.println(s1[i]);
			}
		}
	}

}

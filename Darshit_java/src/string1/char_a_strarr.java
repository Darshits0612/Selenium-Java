package string1;

public class char_a_strarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String []s1= {"hello","javA","are","akfus","you"};
		
		for(int i=0;i<s1.length;i++)
		{
			for(int j=0;j<s1[i].length();j++)
			{
				char ch=s1[i].charAt(j);
				if(ch=='a')
				{
					System.out.println(s1[i]);
					break;
					
				}			
		
			}
	
		}

	}

}

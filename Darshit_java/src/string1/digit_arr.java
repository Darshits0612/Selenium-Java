package string1;

public class digit_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String []s1= {"hello1","hii","as23s","asd43sd4","2345"};
		
		for(int i=0;i<s1.length;i++)
		{
			for(int j=0;j<s1[i].length();j++)
			{
				char ch=s1[i].charAt(j);
				
				if(ch>='0' && ch<='9')
				{
					System.out.println(s1[i]);
					  break;
				}
				
			}
			
		}		
		
	}

}

package string1;

public class first_last_each_char_strarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String []s1= {"hello","how","are","akfus","you"};
		
		
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i].charAt(0)+" "+s1[i].charAt(s1[i].length()-1));
			
		}
	}

}

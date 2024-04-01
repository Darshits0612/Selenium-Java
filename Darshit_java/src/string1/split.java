package string1;

public class split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="hi how are you";
		String []s2=s1.split(" ");
		String s3=(" ");
		
		for(int i=0;i<s2.length;i++)
		{			
			//s3=String.valueOf(s2[i])+" "+s3;
			s3=s2[i]+" "+s3;
		}
		System.out.println(s3);
		
	}
}

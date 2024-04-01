package string1;

public class revers_word_pos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hi how are you";
		String [] s2=s1.split(" ");
		String [] s3=new String[s2.length];
		String s4="";
		
		for(int i=0;i<s2.length;i++)
		{
			for(int j=0;j<s2[i].length();j++)
			{
				if(s3[i]==null)
				{
					s3[i]=s2[i].charAt(j)+"";
				}
				else
				{
				s3[i]=s2[i].charAt(j)+s3[i];
//				s3[i]=s3[i].trim();
				}
			}
			
//			
			//s4=String.valueOf(s3[i])+" "+s4;
			s4=s3[i]+" "+s4;
			
		}
		System.out.println(s4);

	}

}

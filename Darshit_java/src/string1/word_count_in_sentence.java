package string1;

public class word_count_in_sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String s1="hello i am darshit sakariya from gujarat";
		String []s2=s1.split(" ");
		int count=0;
		for(int i=0;i<s2.length;i++)
		{
			count++;
		}
		System.out.println("in a sentence total "+count+" word");
	}

}

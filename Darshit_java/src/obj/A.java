package obj;

public class A{

public static void main(String[] args) {
	
	int count=0;
	String s="asBdfleixoksfa";
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(ch=='b'||ch=='B')
		{
			count++;
			break;
		}
		
	}
	if(count != 0)
	{

		System.out.println("in this string b are PRESENT");
	}
	else
	{
		System.out.println("in this string b is NOT PRESENT");
	}
		
}

}

package programing;

public class ascii {
		public static void main(String[] args) {
			 String s="darshit";
			    String s1="";
			    
			    for(int i=0;i<s.length();i++)
			    {
			        s1=s.charAt(i)+s1;
			    }
			    s1=s1.trim();
			    
			    System.out.println(s1);
			    
		}
}

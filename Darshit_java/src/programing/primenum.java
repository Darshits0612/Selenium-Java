package programing;

public class primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n1=100;
		
		
		for(int n=1;n<=n1;n++)
		{
		   prime(n);
		}
		
	}
	public static void prime(int n)
	{
		int count=0;
		
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					count++;
					break;
				}
				
			}
			if(count==0)
			{
				System.out.println(n);
			}
		
		
		
	}

}
//int n=2;
//int count=0;
//if(n>=2)
//{
//	for(int i=2;i<n;i++)
//	{
//		if(n%i==0)
//		{
//		count++;
//		break;
//		}
//	}
//	
//}
//if(count==0)
//{
//	System.out.println("prime number");
//}
//else
//{
//	System.out.println("not prime");
//}
//

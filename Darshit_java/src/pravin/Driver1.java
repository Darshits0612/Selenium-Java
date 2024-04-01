package pravin;
class Over
{
	public void test()
	{
		System.out.println("from over of test()");
	}
	public void test(int a) {
		System.out.println("from over of test(int a)");
	}
	public void test(int a,int b)
	{
		System.out.println("from over of test(int a,int b)");
	}
}
class Over1 extends Over
{
	public void test()
	{
		System.out.println("from over1 of test()");
	}
	public void test(int a) {
		System.out.println("from over1 of test(int a)");
	}
	public void test(int a,int b)
	{
		System.out.println("from over1 of test(int a,int b)");
	}
	
}

public class Driver1 {

	public static void main(String[] args) {
	
		Over1 o=new Over1();
		Over o1=o;
		o1.test();
		o1.test(10);
		o1.test(10,20);
	}
}

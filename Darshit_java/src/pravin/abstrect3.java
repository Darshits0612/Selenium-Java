package pravin;

abstract class M{
	abstract public void test1();	
}
abstract class N extends M{
	public void test2()
	{
		System.out.println("hello");
	}
}
abstract class O extends N{
	abstract public void test3();
}
abstract class P extends O{
	public void test1() {

		System.out.println("hi");
	}
}
class Q extends N{
	public void test1() {
		System.out.println("bye");
		
	}
}
class R extends P{
	public void test3() {
		System.out.println("good bye");
	}
}

public class abstrect3 {

	public static void main(String[] args) {

		Q obj1=new Q();
		obj1.test1();
		obj1.test2();
		
		N obj2=obj1;  //up casting
		obj2.test1();
		obj2.test2();
		
		M obj3=obj1; //up casting
		obj3.test1();
		//obj3.test2();
		
		R obj4=new R(); //up casting
		obj4.test1();
		obj4.test2();
		obj4.test3();
		
		P obj5=obj4;  //up casting
		obj5.test1();
		obj5.test2();
		obj5.test3();
		
		O obj6=obj4;
		obj6.test1(); //up casting
		obj6.test2();
		obj6.test3();
		
		N obj7=obj4; //up casting
		obj7.test1();
		obj7.test2();
		//obj7.test3();
		
		M obj8=obj4;
		obj8.test1();
		//obj8.test2();
		//obj8.test3();
		
		
	}

}

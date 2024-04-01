package pravin;
abstract class H{
	abstract public void test();
}
 class I extends H{
	public void test() {
		System.out.println("hello");
	}	
}

public class Abstrect1 {

	public static void main(String[] args) {
	I obj1=new I();//object of i class
	obj1.test();
	H obj2=obj1;  //upcasting
	obj2.test();
	//H obj3=new H();
	//obj3.test();
	

	}

}
///note:-we can not create object of abstract class but we concrate object reference variable of abstract class type  
package pravin;

abstract class J{
	abstract public void a1();
}

abstract class K extends J{
	public void a2() {
		System.out.println("hi");
	}
}
class L extends K{
	
	public void a1() {
		
		System.out.println("bye");
	}
}

public class Abstract2 {

	public static void main(String[] args) {
		L obj1=new L();
		obj1.a1();
		obj1.a2();
		
		
		
	    K obj2=obj1;//upcasting
	    obj2.a1();
	    obj2.a2();
	 
	    J obj3=obj1;//upcasting
	    obj3.a1();
	    //mobj3.a2();
	   
	 
		
		
	}

}
 
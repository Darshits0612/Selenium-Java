package obj;

class Dh
{
	String name;
	int id;
	
	Dh(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public void print()
	{
		System.out.println(name+" "+id);
	}
}
public class Driver5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dh e1=new Dh("darshit",101);
		Dh e2=new Dh("piyush",102);
		e1.print();
		e2.print();
	    		
	}
}







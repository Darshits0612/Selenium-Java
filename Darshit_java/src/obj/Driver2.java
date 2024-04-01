package obj;

class Bike1
{
	String name;
	int mileage;
	double price;
	
	Bike1(String name,int mileage,double price)
	{
		this.name=name;
		this.mileage=mileage;
		this.price=price;
		
	}
	public String toString()
	{
		return name;
	}
	public boolean equals(Object obj)
	{
		return((Bike1)obj).mileage==this.mileage;
	}
	public int hashCode()
	{
		
		return this.mileage;
	}
}

public class Driver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike1 b1=new Bike1("pulser",60,100000);
		Bike1 b2=new Bike1("splender",60,80000);
		
		System.out.println(b1.equals(b2));
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		
		Bike1 b3=new Bike1("jawa",30,300000);
		Bike1 b4=new Bike1("ra",35,300020);
		
		System.out.println(b3.equals(b4));
		System.out.println(b3.hashCode());
		System.out.println(b4.hashCode());
		
		
	}

}

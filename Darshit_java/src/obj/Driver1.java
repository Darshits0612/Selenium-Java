package obj;

public class Driver1 {

	public static void main(String[] args) {
		
		Bike b1=new Bike("pulser",60,100000);
		//System.out.println(b1); // reference or address
		Bike b2=new Bike("splender",60,100000);
		System.out.println(b1.equals(b2));

	}

}
class Bike
{
	String name;
	int mileage;
	double price;
	
	Bike(String name,int mileage,double price)
	{
		this.name=name;
		this.mileage=mileage;
		this.price=price;		
	}
	public String tostring()
	{
		return name;
	}
	
	public boolean equals(Object obj)
	{
		return ((Bike)obj).mileage==this.mileage;	
    }	
}
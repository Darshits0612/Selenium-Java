package string1;

public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int big=0;
		Bike b1=new Bike("pulser",300,50000.0);
		Bike b2=new Bike("splender",70,50000.0);
		Bike b3=new Bike("honda",100,60000.0);
	
		Bike []b= {b1,b2,b3};
		
		for(int i=0;i<b.length;i++)
		{
			if(big<b[i].mileage)
			{
				big=b[i].mileage;
			}
		}
		for(int j=0;j<b.length;j++)
		{
			if(big==b[j].mileage)
			{
				System.out.println(b[j].name);
				System.out.println(b[j].mileage);
				System.out.println(b[j].price);
			}
		}
	}

}

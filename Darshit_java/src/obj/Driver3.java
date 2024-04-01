package obj;

class Employee
{
	String name;
	int eid;
	double salary;
	

Employee(String Name,int Eid,double Salary)
{
	this.name=Name;
	this.eid=Eid;
	this.salary=Salary;
}
public String toString()
{
	return "Name:"+name+",Eid:"+eid+",Salary:"+salary;
}
public boolean equals(Object obj)
{
	return this.eid==((Employee)obj).eid;
}

public int hashcode()
{
	return eid;
}
}
public class Driver3 {

	public static void main(String[] args) {
		
	
	Employee e1=new Employee("darshit",6,50000.0);
	Employee e2=new Employee("ashok",4,900000.0);
	
	System.out.println(e1);
	System.out.println(e2);
	System.out.println(e1.equals(e2));
	System.out.println(e1.hashcode());
	System.out.println(e2.hashcode());
	
	
	}

}

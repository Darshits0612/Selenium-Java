package assignment1;

public class Employee implements Comparable
{

	private String name;
	private int eid;
	private double salary;

	public String getName()
	{
		return name;
	}
	public void setName (String name)
	{
		this.name=name;
	}
	public int getEid()
	{
		return eid;
	}
	public void setEid(int eid)
	{
		this.eid=eid;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
		
	Employee(String name, int eid, double salary) {
		this.name = name;
		this.eid = eid;
		this.salary = salary;
	}
	
	@Override
	public String toString()
	{
		return "EID: "+eid+" Name: "+name+" Salary: "+salary;
	}
	@Override
	public int compareTo(Object obj) {
		Employee e = (Employee)obj;
		return (int)(this.salary - e.salary);
	}
	
	

}

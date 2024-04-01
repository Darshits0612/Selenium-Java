package assignment1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Driver1 {
//	static ArrayList<Employee> emp=new ArrayList<Employee>();
	static ArrayList emp = new ArrayList();
	static Scanner sc=new Scanner(System.in);
	public static void addEmployee()
	{
		System.out.println("let's CREATE AND ADD AN EMPLOYEE TO ARRAYLIST");
		System.out.println("ENTER NAME OF EMPLOYEE");
		String name=sc.next();
		System.out.println("ENTER EID OF EMPLOYEE");
		int eid=sc.nextInt();
		System.out.println("ENTER SALARY OF EMPLOYEE");
		double salary=sc.nextDouble();
	
		Employee e1=new Employee(name,eid,salary);
		emp.add(e1);
		System.out.println("EMPLOYEE ADDED TO ARRAYLIST");
		System.out.println("-------------------------------------------------");
		
	}
	public static void displayDetails()
	{
		for(Object obj:emp)
		{
			Employee obj1=(Employee)obj;
			System.out.println("NAME : "+obj1.getName());
			System.out.println("EID : "+obj1.getEid());
			System.out.println("SALARY : "+obj1.getSalary());	
			System.out.println("-------------------------------------------------------");
		}
		
		
	}
	public static void searchEmployee()
	{
		System.out.println("ENTER A EMPLOYEE NAME");
		String name=sc.next();
		for(Object obj:emp)
		{
			Employee obj2=(Employee)obj;
			String s1=obj2.getName();
			if(name.equals(s1))
			{
//				System.out.println(emp);
				System.out.println("NAME : "+obj2.getName());
				System.out.println("EID : "+obj2.getEid());
				System.out.println("SALARY : "+obj2.getSalary());
				System.out.println("----------------------------------------------------------------");
			}
		}
		
	}
	public static void deleteEmployee()
	{
		System.out.println("ENTER EMPLOYEE EID WHICH WANT TO DELETE");
		int eid=sc.nextInt();
		
		for(Object e:emp)
		{
			Employee obj3=(Employee)e;
			if(eid==obj3.getEid())
			{		
				System.out.println(emp.indexOf(obj3));
				emp.remove(emp.indexOf(obj3));
				
//				emp.remove(emp.indexOf(eid));
			//	System.out.println(obj3.getName());
				
			}
		}
		System.out.println("object remove succsesful");
		
		System.out.println("----------------------------------------------------------------");

	}
	
	public static void salaryAscendingDetails()
	{
		
		Collections.sort(emp);
		for (Object obj : emp) {
						
			Employee e1=(Employee)obj;
//			System.out.println("NAME : "+e1.getName());
//			System.out.println("EID : "+e1.getEid());
//			System.out.println("SALARY : "+e1.getSalary());
			System.out.println(e1);
			System.out.println("----------------------------------------------------------------");

		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(".................. WELCOME...................");
//		System.out.println("PRESS 1 TO CREATE AND ADD AN EMPLOYEE TO ARRAYLIST");
//		System.out.println("PRESS 2 TO DISPLAY DETAILS OF ALL THE EMPLOYEES PRESENT IN ARRAYLIST");
//		System.out.println("PRESS 3 TO SEARCH AN EMPLOYEE BASED ON NAME");
//		System.out.println("PRESS 4 TO DELETE AN EMPLOYEE BASED ON EID");
//		System.out.println("PRESS 5 TO DISPLAY DETAILS OF ALL THE EMPLOYEE PRESENTIN THE ARRAYLIST IN THE ASCENDING ORDER OF SALARY");
//	
//		int choice=sc.nextInt();
//	
//		if(choice==1)
//		{
//			addEmployee();
//		}
//		else if(choice==2)
//		{
//			displayDetails();
//		}
//		else if(choice==3)
//		{
//			searchEmployee();
//		}
//		else if(choice==4)
//		{
//			deleteEmployee();
//		}
//		else if(choice==5)
//		{
//			salaryAscendingDetails();
//		}
//		else
//		{
//			System.out.println("invalid choice");
//		}
//		System.out.println("PRESS 1 TO CONTINUE");
//		System.out.println("PRESS ANY OTHERS NUMBER TO STOP");
//		int continue1=sc.nextInt();
//		if(continue1==1)
//		{
//			main(args);
//		}
//		else 
//		{
//			System.out.println("_____________________________________ T_H_A_N_K_Y_O_U ___________________________________________");
//		}
		
		
		while(true)
		{
			System.out.println(".................. WELCOME...................");
			System.out.println("PRESS 1 TO CREATE AND ADD AN EMPLOYEE TO ARRAYLIST");
			System.out.println("PRESS 2 TO DISPLAY DETAILS OF ALL THE EMPLOYEES PRESENT IN ARRAYLIST");
			System.out.println("PRESS 3 TO SEARCH AN EMPLOYEE BASED ON NAME");
			System.out.println("PRESS 4 TO DELETE AN EMPLOYEE BASED ON EID");
			System.out.println("PRESS 5 TO DISPLAY DETAILS OF ALL THE EMPLOYEE PRESENTIN THE ARRAYLIST IN THE ASCENDING ORDER OF SALARY");
			System.out.println("PRESS 6 TO EXIT");
			System.out.println("Enter Your Choice:");
			
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				addEmployee();
				break;
				
			case 2:
				displayDetails();
				break;
				
			case 3:
				searchEmployee();
				break;
				
			case 4:
				deleteEmployee();
				break;
				
			case 5:
				salaryAscendingDetails();
				break;
				
			case 6:
				System.out.println("_____________________________________ T_H_A_N_K_Y_O_U ___________________________________________");
				System.exit(0);
				break;
				
			default:
				System.out.println("Invelid Choice! kindly Enter valid Choice.");
			}
		}
		
		
		

	}

}

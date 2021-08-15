package Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class EqualsTest 
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.setId(101);
		e2.setId(101);
		
		//Prints 'true'
		System.out.println(e1.equals(e2));
		
		Set<Employee> employees = new HashSet<Employee>();
		employees.add(e1);
		employees.add(e2);
		
		System.out.println(employees);
	}
}

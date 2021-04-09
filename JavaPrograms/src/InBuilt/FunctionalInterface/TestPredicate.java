package InBuilt.FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestPredicate {
     static public ArrayList<Employee> employees;
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		/*
		 * Predicate<Integer> p = i -> i % 2 == 0; System.out.println(p.test(10));
		 */
		populateEmployees();
		Predicate<Employee> p1 = (e) -> e.salary>=10000;
		for(Employee e : employees)
		{
			if(p1.test(e)) {
				System.out.println(e.name);
			}
		}
	}  

	private static void populateEmployees() {
		// TODO Auto-generated method stub
		employees = new ArrayList<Employee>();
		employees.add(new Employee("name",2355));
		employees.add(new Employee("john",11000));
	}

}

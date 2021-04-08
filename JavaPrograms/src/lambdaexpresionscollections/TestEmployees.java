package lambdaexpresionscollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> e=new ArrayList<Employee>();
		e.add(new Employee("kowsar",19));
		e.add(new Employee("sweety",2));
		System.out.println(e);
		Comparator<Employee> c= (e1,e2)->(e1.eid<e2.eid)? -1:(e1.eid>e2.eid)?1: 0;
		Collections.sort(e,new EmployeeComparator());
		System.out.println(e);

	}

}

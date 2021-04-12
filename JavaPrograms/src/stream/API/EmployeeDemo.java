package stream.API;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDemo {

	public static void main(String[] args) {
     ArrayList<Employee> a = new ArrayList<Employee>();
     a.add(new Employee("kowar",57869));
     a.add(new Employee("pinky",3478));
     a.add(new Employee("sweety",21368));
     System.out.println(a);
     List<Employee> l = (List<Employee>)a.stream().sorted().collect(Collectors.toList());
	System.out.println(l);
	}

}

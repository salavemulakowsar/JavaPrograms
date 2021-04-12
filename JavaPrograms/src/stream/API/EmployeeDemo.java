package stream.API;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDemo {

	public static void main(String[] args) {
     ArrayList<Employee> a = new ArrayList<Employee>();
     a.add(new Employee("kowar",57869));
     a.add(new Employee("pinky",3478));
     a.add(new Employee("sweety",21368));
     System.out.println(a);
    // List<Employee> l = (List<Employee>)a.stream().sorted().collect(Collectors.toList());
	//System.out.println(l);
	Comparator<Employee> c = (e1,e2) ->(e1.sal>e2.sal)?1:(e1.sal<e2.sal)?-1:0;
	//Collections.sort(a,c);
	List<Employee> l = (List<Employee>)a.stream().sorted(c).collect(Collectors.toList());
	//Comparator<Employee> mc = (e1,e2)->e1.sal
	Employee mxsal=a.stream().min((e1,e2)->e1.compareTo(e2)).get();
	System.out.println(mxsal.toString());
	}	

}

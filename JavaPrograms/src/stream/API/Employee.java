package stream.API;

public class Employee implements Comparable<Employee> {
	
	String name;
	int sal; 
public Employee(String name, int sal) {
		super();
		this.name = name;
		this.sal = sal;
	}
@Override
public String toString()
{
	return (this.name+"\t"+sal);
}

  @Override public int compareTo(Employee o) { return (this.sal>o.sal)?1
  :(this.sal<o.sal)?-1 : 0; }
 

}

package lambdaexpresionscollections;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>
{
	public int compare(Employee e1,Employee e2)
	{
		if(e1.eid<e2.eid)return -1;
		else if(e1.eid>e2.eid)return 1;
		else return 0;
	}
}




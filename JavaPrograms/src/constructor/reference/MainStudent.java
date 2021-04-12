package constructor.reference;

public class MainStudent {

	public static void main(String[] args) {
//IStudent is = (name,age,roll,marks) -> new Student(name,age,roll,marks);
IStudent is = Student::new;
Student s = is.get("kowsar",20,502,873);
//System.out.println(name+" "+age+" "+roll+" "+marks);
	}

}

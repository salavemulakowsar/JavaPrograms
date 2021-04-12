package constructor.reference;

public class Student{
	public Student(String name, int age, int roll, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.roll = roll;
		this.marks = marks;
		System.out.println(name+" "+age+" "+roll+" "+marks);
	}
	String name;
	int age;
	int roll;
	int marks;
	//System.out.println(name+" "+age+" "+roll+" "+marks);

}

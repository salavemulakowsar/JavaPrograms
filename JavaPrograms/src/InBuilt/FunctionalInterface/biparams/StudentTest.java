package InBuilt.FunctionalInterface.biparams;

import java.util.ArrayList;
import java.util.function.Function;

public class StudentTest {
 static ArrayList<JavaStudent> javaStudents;
	public static void main(String[] args) {
	populateStudents();
	Function<JavaStudent,String> f = (j) -> {
		if(j.marks > 80) return "distinction";
		else if(j.marks > 60) return "first class";
		return "pass";
	};
	for(JavaStudent s: javaStudents)
	{
		System.out.println(s.name+"\t"+ f.apply(s));
	}

	}
	static ArrayList<JavaStudent> populateStudents() {
		// TODO Auto-generated method stub
		javaStudents=new ArrayList<JavaStudent>();
		javaStudents.add(new JavaStudent("kowsar",19));
		javaStudents.add(new JavaStudent("sweety",98));
		javaStudents.add(new JavaStudent("pinky",45));
		return javaStudents;
	}

}

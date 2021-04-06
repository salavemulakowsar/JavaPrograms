import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();  
		a.add("blue");  
		a.add("pink");  
		a.add("white");  
		a.add("black");  
		System.out.println("Returning element: "+a.get(3));//it will return the 2nd element, because index starts from 0    
		a.set(1,"green");    
		for(String color:a)    
			System.out.println(color);    


	}

}

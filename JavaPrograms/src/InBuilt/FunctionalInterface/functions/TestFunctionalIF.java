package InBuilt.FunctionalInterface.functions;

import java.util.function.Function;

//import com.sun.org.apache.xpath.internal.functions.Function;

public class TestFunctionalIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,Integer> f = i -> i*i;
		System.out.println(f.apply(4));
		Function<String,Integer> f2= i -> i.length();
		System.out.println("length of name kowsar is: "+f2.apply("kowsar"));

	}

}

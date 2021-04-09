package InBuilt.FunctionalInterface.predicates;

import java.util.function.Predicate;

public class ChainPredicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p1 = i-> i%2==0;
		Predicate<Integer> p2= i-> i >=10;
		int[] intArray = {10,5,7,11,23,34,55};
		//int c=20;
		for(int i:intArray)
		{

			if(p1.and(p2).test(i))
				System.out.println(i);
		}
		for(int i:intArray)
		{

			if(p1.or(p2).test(i))
				System.out.println(i);
		}
		for(int i:intArray)
		{

			if(p1.negate().test(i))
				System.out.println(i);
		}
	}

}

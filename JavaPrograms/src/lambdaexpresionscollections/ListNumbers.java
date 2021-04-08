package lambdaexpresionscollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ai = new ArrayList<Integer>();
		ai.add(15);
		ai.add(2);
		ai.add(1);
		ai.add(43);
		ai.add(32);
		//Collections.sort(ai);
		System.out.println(ai);
		Comparator<Integer> c= (o1,o2)->(o1<o2)? -1:(o1>o2)?1: 0;
		Collections.sort(ai,new MyComparator());
		System.out.println(ai);
		
		

	}

}

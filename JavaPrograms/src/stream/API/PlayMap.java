package stream.API;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

public class PlayMap {

	public static void main(String[] args) {
       ArrayList<Integer> marks = new ArrayList<Integer>();
       marks.add(34);
       marks.add(45);
       System.out.println(marks);
       List<Integer> updateMarks = marks.stream().map(i -> i+5).collect(Collectors.toList());
       System.out.println(updateMarks);
	}

}

import java.time.LocalDate;
import java.time.MonthDay;

public class MonthDayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MonthDay month = MonthDay.now();  
	    LocalDate date = month.atYear(2021);  
	    System.out.println(date);  

	}

}

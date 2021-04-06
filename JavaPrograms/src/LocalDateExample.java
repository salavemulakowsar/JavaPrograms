import java.time.LocalDate;

public class LocalDateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();  
	    LocalDate yesterday = date.minusDays(3);  
	    LocalDate tomorrow = yesterday.plusDays(5);  
	    System.out.println("Today date: "+date);  
	    System.out.println("Yesterday date: "+yesterday);  
	    System.out.println("Tommorow date: "+tomorrow);  

	}

}

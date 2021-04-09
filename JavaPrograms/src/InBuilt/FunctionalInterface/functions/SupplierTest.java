package InBuilt.FunctionalInterface.functions;

//import java.sql.Date;
import java.util.Date;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Date> s = () -> new Date();
		System.out.println(s.get());
		Supplier<String> otpSupplier = () -> {
			String otp = "";
			for(int i=0; i<6; i++)
			{
				otp=otp+(int)(Math.random()*10);
			}
			return otp;
		};
		System.out.println(otpSupplier.get());
		System.out.println(otpSupplier.get());
		System.out.println(otpSupplier.get());
	}
	

}

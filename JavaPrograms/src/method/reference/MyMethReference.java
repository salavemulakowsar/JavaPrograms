package method.reference;

public class MyMethReference {

	public static void main(String[] args) {
	
		MyInterface m = MyMethReference::add;
		m.add(3, 40);

	}
public static void add(int a, int b)
{
	//MyMethReference m;
	System.out.println("sum is:"+(a+b));
}
}

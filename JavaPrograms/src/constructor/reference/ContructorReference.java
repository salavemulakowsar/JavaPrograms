package constructor.reference;
class Sample{
	public Sample()
	{
		System.out.println("i am in sample constructor");
	}
	public Sample(String name)
	{
		System.out.println("name:"+name);
	}
}
public class ContructorReference {

	public static void main(String[] args) {
		ISample i =  Sample::new;
		//Sample s1 = i.get();
		Sample s1 = i.get("kowsar");

	}

}

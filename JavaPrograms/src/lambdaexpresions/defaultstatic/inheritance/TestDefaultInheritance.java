package lambdaexpresions.defaultstatic.inheritance;

public class TestDefaultInheritance implements Left,Right {
	@Override
	public void m1()
	{
		Left.super.m1();
		Right.super.m1();
		System.out.println("overridden method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDefaultInheritance tdi=new  TestDefaultInheritance();
				tdi.m1();

	}

}

package lambdaexpresions.defaultstatic;

public class FirstImpl implements SomeInterface{
	@Override
	public void method1()
	{
		System.out.println("method1 of firstimpl");
	}
	@Override
	public void method2()
	{
		System.out.println("method2 of firstimpl");
	}
	@Override
	public void method3()
	{
		//SomeInterface.super.method3();
		System.out.println(" firstimpl of method3");
	}


}

package lambdaexpresionsanonymous;

public class ThirdTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Interfacez i=new Interfacez() {
	  @Override
	  public void m2()
	  {
		  System.out.println("m2---interface");
	  }
	  @Override
	  public void m1()
	  {
		  System.out.println("m1---interface");
	  }
	  
  };
  i.m1();
 i.m2();
	}

}

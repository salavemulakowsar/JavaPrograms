
public class ExtendThread extends Thread{
	public void run()
	{
		System.out.println("Example for creating a thread by extending thread class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendThread e=new ExtendThread();
		e.start();
		
		

	}

}

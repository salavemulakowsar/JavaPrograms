
public class RunnableExample implements Runnable {
	public void run()
	{
		System.out.println("Creating a thread by implementing runnable interface");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RunnableExample r=new RunnableExample();
		Thread t=new Thread(r);
		t.start();
		

	}

}

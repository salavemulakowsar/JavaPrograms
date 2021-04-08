package lambdaexpresions;

public class MyRunnable implements Runnable {
	public void run() {
		for(int i=0;i<5;i++)
		{
		System.out.println("In the thread");
	}
	
	//()->
	for(int i=0;i<5;i++)
	{
		System.out.println("in the thread");
	}

}
}
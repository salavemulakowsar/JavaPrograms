package method.reference;

public class PlayMethodReference {

	public static void main(String[] args) {
		/*
		 * Runnable r = () ->{ for(int i=0; i<=5; i++) {
		 * System.out.println("i am in child thread"); } }; Thread t = new Thread(r);
		 * for(int i=0; i<=5; i++) { System.out.println("i am in main thread"); }
		 * t.start();
		 * 
		 */
		Runnable r = PlayMethodReference::m1;
		Thread t = new Thread(r);
		t.start();
		for(int i=0; i<=5; i++)
		{ System.out.println("i am in main thread");
		}
	}
				
		public static void m1()
		{
			for(int i=0; i<=5; i++)
			{
				System.out.println("i am from m1 thread");
			}
		}

	}



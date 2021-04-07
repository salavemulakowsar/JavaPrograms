import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DemoSerializationInheritance  {

	private static final String FILE_NAME = "inhertance.txt";

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Rabbit rabbit = new Rabbit();
		rabbit.i=999;
		rabbit.j=888;
		rabbit.k=777;
		FileOutputStream fos= new FileOutputStream(FILE_NAME);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(rabbit);
		System.out.println("begining to de serialize");
		FileInputStream fis= new FileInputStream(FILE_NAME);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Rabbit rabbit2 = (Rabbit)ois.readObject();
		System.out.println("rabbits variables i ="+rabbit2.i+"j="+rabbit2.j+"k="+rabbit2.k);
		

	}

}

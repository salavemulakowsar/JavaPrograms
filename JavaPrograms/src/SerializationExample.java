import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SerializationDemo s=new SerializationDemo();
		try
		{
		FileOutputStream fos=new FileOutputStream("dxc.txt");
         ObjectOutputStream oos=new ObjectOutputStream(fos);
         oos.writeObject(s);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		FileInputStream fis;
		try {
				fis=new FileInputStream("dxc.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		SerializationDemo s1=(SerializationDemo)ois.readObject();
		System.out.println(s1.i+"\t"+s1.j);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}

}

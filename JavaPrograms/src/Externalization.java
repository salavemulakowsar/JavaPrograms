import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Externalization implements Externalizable{
	String s="kowsar";
	int i=10,j;
	//int j=20;
	@Override
	public void writeExternal(ObjectOutput out)throws IOException
	{
		out.writeObject("salavemula");
		out.writeInt(30);
	}
	public void readExternal(ObjectOutput in) throws IOException, ClassNotFoundException
	{
		this.s=(String)((ObjectInputStream) in).readObject();
		this.i=((ObjectInputStream) in).readInt();
		//String s=(String)((ObjectInputStream) in).readObject();
		//int i=((ObjectInputStream) in).read();
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		Externalization ex=new Externalization();
		FileOutputStream fis=new FileOutputStream("externalizationDemo");
		ObjectOutputStream oos=new ObjectOutputStream(fis);
		oos.writeObject(ex);
		
		FileInputStream fis1=new FileInputStream("externalizationDemo");
		ObjectInputStream ois=new ObjectInputStream(fis1);
		Externalization ex2=(Externalization)ois.readObject();
		
		System.out.printf("i=" + ex2.i + "j=" + ex2.j + "s=" + ex2.s);
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}
	

}

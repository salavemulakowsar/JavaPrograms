package Assignment1;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		String string = "JavaProgramming";
		char array[] = string.toCharArray();
		String result = "";
		for(char i: array)
		{
			if (result.indexOf(i)== -1)
			{
				result+=i;
			}
		
		}
		System.out.println("Removing duplicate characters from a string remains:\n"+result);

	}

}

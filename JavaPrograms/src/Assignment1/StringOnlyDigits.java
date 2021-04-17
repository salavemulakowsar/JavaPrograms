package Assignment1;

public class StringOnlyDigits {
	public static boolean Digits(String string)
	{
		for(int i=0;i<string.length();i++)
		{
			if(Character.isDigit(string.charAt(i)))
				i++;
			else
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(Digits("164858"));
		}
}

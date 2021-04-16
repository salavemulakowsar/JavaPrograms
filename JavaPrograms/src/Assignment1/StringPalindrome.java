package Assignment1;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();
		String str2 = "";
		for(int i = str1.length()-1;i>=0;i--)
		{
			str2 += str1.charAt(i);
		}
		if(str1.contentEquals(str2))
			System.out.println("The given string is palindrome:"+str1);
		else
			System.out.println("The given string is not palindrome:"+str1);
		

	}

}

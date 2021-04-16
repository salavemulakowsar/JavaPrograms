package Assignment1;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		int number;
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		int sum = 0;
		int reverse;
		int temp = number;
		while(temp!=0)
		{
			reverse = temp % 10;
			sum = sum * 10 + reverse;
			temp/=10;
		}
		if (number == sum)
			System.out.println("The given number is palidrome:"+number);
		else
			System.out.println("The given number is not a palindrome:"+number);
		
		
		

	}

}


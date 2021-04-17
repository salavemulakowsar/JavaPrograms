package Assignment1;

import java.util.Arrays;

public class StringAnagram {
public static void main(String[] args) {
	String str1 = "eat";
	String str2 = "ate";
	if(str1.length()==str2.length())
	{
		
		char[] string1 = str1.toCharArray();
		char[] string2 = str2.toCharArray();
		Arrays.sort(string1);
		Arrays.sort(string2);
		if(Arrays.equals(string1,string2)==true)
			System.out.println("Two strings are anagrams");
		else
			System.out.println("two strings are not anagrams");
	}

	}

}

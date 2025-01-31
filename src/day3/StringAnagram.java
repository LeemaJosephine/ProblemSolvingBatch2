package day3;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		
		if(checkifanagram(str1,str2)) {
			System.out.println("Strings are anagram");
		} else {
			System.out.println("Not anagram");
		}
	}

	private static boolean checkifanagram(String str1, String str2) {
		// TODO Auto-generated method stub
		
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		char[] charArray = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		
		// Sort the array
		
		Arrays.sort(charArray);
		Arrays.sort(charArray2);
		
		// compare
		
		return Arrays.equals(charArray, charArray2);
		
	}

}

package day3;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		
		int result =getsubstring(str1,str2);
		if(result!=-1) {
			System.out.println(result);
		} else {
			System.out.println("-1");
		}
	}

	private static int getsubstring(String str1, String str2) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<=str1.length()-str2.length();i++) {
			if(str1.substring(i, i+str2.length()).equals(str2)) {
				return i;
			}
		}
		
		return -1;
	}

}

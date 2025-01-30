package day1;

import java.util.Scanner;

public class FindingFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		System.out.println(fact(num));
	}

	private static long fact(int num) {
		// TODO Auto-generated method stub
		
		long fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}

}


//Time complexity -> O(n)
//Space complexity -> O(1)
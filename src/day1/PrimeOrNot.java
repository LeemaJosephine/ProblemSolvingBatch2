package day1;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		if(isPrime(num)) {
			System.out.println("Prime number");
		} else {
			System.out.println("Not a prime");
		}
	}

	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		
		if(num<=1) {
			return false;
		}
		
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		
		return true;
		
	}

}

//Time complexity -> O(log n)
//Space complexity -> O(1)
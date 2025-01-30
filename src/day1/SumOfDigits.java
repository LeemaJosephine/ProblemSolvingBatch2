package day1;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		System.out.println(sumofdigits(num));
		
	}

	private static int sumofdigits(int num) {
		// TODO Auto-generated method stub
		
		int sum=0;
		while(num!=0) {
			
			sum+=num%10;
			num/=10;
			
		}
		
		return sum;
	}

}

// Time -> O(n)
//Space -> O(1)
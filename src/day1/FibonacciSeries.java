package day1;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		fibo(num);
	}

	private static void fibo(int num) {
		// TODO Auto-generated method stub
		
		int ft=0, st=1;
		
		for(int i=1;i<=num;i++) {
			System.out.println(ft+" ");
			
			int nt= ft + st;
			ft = st;
			st = nt;
		}
		
	}

}

//Time complexity -> O(n)
//Space complexity -> O(1)
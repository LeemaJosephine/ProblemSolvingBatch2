package day4;

import java.util.Scanner;

public class StairCaseProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int calculateways = calculateways(n);
		System.out.println(calculateways);
	}

	private static int calculateways(int n) {
		// TODO Auto-generated method stub
		
		if(n==0 || n ==1) {
			return 1;
		}
		
//		//find ways using DP solution
//		int[] ways = new int[n+1];
//		
//		ways[0]=1;
//		ways[1]=1;
//		
//		//Dp solution to calculate n-ways
//		
//		for(int i=2;i<=n;i++) {
//			
//			ways[i]=ways[i-1]+ways[i-2];
//		}
//		return ways[n];
		
		// Using recursion 
		return calculateways(n - 1) + calculateways(n -2);
		
	}

}

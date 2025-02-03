package day4;

import java.util.Scanner;

public class FiboUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		
		//array to store fibonacci series
		int[] fib=new int[num+1];
		
		//base case
		fib[0]=0;
		fib[1]=1;
		
		for(int i=2;i<=num;i++) {
			fib[i]=fib[i-1]+fib[i-2];  //dp solution
		}
		
		for(int i=0;i<num;i++) {
			System.out.print(fib[i]+" ");
		}
		
	}

}

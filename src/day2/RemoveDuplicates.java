package day2;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Size of the array");
		int n=sc.nextInt();
		
		System.out.println("Enter the elements of the array");
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int newLength= removeduplicates(arr,n);
		
		//display
		for(int i=0;i<newLength;i++) {
			System.out.println(arr[i]+" ");
		}
	}

	private static int removeduplicates(int[] arr, int n) {
		// TODO Auto-generated method stub
		
		if(n==0||n==1) {
			return n; // no duplicates 
		}
		
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j++]=arr[i];
			}
		}
		arr[j++]=arr[n-1];
		return j;
	}

}

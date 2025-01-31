package day2;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the position");
		int k=sc.nextInt();
		
		rotatearray(arr,k,n);
		
	}

	private static void rotatearray(int[] arr, int k, int n) {
		// TODO Auto-generated method stub
		
		// K value larger than the size of the array
		
		k=k%n;
		
		reverse(arr,0,k-1); // Reverse first K position element -> 2 1 
		reverse(arr,k,n-1); // Reverse the remaining element -> 2 1 6 5 4 3
		reverse(arr,0,n-1); // Reverse the entire array -> 3 4 5 6 1 2
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	private static void reverse(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		
		while(start<end) {
			
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}

}

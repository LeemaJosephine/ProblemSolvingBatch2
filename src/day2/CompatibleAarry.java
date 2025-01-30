package day2;

import java.util.Scanner;

public class CompatibleAarry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array1");
		int n=sc.nextInt();
		
		System.out.println("Enter the size of array2");
		int m=sc.nextInt();
		
		int[] arr1=new int[n];
		int[] arr2=new int[m];
		
		System.out.println("Enter the elements of arr1");
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter the elements of arr2");
		for(int i=0;i<m;i++) {
			arr2[i]=sc.nextInt();
		}
		
		if(checkcompatibility(arr1,arr2,n,m)) {
			System.out.println("Arrays are compatible");
		} else {
			System.out.println("Not compatible");
		}
	}

	private static boolean checkcompatibility(int[] arr1, int[] arr2, int n, int m) {
		// TODO Auto-generated method stub
		
		// Check the length of both the array
		if(n!=m) {
			return false;
		}
		
		for(int i=0;i<n;i++) {
			
			if(arr1[i]<arr2[i]) {
				return false;
			}
		}
		return true;
	}

}

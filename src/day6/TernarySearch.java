package day6;

import java.util.Scanner;

public class TernarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n = sc.nextInt();
		
		int[] arr=new int[n];
		
		System.out.println("Enter elements of the array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter target element");
		int target=sc.nextInt();
		
		int targetposition= ternarysearch(arr,0,n-1,target);
		System.out.print(targetposition);
	}

	private static int ternarysearch(int[] arr, int start, int end, int target) {
		
		if(end>=start) {
			
		 int mid1 = start + (end-start) /3;
		 int mid2 = end - (end-start) /3;
		 
		 //compare with target key
		 if(arr[mid1]==target) {
			 return mid1;
		 }
		 
		 if(arr[mid2]==target) {
			 return mid2;
		 }
		 
		 //target is smaller than mid1 -> search in left
		 if(target<arr[mid1]) {
			 
			 //search in left
			 return ternarysearch(arr, start, mid1-1, target);
		 } else if (target > arr[mid2]) {
			 
			 // search in right
			 return ternarysearch(arr, mid2+1, end, target);
		 } else {
			 
			 return ternarysearch(arr, mid1+1, mid2-1, target);
		 } 
		
		}
	return -1;
	
	}

}

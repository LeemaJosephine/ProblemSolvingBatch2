package day2;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//Size of the array
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		
		int[] arr= new int[n];
		
		//Get the elements of the array
		System.out.println("Enter the elements of the array");
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		//Get the element to search 
		System.out.println("Enter the element you want to search");
		int target=sc.nextInt();
		
		int index=binarysearch(arr,target);
		
		if(index==-1) {
			System.out.println("-1 element not found");	
		} else {
			System.out.println(index);
		}
	}

	private static int binarysearch(int[] arr, int target) {
		// TODO Auto-generated method stub
		
		int left=0;
		int right = arr.length-1;
		
		while(left<=right) {
			
			int mid=(left + right)/2;
			
			//Check target element matches with mid element
			if(arr[mid]==target) {
				return mid;
			}
			
			if(arr[mid]<target) {
				left=mid+1;
			} else {
				right=mid-1;
			}
					
		}
		return -1;
	}

}

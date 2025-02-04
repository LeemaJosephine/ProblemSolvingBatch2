package day5;

import java.util.Scanner;

public class CountSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		
		System.out.println("Before sorting");
		displayarray(array); 
		countsort(array,n);
		System.out.println("After sorting");
		displayarray(array);
	}

	private static void countsort(int[] array, int n) {
		
		//find the maximum element in array
		int max=array[0];
		for(int i=1;i<n;i++) {
			if(array[i]>max) {
				//update the max
				max=array[i]; 
			}
		}
		
		//create a count array of maximum elements
		int[] count = new int[max+1];
		
		//count the frequency 
		for(int i=0;i<n;i++) {
			count[array[i]]++;
		}
		
		//update the original array
		int index=0;
		for(int i=0;i<count.length;i++) {
			while(count[i]>0) {
				array[index++]=i; // place the element and move to next position
				count[i]--;
			}
		}
	}

	private static void displayarray(int[] array) {
		
		for(int i:array) {
			System.out.print(i+" ");
		} System.out.println();
	}

}

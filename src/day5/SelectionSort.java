package day5;

import java.util.Scanner;

public class SelectionSort {

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
		selectionsort(array,n);
		System.out.println("After sorting");
		displayarray(array);
	}

	private static void selectionsort(int[] array, int n) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<n;i++) {
			
			//assume first element is minimum
			int minindex=i; //0
			
			for(int j=i+1;j<n;j++) {
				//compare
				if(array[j]<array[minindex]) {
					minindex=j;
					
				}
			}
			
			int temp=array[minindex];
			array[minindex]=array[i];
			array[i]=temp;
		}
	}

	private static void displayarray(int[] array) {
		// TODO Auto-generated method stub
		for(int i:array) {
			System.out.print(i+ " ");
		} System.out.println();
	}

}

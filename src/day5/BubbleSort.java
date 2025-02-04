package day5;

import java.util.Scanner;

public class BubbleSort {

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
		bubblesort(array,n);
		System.out.println("After sorting");
		displayarray(array);
	}

	private static void displayarray(int[] array) {
		// TODO Auto-generated method stub
		
		for(int i: array) {
			System.out.print(i+" ");
		}
		System.out.println();
		
	}

	private static void bubblesort(int[] array,int n) {
		// TODO Auto-generated method stub
		
		boolean swapped;
		
		for(int i=0;i<n-1;i++) {
			swapped=false;
			for(int j=0;j<n-i-1;j++) {
				if(array[j]>array[j+1]) {
					
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					swapped=true;
				}
			}
			
			if(!swapped) {
				break;
			}
		}
	}

}

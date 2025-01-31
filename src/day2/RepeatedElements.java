package day2;

import java.util.HashSet;
import java.util.Scanner;

public class RepeatedElements {

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
		
		getrepeatedelements(arr);
	}

	private static void getrepeatedelements(int[] arr) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> obj1= new HashSet<Integer>(); //keep the element as it is
		HashSet<Integer> obj2= new HashSet<Integer>(); //repeated elements
		
		//traverse through array
		for(int i=0;i<arr.length;i++) {
			if(obj1.contains(arr[i])) {
				obj2.add(arr[i]); // repeated
			} else {
				
				obj1.add(arr[i]); 
			}
		}
		
		//print the element
		
		if(obj2.isEmpty()) {
			System.out.println("No repeated elements");
		} else {
			for(int repeated: obj2) {
				System.out.print(repeated+" ");
			}
		}
	}

}

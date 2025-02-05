package day6;

import java.util.Scanner;

public class HashTableArray {

	private int[] table;
	private int size;
	
	public HashTableArray(int size) {
		
		this.size=size;
		table=new int[size];
		
		for(int i=0;i<size;i++) {
			 table[i]=-1; // setting all the hash table slots to -1
		 }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		
		HashTableArray ht = new HashTableArray(size);
		
		System.out.println("Enter the value of the array");
		for(int i=0;i<size;i++) {
			int key=sc.nextInt();
			ht.insert(key);
		}
		
		System.out.println("Elements of the array");
		ht.display();
		System.out.println();
		
		System.out.println("Enter the element to search");
		int search=sc.nextInt();
		if(ht.search(search)) {
			System.out.println("Element found");
		} else {
			System.out.println("-1");
		}
	}

	private boolean search(int key) {
		// TODO Auto-generated method stub
		
		int index=hashfucntion(key);
		
		while(table[index]!=-1) {
			if(table[index]==key) {
			return true;
			}
			
			index=(index+1)%size;
		}
		 return false;
		
	}

	private void display() {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++) {
			if(table[i]==-1) {
				System.out.print("-1");
			} else {
				System.out.print(table[i]+" ");
			}
		}
	}
	
	private int hashfucntion(int key) {
		
		return key%size;
	}

	private void insert(int key) {
		// TODO Auto-generated method stub
		
		int index = hashfucntion(key);
		//linear probing
		while(table[index]!=-1) {
			
			//calculate the next index
			index=(index+1)%size;
		}
		
		table[index]=key;
	}

}

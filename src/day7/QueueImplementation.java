package day7;

import java.util.Scanner;

public class QueueImplementation {


	public int[] queue;
	public int size;
	public int rear;
	public int front;
	
	public QueueImplementation(int size) {
		
		this.size=size;
		queue = new int[size];
		front=0;
		rear=-1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Queue Implementation");
		System.out.println("Enter the size of queue");
		int size = sc.nextInt();
		
		QueueImplementation st = new QueueImplementation(size);
		
		//Menu driven program
		
		while(true) {
			
			
			System.out.println("1.Enqueue");
			System.out.println("2.Dequeue");
			System.out.println("3.Peek");
			System.out.println("4.Display");
			System.out.println("5.Exit");
			
			System.out.println("Enter your choice");
			
			int choice = sc.nextInt();
			
			switch(choice) {
				
			case 1:
				System.out.println("Enter an element to push");
				int element = sc.nextInt();
				st.enqueue(element);
				break;
			case 2: 
				System.out.println("Top most element will be removed");
				st.dequeue();
				break;
			case 3:
				int topelement=st.peek();
				if(topelement!=-1) {
					System.out.println("Top most element: "+topelement);
					break;
				}
			case 4: 
				st.display();
				break;
			case 5:
				System.out.println("Exiting..");
				System.exit(0);
			}
		}
	}

	private void display() {
		// TODO Auto-generated method stub
		if(front>rear) {
			System.out.println("Queue underflow");
			return;
		}
		
		for(int i=front;i<=rear;i++) {
			System.out.print(queue[i]+" ");
		}
		System.out.println();
	}

	private int peek() {
		// TODO Auto-generated method stub
		if(front>rear) {
			System.out.println("Queue underflow");
			return -1;
		}
		
		return queue[front];
	}

	private int dequeue() {
		// TODO Auto-generated method stub
		
		if(front > rear) {
			System.out.println("Queue underflow");
			return -1;
		}
		
		return queue[front++];
	}

	private void enqueue(int element) {
		// TODO Auto-generated method stub
		
		if(rear==size-1) {
			System.out.println("Queue overfloe");
			return;
		}
		 queue[++rear]=element;
		 System.out.println(element);
	}

}

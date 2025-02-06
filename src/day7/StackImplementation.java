package day7;

import java.util.Scanner;

public class StackImplementation {

	public int[] stack;
	public int size;
	public int top;
	
	public StackImplementation(int size) {
		
		this.size=size;
		stack = new int[size];
		top=-1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Stack Implementation");
		System.out.println("Enter the size of stack");
		int size = sc.nextInt();
		
		StackImplementation st = new StackImplementation(size);
		
		//Menu driven program
		
		while(true) {
			
			
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("4.Display");
			System.out.println("5.Exit");
			
			System.out.println("Enter your choice");
			
			int choice = sc.nextInt();
			
			switch(choice) {
				
			case 1:
				System.out.println("Enter an element to push");
				int element = sc.nextInt();
				st.push(element);
				break;
			case 2: 
				System.out.println("Top most element will be removed");
				st.pop();
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
		if(top==-1) {
			System.out.println("Stack underflow");
			return;
		}
		
		for(int i=0;i<=top;i++) {
			System.out.print(stack[i]+" ");
		}
		System.out.println();
				
	}

	private int peek() {
		// TODO Auto-generated method stub
		if(top==-1) {
			System.out.println("Stack underflow");
			return -1;
		}
		
		return stack[top];
		
	}

	private int pop() {
		// TODO Auto-generated method stub
		
		if(top==-1) {
			System.out.println("Stack underflow");
			return -1;
		}
		
		return stack[top--];
		
	}

	private void push(int element) {
		// TODO Auto-generated method stub
		
		if(top==size-1) {
			System.out.println("Stack overflow");
			return;
		}
		
		//top=top+1;
		//stack[top]=element;
		
		stack[++top]=element;
		System.out.println(element);
		
	}

}

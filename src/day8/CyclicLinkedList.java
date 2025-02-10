package day8;

import java.util.Scanner;

class Nodes{
	
	int data;
	Nodes next;
	
	public Nodes(int data) {
		this.data=data;
		this.next=null;
	}
}
public class CyclicLinkedList {

	Nodes head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CyclicLinkedList list = new CyclicLinkedList();
		Scanner sc = new Scanner(System.in);
		
		//Menu driven program
		
		while(true) {
			System.out.println("1.Insert at beginning");
			System.out.println("2.Create loop");
			System.out.println("3.Detect a loop");
			System.out.println("4.Traversal of the list");
			System.out.println("5.Exit");
			
			System.out.println("Enter your choice");
			
			int choice = sc.nextInt();
			
			switch(choice) {
				
			case 1:
				System.out.println("Enter an element to insert at beginning");
				int valbeg = sc.nextInt();
				list.insertatBegin(valbeg);
				break;
			case 2: 
				System.out.println("Enter the position to create the loop");
				int pos = sc.nextInt();
				list.createloop(pos);
				break;
			case 3:
				list.detectloop();
				break;
			case 4: 
				list.display();
				break;
			case 5:
				System.out.println("Exiting..");
				System.exit(0);
			}
		}
		
	}
	private void display() {
		// TODO Auto-generated method stub
		
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		int count=0;
		Nodes temp=head;
		while(temp!=null && count<20) {
			
			System.out.print(temp.data+"->");
			temp=temp.next;
			count++;
		}
		System.out.println("NULL");
		
	}
	private boolean detectloop() {
		// TODO Auto-generated method stub
		
		Nodes slow=head;
		Nodes fast=head;
		
		while(fast!=null && fast.next!=null) {
			//move slow by 1 anf fast ny 2
			slow = slow.next;
			fast = fast.next.next;
			
			// slow and fast meet 
			if(slow==fast) {
				System.out.println("Loop detected");
				return true;
			}
		}
		System.out.println("Loop not detected");
		return false;
		
	}
	private void createloop(int pos) {
		// TODO Auto-generated method stub
		
		if(head==null)
			return;
		
		Nodes temp=head;
		Nodes loopnode=null;
		int count=1;
		
		while(temp.next!=null) {
			if(count==pos) {
				loopnode=temp;
			}
			temp=temp.next;
			count++;
		}
		
		temp.next=loopnode;
	}
	private void insertatBegin(int valbeg) {
		// TODO Auto-generated method stub
		Nodes newnode = new Nodes(valbeg);
		newnode.next=head;
		head=newnode;
	}

}

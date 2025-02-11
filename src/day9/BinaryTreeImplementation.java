package day9;

import java.util.Scanner;

class Node{
	
	int data;
	Node left,right;
	
	Node(int value){
		 
		data=value;
		left=right=null;
	}
}

class BinaryTree{
	
	Node root;
	
	public BinaryTree() {
		
		root=null;
	}

	public Node insert(Node root, int data) {
		// TODO Auto-generated method stub
		
		if(root==null) {
			
			root= new Node(data);
			return root;
		}
		
		if(data<root.data) {
			
			root.left=insert(root.left,data);
		} else if (data>root.data) {
			
			root.right=insert(root.right,data);
		}
			
			
		return root;
	}

	public void inorder(Node node) {
		// TODO Auto-generated method stub
		
		if(node==null)
			return;
		
		inorder(node.left);
		System.out.print(node.data+" "); //root
		inorder(node.right);
	}

	public void preorder(Node node) {
		// TODO Auto-generated method stub
		
		if(node==null)
			return;
		
		System.out.print(node.data+" ");
		preorder(node.left);
		preorder(node.right);
		
	}

	public void postorder(Node node) {
		// TODO Auto-generated method stub
		
		if(node==null)
			return;
		
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data+" ");
	}

	public boolean search(Node node, int key) {
		// TODO Auto-generated method stub
		
		if(node==null)
			return false;
		
		if(node.data==key)
			return true;
		
		boolean res1= search(node.left,key);
		
		if(res1)
			return true;
		
		boolean res2 = search(node.right,key);
		return res2;
		
		
	}

	public int height(Node node) {
		// TODO Auto-generated method stub
		
		if(node==null)
			return -1;
		
		int leftside = height(node.left);
		int rightside = height(node.right);

		return Math.max(leftside, rightside) + 1;
		
		
	}
}
public class BinaryTreeImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree bt = new BinaryTree();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no.of nodes");
		int noofnodes=sc.nextInt();
		
		for(int i=0;i<noofnodes;i++) {
			
			int value=sc.nextInt();
			bt.root=bt.insert(bt.root,value);
		}
		
		System.out.println("Inorder");
		bt.inorder(bt.root);
		System.out.println();
		
		System.out.println("Preorder");
		bt.preorder(bt.root);
		System.out.println();
		
		System.out.println("Postorder");
		bt.postorder(bt.root);
		System.out.println();
		
		System.out.println("Enter an element to search");
		int key=sc.nextInt();
		if(bt.search(bt.root,key)) {
			System.out.println("Found");
		} else {
			System.out.println("Not found");
		}
		
		System.out.println("Height of the Binary Tree");
		System.out.println(bt.height(bt.root));
	}

}

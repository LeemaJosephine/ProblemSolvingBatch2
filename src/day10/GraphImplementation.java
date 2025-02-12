package day10;

import java.util.ArrayList;
import java.util.Scanner;

	
	/*	List{
		
		node1 -> list
		node2 -> list
	} */
	
	
	class Graph{
		
		int nodes;
		
		// Represent in List
		ArrayList<ArrayList<Integer>> adjlist;
		
		public Graph(int nodes) {
			
			this.nodes=nodes;
			adjlist = new ArrayList<>();
			
			for(int i=0;i<nodes;i++) {
				
				adjlist.add(new ArrayList<Integer>());
			}
		}

		public void addEdge(int src, int dest) {
			// TODO Auto-generated method stub
			// directed graph
			
			adjlist.get(src).add(dest); // 0 -> 1 2 3 
			
//			//undirected graph
//			
//			adjlist.get(dest).add(src);
			
		}

		public void display() {
			// TODO Auto-generated method stub
			
			for(int i=0;i<nodes;i++) {
				System.out.print("Vertices "+i+ ": ");
				for(int data:adjlist.get(i)) {
					System.out.print(data +" ");
				}
				
				System.out.println();
			}
		}
	}
	
public class GraphImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of Verices: ");
		int nodes=sc.nextInt(); // node number
		System.out.println("Enter the number of Edges");
		int edges=sc.nextInt(); // no of edges
		
		Graph graph= new Graph(nodes);
		
		System.out.println("Enter the endge for every vertices");
		for(int i=0;i<edges;i++) {
			int src=sc.nextInt();
			int dest=sc.nextInt();
			
			graph.addEdge(src,dest);
		}
		
		graph.display();
	}

}

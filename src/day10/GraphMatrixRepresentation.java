package day10;

import java.util.Scanner;


	class GraphAdjMatrix{
		
		int nodes;
		int [][] adjmatrix;
		
		public GraphAdjMatrix(int nodes) {
			this.nodes=nodes;
			adjmatrix=new int[nodes][nodes];
		}

		public void addEdge(int src, int dest) {
			// TODO Auto-generated method stub
			adjmatrix[src][dest]=1; //directed graph
			
			//adjmatrix[dest][src]=1; //undirected graph
		}

		public void display() {
			// TODO Auto-generated method stub
			for(int i=0;i<nodes;i++) {
				for(int j=0;j<nodes;j++) {
					System.out.print(adjmatrix[i][j]+ " ");
				}
				System.out.println();
				
			}
		}
	}
	
public class GraphMatrixRepresentation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of vertices");
		int nodes=sc.nextInt();
		
		GraphAdjMatrix graph= new GraphAdjMatrix(nodes);
		
		System.out.println("Enter the no of edges");
		int edges=sc.nextInt();
		
		System.out.println("Enter the endge for every vertices");
		for(int i=0;i<edges;i++) {
			int src=sc.nextInt();
			int dest=sc.nextInt();
			
			graph.addEdge(src,dest);
		}
		
		graph.display();
	}

}

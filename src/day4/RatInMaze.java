package day4;

import java.util.Scanner;

public class RatInMaze {

	static int N;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of the maze");
		N=sc.nextInt();
		
		int[][] maze = new int[N][N];
		
		System.out.println("Enter the input 1 and 0 for path selection");
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				maze[i][j]=sc.nextInt();
			}
		}
		
		int[][] sol =new int[N][N];
		
		if(solveMaze(maze,sol,0,0)) {
			System.out.println("Solution found");
			displaysolution(sol);
		} else {
			System.out.println("Solution not found");
		}
	}
	private static void displaysolution(int[][] sol) {
		// TODO Auto-generated method stub
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(sol[i][j]+" ");
			}
			System.out.println();
		}
	}
	private static boolean solveMaze(int[][] maze, int[][] sol, int x, int y) {
		
		//if the rat reached its destination
		if(x==N-1&&y==N-1) {
			
			sol[x][y]=1;
			return true;
		}
		
		if(isSafe(maze,x,y)) {
			
			sol[x][y]=1;
		
		//move to right
		if(solveMaze(maze, sol, x, y+1))
			return true; // recursive
		
		// move down
		if(solveMaze(maze, sol, x+1, y))
			return true;
		
		sol[x][y]=0; // blocked cell -> backtracking
		return false;
		
		}
		
		return false;
	}
	private static boolean isSafe(int[][] maze, int x, int y) {
		
		return (x>=0 && y>=0 && x<N && y<N && maze[x][y]==1);
	}

}

package day7;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String expr = sc.nextLine();
		
		if(checkbalanced(expr)) {
			System.out.println("Balanced");
		} else {
			System.out.println("Not balanced");
		}
	}

	private static boolean checkbalanced(String expr) {
		// TODO Auto-generated method stub
		
		Stack<Character> st = new Stack<Character>();
		for(int i=0;i<expr.length();i++) {
			
			char ch= expr.charAt(i);
			
			//push
			if(ch=='('||ch=='['||ch=='{') {
				st.push(ch);
			} else if(ch==')'||ch==']'||ch=='}') {
				
				if(st.isEmpty()) {
					return false;
				}
				
				char top = st.pop();
				
				if(ch==')' && top!='(' ||
						ch ==']' && top !='[' ||
						ch == '}' && top!='{') {
					return false;
				}
			}
		}
		
		return st.isEmpty();
		
		
	}

}

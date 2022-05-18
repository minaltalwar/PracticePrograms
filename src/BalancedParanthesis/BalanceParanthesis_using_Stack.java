/*
 * 
 */

package BalancedParanthesis;

import java.util.Stack;

public class BalanceParanthesis_using_Stack {
	public static void main(String[] args)
    {
		String str = "[ ( c - d )* e ]";
		System.out.println(solution(str));
    }

	private static boolean solution(String str) {
		Stack<Character> stack = new Stack<Character>();
		for(int i=0 ; i<str.length();i++) {
			char current = str.charAt(i);
			if(current == '(' || current == '[' || current == '{') {
				stack.push(current);
			}
			if(current == ')' || current == ']' || current == '}') {
				if (stack.isEmpty())
					return false;
		        char last = stack.peek();
		        if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
		        	stack.pop();
		             else 
		            	 return false;

			}
			
			
	}
		return stack.isEmpty()? true : false;
	}

}

import java.util.*;


/*
 * 1. Brackets
Determine whether a given string of parentheses (multiple types) is properly nested.
A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:

S is empty;
S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
S has the form "VW" where V and W are properly nested strings.
For example, the string "{[()()]}" is properly nested but "([)()]" is not.
given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.
For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", the function should return 0
N is an integer within the range [0..200,000];
string S consists only of the following characters: "(", "{", "[", "]", "}" and/or ")".
 */
public class Brackets_test {
	 public static boolean solution(String S) {
		 if (S.isEmpty())
			 return true;
			 
			 Stack<Character> stack = new Stack<Character>();
			 for (int i = 0; i < S.length(); i++)
			 {
			 char current = S.charAt(i);
			 if (current == '{' || current == '(' || current == '[')
			 {
			 stack.push(current);
			 }
			 if (current == '}' || current == ')' || current == ']')
			 {
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
	


	  public static void main(String[] args) {
			String A =  "blah((a)blah())()" ;   
	        System.out.println(solution(A));

		}
}

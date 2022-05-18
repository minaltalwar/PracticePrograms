import java.util.Stack;

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
public class Brackets_CheckIfStringOFBracketIsProperlyNested_Coadility {
	  public static int solution(String S) {
		    Stack<Character> T = new Stack<Character>();
		    int n = S.length();
		    for (int i = 0; i < n; i++) {
		      char s = S.charAt(i);
		      if (s == '(' || s == '[' || s == '{') {
		        T.push(s);
		      } else {
		        if (
		          T.size() == 0
		          || (s == ')' && T.peek() != '(')
		          || (s == ']' && T.peek() != '[')
		          || (s == '}' && T.peek() != '{')
		        ) {
		          return 0;
		        }
		        T.pop();
		      }		
		    }
		    return T.size() == 0 ? 1 : 0;
		  }
	  
	  public static void main(String[] args) {
			String A =  "{[()()]}" ;   
	        System.out.println(solution(A));

		}
}

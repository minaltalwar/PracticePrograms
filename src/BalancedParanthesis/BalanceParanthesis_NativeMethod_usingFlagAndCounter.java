/*
 * Time complexity: O(N) 
   Auxiliary Space: O(1)
 * 
 */
package BalancedParanthesis;

public class BalanceParanthesis_NativeMethod_usingFlagAndCounter {

	public static void main(String[] args)
    {
		String str = "blah((a)blah())()";
		System.out.println(solution(str));
    }

	private static boolean solution(String str) {
		boolean flag = true ;
		int count =0;
		for(int i=0; i< str.length() ; i++) {
			char current = str.charAt(i);
			if(current == '(' || current == '[' || current == '{') {
				count++;
			}
			else if(current == ')' || current == ']' || current == '}') {
				count--;
			}
			else {
				continue;
			}
			if (count < 0) {
				flag = false;
				break;
			}
			
		}
		if (count != 0) {
			flag = false;
		}
		return flag;
				
		
	}
    
	
	
}

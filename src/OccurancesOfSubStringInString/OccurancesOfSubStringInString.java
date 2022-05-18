/*
 * complexity: O(n log n)
 */

package OccurancesOfSubStringInString;
/*
 *      String S = "babi thisisbaby whereisbaby bibyissleeping";
		String T = "baby";
		should return [11,23]
 * 
 */

import java.util.*;
public class OccurancesOfSubStringInString {

	public static void main(String[] args) {
		String S = "AAAAAAAAAAAAAAAAAB";
		String T = "AAAAB";
		System.out.println("Index of Occurance of all substring in a string : "+Arrays.toString(OccurancesOfSubStringInString(S,T)));

	}

	private static int[] OccurancesOfSubStringInString(String s, String t) {
		int tLength = t.length();
		int[] res =  new int[s.length()];
		int count = 0;
		int base = 0;
		String current = s;
		while(current.contains(t)) {
			int index = current.indexOf(t);
			
			res[count] = index + base;
		
			base += index + tLength;
			
			current = current.substring(current.indexOf(t) +  tLength, current.length());
		
			count++;			
			
		}
		int[] indexes;
		return indexes = Arrays.copyOf(res, count);

	}

}

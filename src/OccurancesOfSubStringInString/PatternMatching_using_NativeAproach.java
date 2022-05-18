/*
 * complexity: O(n x m) or O(n2)
 */

package OccurancesOfSubStringInString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PatternMatching_using_NativeAproach {

	public static void main(String[] args) {
		String S = "babi thisisbaby whereisbaby babyissleeping";
		String T = "baby";
		System.out.print(Arrays.toString(printIndexes(S,T)));

	}

	private static int[]  printIndexes(String s, String t) {
		boolean flag = false;
		// create a new ArrayList
       
        List<Integer> list = new ArrayList<>();
        
		for (int i=0 ; i< s.length() - t.length() + 1 ; i++) {
			if(s.substring(i, i + t.length()).equals(t)) {
				//System.out.print(i + " ");
				list.add(i);
				flag = true;
			}		
		}
		
		if (flag == false) {
			System.out.println("NONE");
		}
		
		// ArrayList to Array Conversion
		return list.stream().mapToInt(Integer::intValue).toArray();
	}

	
}
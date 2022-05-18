import java.util.HashSet;

/*
 * Given a string s, find the length of the longest substring without repeating characters.
 * Input: s = "abcabcbb"
 * Output: 3
 * Input: s = "bbbbb"
 * Output: 1
 * Input: s = "pwwkew"
 * Output: 3 
 */
public class LongestSubstringWithoutRepeatingCharacters {
	
	

	public static int lengthOfLongestSubstring(String s) {
	    int a_pointer=0;
		int b_pointer=0;
		int max = 0;
		
		HashSet<Character> hash_set = new HashSet<>();
		
		while (b_pointer < s.length()) 
	    {
			if(!hash_set.contains(s.charAt(b_pointer))) 
	        {
				hash_set.add(s.charAt(b_pointer));
				b_pointer++;
				max = Math.max(hash_set.size(), max);
			}
			else
			{
				hash_set.remove(s.charAt(a_pointer));
				a_pointer++ ;
			}
		  
		}
	return max;
	    }
	
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcaa"));

	}
	
}

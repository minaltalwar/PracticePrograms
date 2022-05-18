/*
 *  given an array A of N integers, 
returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.
 */

import java.util.*;

public class SmallestPositiveMissingIntegerInArray {
	public static int solution(int[] A) {
        int N = A.length;
        Set<Integer> set = new HashSet<>();
        for(int a : A)
        {
            if(a>0) 
            {
                set.add(a);
            }
        }
        int i;
        for(i=1 ; i<= N+1 ; i++)
        {
            if(!set.contains(i)){
                return i;
            }  

        }
    return i;
    }

	public static void main(String[] args)
    {
        int[] A = { 1, 3, 6, 4, 1, 2 };        
        System.out.println(solution(A));

    }
}

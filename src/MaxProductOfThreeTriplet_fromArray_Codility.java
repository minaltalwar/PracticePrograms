/*
 * A non-empty array A consisting of N integers is given. The product of triplet (P, Q, R) equates to A[P] * A[Q] * A[R] (0 ≤ P < Q < R < N).

For example, array A such that:

  A[0] = -3
  A[1] = 1
  A[2] = 2
  A[3] = -2
  A[4] = 5
  A[5] = 6
contains the following example triplets:

(0, 1, 2), product is −3 * 1 * 2 = −6
(1, 2, 4), product is 1 * 2 * 5 = 10
(2, 4, 5), product is 2 * 5 * 6 = 60
Your goal is to find the maximal product of any triplet.
 */
import java.util.*;
public class MaxProductOfThreeTriplet_fromArray_Codility {
	public static int solution(int[] A) {
	      Arrays.sort(A);
	      int n=A.length;
	       return Math.max(
	           A[0]*A[1]*A[n-1],
	           A[n-3]*A[n-2]*A[n-1]
	       );
	    }

	public static void main(String[] args) {
		int[] A = { -1, -1, 0, 1, 0, 0, 5, 1, 0, -1, 2, 5 };   
        System.out.println(solution(A));

	}

}

/*
 * Coadility Question:
 * Determine whether a triangle can be built from a given set of edges.
 * An array A consisting of N integers is given. A triplet (P, Q, R) is triangular if 0 ≤ P < Q < R < N and:

A[P] + A[Q] > A[R],
A[Q] + A[R] > A[P],
A[R] + A[P] > A[Q].
E.g for Array A = { 10,2,5,1,8,20 } , Triplet (0, 2, 4) is triangular.
Solution should returns 1 if there exists a triangular triplet for this array and returns 0 otherwise.
 */
import java.util.*;
public class Triangle_CheckIfTriangleCanBeBuildFromGivenSetOfEdges_Coadility {

	
	public static int solution(int[] A) {
        Arrays.sort(A);
        if(A.length < 3){
            return 0;
        }
        for(int i=0;i<A.length-2 ; i++)
            if((long)A[i] + (long)A[i+1] > (long)A[i+2]){
                return 1;
            }
            return 0;
    }
	public static void main(String[] args) {
		int[] A = { 10,2,5,1,8,20 };   
        System.out.println(solution(A));


	}

}

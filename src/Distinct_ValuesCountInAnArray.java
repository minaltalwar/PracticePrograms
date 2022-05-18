import java.util.HashSet;

public class Distinct_ValuesCountInAnArray {

	  public static int solution(int[] A) {
	       int n = A.length;
	       HashSet<Integer> hs = new HashSet<Integer>();

	       for(int i=0; i<n ; i++){
	           hs.add(A[i]);
	       }
	       return hs.size();
	    }
	public static void main(String[] args) {
		int[] A = { -1, -1, 0, 1, 0, 0, 5, 6, 0, -1, 8, 5 };   
        System.out.println(solution(A));

	}

}

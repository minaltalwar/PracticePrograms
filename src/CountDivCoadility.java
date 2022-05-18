/*
 * Compute number of integers divisible by k in range [a..b].
 * 
 */

public class CountDivCoadility {
	
	public static int solution(int A, int B, int K) {
        // write your code in Java SE 8
         int count = B/K - A/K;
    if(A%K == 0) {
        count++;
    }
    return count;
    }

	public static void main(String[] args) {
		int A = 6, B = 11 , K = 2;
        System.out.println(solution(A,B,K));
	}

}

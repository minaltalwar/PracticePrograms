
public class PassingCarsOnRoadCoadility {
	 public static int solution(int[] A) {
	        int count = 0;
	        int zeroCount = 0;
	        for (int i = 0; i < A.length; i++) {
	            if (A[i] == 0) {
	                zeroCount++;
	            } else if (A[i] == 1) {
	                count += zeroCount;
	            }
	        }
	        return count >= 0 && count <= 1000_000_000 ? count : -1;
	    }

	public static void main(String[] args)
    {
		int[] A = { 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1 };   
        System.out.println(solution(A));

    }

}

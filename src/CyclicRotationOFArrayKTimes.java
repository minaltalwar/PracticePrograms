import java.util.Arrays;

public class CyclicRotationOFArrayKTimes {


	    public static int[] solution(int[] A, int K) {
	         
	        for (int i = 0; i < K; i++) 
	        {
	            int last = A[A.length-1];
	            for(int j =A.length-2 ; j>=0 ; j--)
	            {
	                A[j+1] = A[j];
	            }
	            A[0]=last;
	        }
	         return A;
	    }
	   

	 public static void main(String[] args)
	    {
	        int[] A = { 1, 2, 3, 4, 5, 6, 7 };
	        int k = 3;
	        
	        solution(A,k);
	 
	        System.out.println(Arrays.toString(A));
	    }
	
}

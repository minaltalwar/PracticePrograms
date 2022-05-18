/*
 * https://app.codility.com/demo/results/trainingW2VW4C-PPM/
 */
import java.util.Arrays;

public class DiscIntersection_Coadility {
	
	public static int solution(int[] A) {
	       long[] leftpoint=new long[A.length];
	        long[] rigthpoint=new long[A.length];
	        if(A.length<2)return 0;
	    
	        for(int i=0;i<A.length;++i){
	            leftpoint[i]=-A[i];
	            leftpoint[i]+=i;
	            rigthpoint[i]=+A[i];
	            rigthpoint[i]+=i;
	        }
	        Arrays.sort(leftpoint);
	        Arrays.sort(rigthpoint);
	        int intersection =0;
	        int j=0;
	        int i=0;
	        int open=0;
	        while(i<A.length&&j<A.length){
	             if(rigthpoint[i]>=leftpoint[j]){
	                   intersection+=open; 
	                   open++; 
	                   j++;
	             }else{
	                 open--;
	                 i++;
	             }
	             if(intersection>10000000)return -1;
	            }
	        return intersection;
	    }

	public static void main(String[] args) {
		int[] A = { 1,5,2,1,4,0 };   
        System.out.println(solution(A));

	}

}

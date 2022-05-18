
public class Container_With_Most_Water {

	public static void main(String[] args) {
		int height[] = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));

	}
	public static int maxArea(int[] height) {
		 int size = height.length;
		 int left = 0;
	        int right = size-1;
	        int max_area = 0;
	        while(left != right){
	            if(height[left] < height[right]){
	                max_area = Math.max(max_area, height[left]*(right-left));
	                left++;
	            }
	             else{
	                 max_area = Math.max(max_area, height[right]*(right-left));
	                 right--;
	             }            
	        }
	       return max_area;
	}

}

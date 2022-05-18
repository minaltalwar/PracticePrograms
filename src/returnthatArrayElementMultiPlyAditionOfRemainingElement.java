import java.util.Scanner;

public class returnthatArrayElementMultiPlyAditionOfRemainingElement {
	public static void main(String[] args)
    {
    
		 Scanner sc=new Scanner(System.in); 
	        int n = sc.nextInt();  
	        int[] my_array = new int[n];  
	        for(int i=0; i<n; i++){
	            my_array[i]=sc.nextInt();  
	        }
	      
	        int sum=0;
	        int arr_length = my_array.length;
	        for (int i = 0; i < arr_length; i++)
	            sum += my_array[i];
	        
	        System.out.println("sum: "+sum);
	        
	        for (int i = 0; i < arr_length; i++)
	            System.out.println(my_array[i]*(sum - my_array[i]));
	    }
	        
	        
	       
    
    }
	



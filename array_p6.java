
public class array_p6 {


// find the maximum element in java array
	public static void main(String[] args) {
	int []arr= {1,2,3,44,5,6,7,9};
	
         // Initialize maximum element
         int max = 0;
        
         // Traverse array elements from second and
         // compare every element with current max  
         for (int i = 0; i < arr.length; i++)
             if (arr[i] > max)
                 max = arr[i];
        
       System.out.println(max);
     }
	}



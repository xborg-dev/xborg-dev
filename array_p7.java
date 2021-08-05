
public class array_p7 {
// wheather an array is sorted or not
	public static void main(String[] args) {
		boolean isSorted=true;
		int arr[] = {2,3,62,6,9};
		for(int i=0;i<arr.length-1;i++) {
			if (arr[i] >arr[i+1]) {
				isSorted=false;
				break;
				
			}}
			if(isSorted) {
				System.out.println("sorted");
			}
			else {
				System.out.println("not sorted");
			}
		

	}

}

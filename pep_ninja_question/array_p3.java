package pep_ninja_question;
// calculate the avg marks from an array , containing marks of a students using for each loop
public class array_p3 {

	public static void main(String[] args) {
		int[] marks= {4,4,4,4,4};
		int sum=0;
		for(int elements: marks) {
			sum=sum+elements;
			
		}
	System.out.println("average ="+sum/marks.length);

	}

}

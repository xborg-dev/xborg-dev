package pep_ninja_question;
import java.lang.reflect.Array;

public class array_ex4 {

	public static void main(String[] args) {
//		int a[]= {1,2,3,4};
//		int b[]= {13,22,32,};
//		int c[]= {11,21,31,41};
//		
		
		int d[][]= {
				{1,2,3,4},
				{13,22,32},
				{11,21,31,41}
		         };
		
		//System.out.println(d[0][1]);
		// for printing all the elements
		
		for(int i=0;i<d.length;i++) {
			for(int j=0;j<d[i].length;j++) {
				System.out.print(" " +d[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
	}

}

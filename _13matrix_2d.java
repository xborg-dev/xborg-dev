package javaclass;

public class _13matrix_2d {

	public static void main(String[] args) {


//		int z[][]= {
//				
//				{1,2,3,4},
//				{5,2,3,4},
//             	{6,2,3,4},
//				{9,2,3,4}	
//		};
		
	//System.out.println(z[0][1]);
		
		//for printing all the elements:
//		
//		for(int i=0;i<4;i++) {
//			for (int j=0;j<4;j++) {
//				System.out.print(" "+z[i][j]);
//			}
//			System.out.println();
//		}
	//---------------------jagged array--------------------------------------------------------	
int z[][]= {
				
				{1,2,3,4},
				{5,2,4},
             	{6,2,4},
				{9,2,3,4,9}	
		};
		for(int i=0;i<z.length;i++) {
			for (int j=0;j<z[i].length;j++) {
				System.out.print(" "+z[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

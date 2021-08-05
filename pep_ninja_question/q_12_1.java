package pep_ninja_question;

public class q_12_1 {

	
		// TODO Auto-generated method stub
		public static long evenSumTillN(int n) {

	        // To store the sum.
			long sum = 0;

	        // Starting number.
			int i = 1;

			while (i <= n) {
				sum += i;
				i += 2;
			}

			return sum;
		
	
	}

}

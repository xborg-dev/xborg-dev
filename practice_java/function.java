package practice_java;

public class function {

	public static void main(String[] args) {

		class CountPrime {
			
			// function to count prime
			public int totalPrime(int s, int e) {
				int count = 0;
				boolean flag;
				
				for(int i = s; i <= e; i++) {
					
					// Skip 0 and 1 as they are 
		            // niether prime nor composite
					if(i == 1 || i == 0) {
						continue;
					}
					
					flag = true;
					for(int j  = 2; j <= i / 2; j++) {
						
						//if i is divisble by j set the flag value to 0 and break.
						if(i % j == 0) {
							flag = false;
							break;
						}
						
					}
					
					//if flag is 1 increase the value of count by 1.
					if(flag) {
						count++;
					}
				}
				
				return count;
			}
		}
				
					

	}

}

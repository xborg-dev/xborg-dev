package pep_ninja_question;
import java.util.Scanner;

public class q_2 {
    //all prime number till n
	// you have to print all prime number between a range
	public static void main(String[] args) {
		
Scanner Sc=new Scanner (System.in);

		int low=Sc.nextInt();
		int high=Sc.nextInt();
		for(int n=low;n<=high;n++) {
			int count=0;
			//try to devide n AND increase count
			
			for(int div=2;div*div<=n;div++) {
				if (n%div==0) {
					count ++;
					break;
					
				}
			}
			
			if (count==0) {
				System.out.println(n);
			}
			
		}
		
		
		
	}

}

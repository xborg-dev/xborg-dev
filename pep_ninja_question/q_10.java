package pep_ninja_question;
import java.util.Scanner;

public class q_10 {

	public static void main(String[] args) {
		// find the factorial of a number

		Scanner SC=new Scanner(System.in);
		int n=SC.nextInt();
		int fact=1;
		for (int i=1;i<=n;i++) {
			fact*=i;
			
		}
			System.out.println(fact);	
		
		
		
		
		
	}

}

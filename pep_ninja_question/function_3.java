package pep_ninja_question;
import java.util.Scanner;

public class function_3 {

	public static void main(String[] args) {
		Scanner SC =new Scanner (System.in);
		int n=SC.nextInt();
		CheckEvenOdd(n);
		

	}
	public static  void CheckEvenOdd(int x) {
		if(x%2==0) {
			System.out.println("number is even");
		}
		else {
			System.out.println("odd");
		}
	}

}

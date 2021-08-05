package pep_ninja_question;
import java.util.Scanner;

public class function_6 {
// print all divisor of a number
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int n=Sc.nextInt();
		printDivisor(n);

	}

public static void printDivisor(int x) {
	for(int i=1;i<=x;i++) {
		if(x%i==0) {
			System.out.println(i);
		}
	}
}
}

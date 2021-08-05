package pep_ninja_question;

import java.util.Scanner;

public class q_6 {
// Reverse a number
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int n=Sc.nextInt();
		
while(n>0) {
	int digit=n%10;
	n=n/10;
	System.out.println(digit);
}
	}

}

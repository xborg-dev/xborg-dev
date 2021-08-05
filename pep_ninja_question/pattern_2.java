package pep_ninja_question;

import java.util.Scanner;

public class pattern_2 {

	public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	int n=Sc.nextInt();
	for(int i=n;i>=1;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}

	}

}

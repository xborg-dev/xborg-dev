package pep_ninja_question;

import java.util.Scanner;

public class q_8 {
// Faernheit to celsius
	public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	float fahrenheit=Sc.nextFloat();
	Float celsius=((fahrenheit-32)*5)/9;
	System.out.println(celsius);

	}

}

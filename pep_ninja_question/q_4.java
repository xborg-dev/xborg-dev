package pep_ninja_question;

import java.util.Scanner;

// count the digit of a number
public class q_4 {

	public static void main(String[] args) {
		 
Scanner Sc=new Scanner(System.in);
int n=Sc.nextInt();

int digit=0;
while (n!=0) {
n=	n/10;
digit ++;

}
System.out.println(digit);





	}

}

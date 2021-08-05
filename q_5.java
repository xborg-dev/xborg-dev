package pep_ninja_question;

import java.util.Scanner;

public class q_5 {
// Digit of a number
	public static void main(String[] args) {
		
Scanner Sc=new Scanner(System.in);
int n=Sc.nextInt();
int nod=0;
int temp=n;
while(temp!=0) {
	temp=temp/10;
	nod++;
	}
	int div=(int)Math.pow(10,nod-1);
	while(div!=0) {
		
		int q=n/div;
		System.out.println(q);
	
	n=n%div;
	div=div/10;
	}
}
	}



package pep_ninja_question;

import java.util.Scanner;

// inverse a number serially number given without missisng 2341
public class q_7 {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int n=Sc.nextInt();
		
int inv=0;
int op=1;
while(n>0) {
int od=n%10;

	int id=op;
	int ip=od; 
	
	inv=inv+id*(int)Math.pow(10,ip-1);
	n=n/10;
	op++;
	
}
System.out.println(inv);
}

	}



package pep_ninja_question;

import java.util.Scanner;

public class q_9 {

	public static void main(String[] args) {
		// find the power of number  2^3=2*2*2=6
Scanner Sc =new Scanner(System.in);
int base=Sc.nextInt();
int power=Sc.nextInt();
int ans=1;
while (power>0) {
	ans*=base;
	power--;
}
	System.out.println(ans);	
		
	}

}

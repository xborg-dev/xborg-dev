package pep_ninja_question;

import java.util.Scanner;

//to check number is prime or not
public class function_4 {
 
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int n=Sc.nextInt();
		checkPrime(n);
		

	}
	public static void checkPrime(int x) {
		int count=0;

	
		for (int div=1;div<=x;div++) {
			if(x%div==0) {
				count ++;
				
			}}
			if (count==2) {
				System.out.println("prime");
			}
			else {
				System.out.println("not prime");
			}
		}
	
	
	
	

}

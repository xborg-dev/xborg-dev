package practice_java;

import java.util.Scanner;

public class q_6 {

	public static void main(String[] args) {
		 Scanner er = new Scanner(System.in);
		  System.out.println("Input the first number: ");
		  int n1 = er.nextInt();
		  System.out.println("Input the second number: ");
		  int n2 = er.nextInt();
		  int sum = n1 + n2;
		  int minus = n1 - n2;
		  
		  int multiply = n1 * n2;
		  int subtract = n1 + n2;
		  int divide = n1 / n2;
		  int rnums = n1 % n2;
		
		  //  System.out.printf(" Sum = %d\nMinus = %d\nMultiply = %d\nSubtract = %d\nDivide = %d\nRemainderOf2Numbers = %d\n ",sum,minus,multiply,subtract,divide,rnums);
		  
		  System.out.println(sum+"\n"+minus+"\n"+divide+"\n"+rnums+"\n");
		  
		  
		  
		 }
	

	}



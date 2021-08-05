package pep_ninja_question;
import java.util.Scanner;

public class q_13 {
// sum of odd number
	public static void main(String[] args) {
		int number, i = 1, oddSum = 0;
	Scanner	sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();	
		
		while(i <= number)
		{
			oddSum = oddSum + i; 
			i = i + 2;
		}
		System.out.println(oddSum);
	}


	}



package practice_java;

import java.util.Scanner;

public class q_11 {

	public static void main(String[] args) {
		//reverse a string
		//string input=input.nextLine();
		
Scanner sc=new Scanner(System.in);

		
char [] letter=sc.nextLine().toCharArray();

for(int i=letter.length-1;i>=0;i--) {
	System.out.println(letter[i]);
}
	
		
	}
}

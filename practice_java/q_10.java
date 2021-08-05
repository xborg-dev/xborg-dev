package practice_java;

import java.util.Scanner;

public class q_10 {

	public static void main(String[] args) {
Scanner sc=new Scanner (System.in);


int n=sc.nextInt();
int sum=0;
while(n>0) {
	int temp=n%10;
	sum=sum+temp;
	n=n/10;
	
}
			
System.out.println(sum);

	}
}

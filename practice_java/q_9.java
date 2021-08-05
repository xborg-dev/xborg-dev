package practice_java;

import java.util.Scanner;

public class q_9 {

	public static void main(String[] args) {
		//compare two numbers
Scanner Sc=new Scanner (System.in);

int n1=Sc.nextInt();
int n2=Sc.nextInt();
if(n1==n2) {
	System.out.println(n1==n2);
}

else if(n1>n2) {
	System.out.println("n1 is greater");
}
else if(n1<n2) {
	System.out.println("n2 is greater");
}
else {
	System.out.println("not true");
}






	}

}

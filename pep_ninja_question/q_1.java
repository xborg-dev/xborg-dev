package pep_ninja_question;

import java.util.Scanner;

//is a number prime
//constraints   5-->> 2,4,5,7  output-->prime,n.prime,prime,prime
public class q_1 {

	public static void main(String[] args) {
   Scanner Sc=new Scanner(System.in);
   int t=Sc.nextInt();
   for(int i=0;i<t;i++) {
	   int n=Sc.nextInt();
   
int count=0;
for(int div=1;div<=n;div++) {
	if(n%div==0) {
		count++;
		
	}
}
 if (count==2)  {
	 System.out.println("prime");
 }
   
 else {
	 System.out.println("not prime");
 }
   
   
   
   } 
   
   
	}

	}

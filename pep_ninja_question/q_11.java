package pep_ninja_question;

import java.util.Scanner;

public class q_11 {

	public static void main(String[] args) {
		// print all even number till n
      Scanner Sc=new Scanner(System.in);
      int n=Sc.nextInt();
//     for(int i=1;i<=n;i++) {
//    	 if (i%2==0) {
//    		 System.out.println(i);
//    	
    		
  //  	 }
    	 
 //    }
	int i=2;
      while(i<=n) {
    	  System.out.println(i);
    	  i+=2;
      }
      
	}

}

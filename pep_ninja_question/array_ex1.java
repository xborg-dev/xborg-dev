package pep_ninja_question;
import java.util.Scanner;

public class array_ex1 {

	public static void main(String[] args) {
		// array input
 Scanner Sc=new Scanner (System.in);
 int n=Sc.nextInt();
 
 int[] arr=new int[n];
 
 for(int i=0;i<n;i++) {
	arr [i]=Sc.nextInt();
	
 }
 for(int i=0;i<arr.length;i++) {
	 System.out.println(arr[i]);
 }
	}

}

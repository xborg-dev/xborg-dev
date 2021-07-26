package javaclass;

public class _15exceptionhandling {

	public static void main(String[] args) {
		int a[]=new int [3];
		try {
			System.out.println(a[4]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("error");
			System.out.println(e.getLocalizedMessage());
		}
System.out.println("last line");
	}

}


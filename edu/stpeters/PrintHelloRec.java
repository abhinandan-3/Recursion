package edu.stpeters;

public class PrintHelloRec {

	public static void main(String[] args) {
		int n=5;
		printhello(n);
	}

	private static void printhello(int n) {
		if(n!=0) {
			System.out.println("hello");
			printhello(n-1);
		}
		
	}

}

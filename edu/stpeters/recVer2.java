package edu.stpeters;

public class recVer2 {

	public static void main(String[] args) {
		int n=5;
		 int res=factorial(n);
		System.out.println(res);
	}

	private static int factorial(int n) {
		return n > 1 ? n * factorial(n-1):1;
	}

}

package edu.stpeters;

public class RecursionDemo {

	public static void main(String[] args) {
		//n!
		// 1 2 3 4 5 6 7 ....n
		int n=5;
		 int res=factorial(n);
		System.out.println(res);
		}

	private static int factorial(int n) {
		if(n==2) {
			return 2;
		}
		else {
			return n*factorial(n-1);
		}
	}
	}



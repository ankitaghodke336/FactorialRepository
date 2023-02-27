package com.acts;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number : ");
		int num = scanner.nextInt();
		int factorial = fact(num);
		System.out.println( "factorial of " + num + " is : " + factorial);
	}

	public static int fact(int num) {
		if(num == 0 ) {
			return 1;
		}else {
			int result = num * fact (num - 1);
			return result;
		}
	}
	

}

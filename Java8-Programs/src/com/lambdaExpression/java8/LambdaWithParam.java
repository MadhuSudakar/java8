package com.lambdaExpression.java8;

import java.util.Scanner;

@FunctionalInterface
interface AddNumbers {
	int a=10;
	public int addValue(int a);
}

public class LambdaWithParam {

	public static void main(String[] args) {

		AddNumbers result = (num) -> {
			return num + 5;
		};

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		
		System.out.println(result.addValue(a));
	}

}

package com.lambdaExpression.java8;

@FunctionalInterface
interface Hello {
	public String sayHello();
}

public class LambdaWithNoParam {

	public static void main(String[] args) {
		Hello msg = () -> {
			return "Hello World, This is Lambda Expression With No Parameter";
		};

		System.out.println(msg.sayHello());
	}

}

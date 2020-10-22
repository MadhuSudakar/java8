package com.lambdaExpression.java8;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionProg {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("Bigg");
		list.add("Boss");
		list.add("Session4");
		
		//list.forEach(names -> System.out.println(names));
		list.forEach(System.out::println);
	}

}

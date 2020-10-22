package com.streamapi.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNotNullProg {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Madhu Sudakar", null, "Varshith", null, "Sree Latha");

		List<String> result = list.stream().filter(str -> str!=null).collect(Collectors.toList());
		result.forEach(System.out::println);

	}
}

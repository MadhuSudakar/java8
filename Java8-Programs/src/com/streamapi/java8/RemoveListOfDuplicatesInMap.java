package com.streamapi.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveListOfDuplicatesInMap {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Balaya");
		list.add("Chiru");
		list.add("Nag");
		list.add("Venki");
		list.add("Ntr");
		list.add("Balaya");
		System.out.println("With duplicates " + list);

		Map<String, Long> result = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("WithOut duplicates " + result);

	}
}

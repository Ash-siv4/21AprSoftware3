package com.qa.intermediate2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {

		//-------------------- OPTIONALS --------------------
		//Example 1
		String str = "hi" +"bye";
		System.out.println(str.toUpperCase()); //HIBYE
		String str2 = null;
		System.out.println(Optional.ofNullable(str2));//np exception
		//Example 2
		String item;
		if (Math.random() >= 0.5) {
			item = "hi";
		} else {
			item = null;
		}
		System.out.println(Optional.ofNullable(item));
		Optional<String> ret = Optional.ofNullable(item);
		System.out.println(ret.isPresent());// boolean
		System.out.println(ret.orElse("nothing"));

		//-------------------- STREAMS --------------------
		// streams - process a collection of objects in a pipeline manner
		// for-each
		List<Integer> list = Arrays.asList(2, 4, 6, 10);
		list.stream().forEach(x -> System.out.println(x * x * x));
		// map
		List<Integer> number = Arrays.asList(2, 4, 6, 10);
		List<Integer> cube = number.stream().map(x -> x * x * x).collect(Collectors.toList());
		System.out.println(cube);
		// filter
		List<String> list1 = Arrays.asList("Winnie", "Piglet", "Tony", "Tim");
		List<String> res = list1.stream().filter(x -> x.startsWith("T")).collect(Collectors.toList());
		System.out.println(res);
		// sorted
		List<String> result = list1.stream().sorted().collect(Collectors.toList());
		System.out.println(result);
		// reduce
		List<Integer> num = Arrays.asList(12, 4, 11, 24, 3);
		// filters out the even numbers then sums them up so here it is only 11+3=14
		int odd = num.stream().filter(x -> x % 2 == 1).reduce((a, b) -> a + b).get();
		System.out.println(odd);
		
		//-------------------- LAMBDAS --------------------

		// lambdas - functions - parameters, body
		// methods - name, parameters, body, return type
		//Example 1
		List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		// (par1, par2) -> one line code
		nums.forEach(par1 -> System.out.println(par1 * par1));
		//Example 2 - with a functional interface
		Lambda add = (a,b) -> a + b;
		Lambda multiply = (a,b) -> a * b;
		Lambda val = (a,b) -> (a * b)+21;
		System.out.println(add.calc(1, 2));
		System.out.println(multiply.calc(1, 2));
		System.out.println(val.calc(1, 2));
		// (par1, par2) -> {many lines code}
		Lambda temp = (a,b) -> {
			if(a<30)
				return a;
			else
				return b;
		};
		
		System.out.println(temp.calc(6, 2));

		//-------------------- Hash Set & Hash Map --------------------
		HashSets.hashSet();
		HashMaps.hashmap();
	}

}

package ru.practice.Tasks20_29;

import java.util.stream.Stream;

/**
 * Трансформирование строк.
 * Написать несколько фрагментов кода с преобразованием строки в другую строку.
 */
public class StringTransformation {
	public static void main(String[] args) {
		String resultMap1 = Stream.of("hello")
				.map(s -> s + " world")
				.findFirst()
				.get();

		String resultMap2 = Stream.of("gooool! ")
				.map(String::toUpperCase)
				// JDK 11
				//.map(s -> s.repeat (2))
				.map(s -> s.replaceAll("O", "0000"))
				.findFirst()
				.get();

		System.out.println(resultMap1);
		System.out.println(resultMap2);

//		JDK 12
//		String result1 = "hello".transform(s -> s + " world");
//		String result2 = "gooool! ".transform(String::toUpperCase)
//				.transform(s -> s.repeat(2))
//				.transform(s -> s.replaceAll("0", "0000"));
	}
}

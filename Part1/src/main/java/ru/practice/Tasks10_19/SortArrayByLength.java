package ru.practice.Tasks10_19;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Сортировка массива строк по длине.
 * Написать программу, которая сортирует заданный массив по длине строк.
 */
public class SortArrayByLength {

	public static String[] strings = {
			"sfdfsdf",
			"sfgsdgsgsg",
			"vnj",
			"fffffffffffffffff"
	};

	public static void main(String[] args) {
		System.out.println(Arrays.toString(sortArrayByLengthVar2(strings)));

		sortArrayByLengthVar1(strings);
		System.out.println(Arrays.toString(strings));

	}

	private static void sortArrayByLengthVar1(String[] strs) {
		Arrays.sort(strs, (String s1, String s2) -> Integer.compare(s1.length(), s2.length()));
	}

	private static String[] sortArrayByLengthVar2(String[] strs) {
		return Arrays.stream(strs)
				.sorted(Comparator.comparingInt(String::length))
				.toArray(String[]::new);
	}
}

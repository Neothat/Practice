package ru.practice.Tasks1_9;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Инвертирование букв и слов.
 * Написать программу, которая инвертирует буквы каждого слова, и программу,
 * которая инвертирует буквы каждого слова и сами слова.
 */
public class Coup {
	private static final String STRING = "One Two Three";
	private static final String WHITESPACE = " ";
	private static final Pattern PATTERN = Pattern.compile(" +");

	public static void main(String[] args) {
		System.out.println(reverseWordVar1(STRING));
		System.out.println(reverseWordVar2(STRING));

		System.out.println(reverse(STRING));
	}

	private static String reverseWordVar1(String str) {
		String[] words = str.split(WHITESPACE);
		StringBuilder reversedString = new StringBuilder();

		for (String word : words) {
			StringBuilder reverseWord = new StringBuilder();

			for (int i = word.length() - 1; i >= 0; i--) {
				reverseWord.append(word.charAt(i));
			}

			reversedString.append(reverseWord).append(WHITESPACE);
		}

		return reversedString.toString();
	}

	private static String reverseWordVar2(String str) {
		return PATTERN.splitAsStream(str)
				.map(w -> new StringBuilder(w).reverse())
				.collect(Collectors.joining(" "));
	}

	private static String reverse(String str) {
		return new StringBuilder(str).reverse().toString();
	}
}
